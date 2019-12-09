package com.aurora.store.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.aurora.store.R;
import com.aurora.store.task.AuthTask;
import com.aurora.store.utility.Accountant;
import com.aurora.store.utility.NetworkUtil;
import com.aurora.store.utility.Util;

import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class GoogleLoginActivity extends Activity {

    public static final String EMBEDDED_SETUP_URL = "https://accounts.google.com/EmbeddedSetup";
    public static final String OAUTH_TOKEN = "oauth_token";

    @BindView(R.id.webview)
    WebView webview;

    private CookieManager cookieManager = CookieManager.getInstance();
    private CompositeDisposable disposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        if (NetworkUtil.isConnected(this))
            setupWebView();
        else {
            Toast.makeText(this, getString(R.string.error_no_network), Toast.LENGTH_LONG).show();
            finish();
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void setupWebView() {
        cookieManager.removeAllCookies(null);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            webview.getSettings().setSafeBrowsingEnabled(false);
        }
        webview.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                String cookies = CookieManager.getInstance().getCookie(url);
                Map<String, String> cookieMap = Util.parseCookieString(cookies);
                if (!cookieMap.isEmpty() && cookieMap.get(OAUTH_TOKEN) != null) {
                    String oauth_token = cookieMap.get(OAUTH_TOKEN);
                    webview.evaluateJavascript("(function() { return document.getElementById('profileIdentifier').innerHTML; })();",
                            email -> {
                                generateTokens(email, oauth_token);
                            });
                }
            }
        });
        webview.getSettings().setAllowContentAccess(true);
        webview.getSettings().setDatabaseEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.getSettings().setJavaScriptEnabled(true);
        cookieManager.acceptThirdPartyCookies(webview);
        cookieManager.setAcceptThirdPartyCookies(webview, true);
        webview.loadUrl(EMBEDDED_SETUP_URL);
    }

    private void generateTokens(String email, String token) {
        disposable.add(Observable.fromCallable(() -> new AuthTask(this).getAASToken(email, token))
                .map(aas_token -> new AuthTask(this).getAuthToken(email, aas_token))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(success -> {
                    if (success) {
                        Toast.makeText(this, getText(R.string.toast_login_success), Toast.LENGTH_SHORT).show();
                        Accountant.setAnonymous(this, false);
                        Intent intent = new Intent(this, AuroraActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation(this);
                        startActivity(intent, activityOptions.toBundle());
                        finish();
                    } else {
                        Toast.makeText(this, getText(R.string.toast_login_failed), Toast.LENGTH_LONG).show();
                    }
                }, err -> {
                    err.printStackTrace();
                    Toast.makeText(this, getText(R.string.toast_login_failed), Toast.LENGTH_LONG).show();
                }));
    }
}
