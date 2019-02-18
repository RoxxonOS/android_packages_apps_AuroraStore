package com.aurora.store.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aurora.store.R;
import com.aurora.store.adapter.ClusterAppsAdapter;
import com.aurora.store.model.App;
import com.aurora.store.task.ClusterApps;
import com.aurora.store.utility.Log;

import java.util.List;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ClusterAppsView extends RelativeLayout {


    @BindView(R.id.cluster_name)
    TextView clusterName;
    @BindView(R.id.cluster_recycler)
    RecyclerView recyclerView;

    Context context;
    String label;
    String clusterUrl;

    private CompositeDisposable disposable = new CompositeDisposable();

    public ClusterAppsView(Context context, String label, String clusterUrl) {
        super(context);
        this.context = context;
        this.label = label;
        this.clusterUrl = clusterUrl;
        init();
    }

    public ClusterAppsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        View view = inflate(context, R.layout.view_cluster_apps, this);
        clusterName = view.findViewById(R.id.cluster_name);
        recyclerView = view.findViewById(R.id.cluster_recycler);
        clusterName.setText(label);
        fetchCategoryApps();
    }

    public void fetchCategoryApps() {
        disposable.add(Observable.fromCallable(() ->
                new ClusterApps(getContext()).getApps(clusterUrl))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe((appList) -> {
                    if (!appList.isEmpty())
                        setupRecycler(appList);
                }, err -> {
                    Log.e(err.getMessage());
                }));
    }

    private void setupRecycler(List<App> appList) {
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
        ClusterAppsAdapter appsAdapter = new ClusterAppsAdapter(context, appList);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R.anim.anim_slideright));
        recyclerView.setAdapter(appsAdapter);
    }
}
