/*
 * Aurora Store
 * Copyright (C) 2019, Rahul Kumar Patel <whyorean@gmail.com>
 *
 * Aurora Store is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Aurora Store is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Aurora Store.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package com.aurora.store;

public class Constants {
    public static final String SHARED_PREFERENCES_KEY = "com.aurora.store";
    public static final String SERVICE_PACKAGE = "com.aurora.services";
    public static final String APP_DETAIL_URL = "https://play.google.com/store/apps/details?id=";
    public static final String APP_ICON_URL = "https://gitlab.com/AuroraOSS/AuroraStore/raw/master/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png";
    public static final String UPDATE_URL = "https://gitlab.com/AuroraOSS/AuroraStore/raw/master/updates.json";
    public static final String DISPENSER_PRIMARY = "http://auroraoss.com:8080";

    public static final String INTENT_DEVICE_NAME = "INTENT_DEVICE_NAME";
    public static final String INTENT_DEVICE_INDEX = "INTENT_DEVICE_INDEX";
    public static final String INTENT_FRAGMENT_POSITION = "INTENT_FRAGMENT_POSITION";
    public static final String INTENT_PACKAGE_NAME = "INTENT_PACKAGE_NAME";

    public static final String INT_EXTRA = "INT_EXTRA";
    public static final String FLOAT_EXTRA = "FLOAT_EXTRA";
    public static final String STRING_EXTRA = "STRING_EXTRA";

    public static final String BUILD_DEVICE = "Build.DEVICE";
    public static final String BUILD_MANUFACTURER = "Build.MANUFACTURER";
    public static final String BUILD_HARDWARE = "Build.HARDWARE";
    public static final String TOP = "0_CATEGORY_TOP";
    public static final String PUB_PREFIX = "pub:";
    public static final String TAG = "Aurora Store";
    public static final String FILES = "Files";

    public static final String CATEGORY_APPS = "APPLICATION";
    public static final String CATEGORY_GAME = "GAME";
    public static final String CATEGORY_FAMILY = "FAMILY";

    public static final String TOP_APPS = "TOP_APPS";
    public static final String TOP_GAME = "TOP_GAME";
    public static final String TOP_FAMILY = "TOP_FAMILY";

    public static final String NOTIFICATION_CHANNEL_ALERT = "NOTIFICATION_CHANNEL_ALERT";
    public static final String NOTIFICATION_CHANNEL_GENERAL = "NOTIFICATION_CHANNEL_GENERAL";

    public static final String PRIVILEGED_EXTENSION_PACKAGE_NAME = "com.aurora.services";
    public static final String PRIVILEGED_EXTENSION_PACKAGE_NAME_FDROID = "org.fdroid.fdroid.privileged";
    public static final String PRIVILEGED_EXTENSION_SERVICE_INTENT = "com.aurora.services.IPrivilegedService";

    public static final String PREFERENCE_THEME = "PREFERENCE_THEME";
    public static final String PREFERENCE_DEFAULT_TAB = "PREFERENCE_DEFAULT_TAB";
    public static final String PREFERENCE_UI_CARD_STYLE = "PREFERENCE_UI_CARD_STYLE";
    public static final String PREFERENCE_FEATURED_SNAP = "PREFERENCE_FEATURED_SNAP";
    public static final String PREFERENCE_SEARCH_PACKAGE = "PREFERENCE_SEARCH_PACKAGE";
    public static final String PREFERENCE_DO_NOT_SHOW_INTRO = "PREFERENCE_DO_NOT_SHOW_INTRO";
    public static final String PREFERENCE_INCLUDE_SYSTEM = "PREFERENCE_INCLUDE_SYSTEM";
    public static final String PREFERENCE_SPOOF_LOCALE = "PREFERENCE_SPOOF_LOCALE";
    public static final String PREFERENCE_SPOOF_DEVICE = "PREFERENCE_SPOOF_DEVICE";
    public static final String PREFERENCE_SPOOF_GEOLOCATION = "PREFERENCE_SPOOF_GEOLOCATION";
    public static final String PREFERENCE_BLACKLIST_PACKAGE_LIST = "PREFERENCE_BLACKLIST_PACKAGE_LIST";
    public static final String PREFERENCE_IGNORE_PACKAGE_LIST = "PREFERENCE_IGNORE_PACKAGE_LIST";
    public static final String PREFERENCE_FILTER_APPS = "PREFERENCE_FILTER_APPS";
    public static final String PREFERENCE_FILTER_GOOGLE = "PREFERENCE_FILTER_GOOGLE";
    public static final String PREFERENCE_FILTER_F_DROID = "PREFERENCE_FILTER_F_DROID";
    public static final String PREFERENCE_FILTER_SEARCH = "PREFERENCE_FILTER_SEARCH";
    public static final String PREFERENCE_INSTALLATION_AUTO = "PREFERENCE_INSTALLATION_AUTO";
    public static final String PREFERENCE_INSTALLATION_TYPE = "PREFERENCE_INSTALLATION_TYPE";
    public static final String PREFERENCE_INSTALLATION_METHOD = "PREFERENCE_INSTALLATION_METHOD";
    public static final String PREFERENCE_INSTALLATION_DELETE = "PREFERENCE_INSTALLATION_DELETE";
    public static final String PREFERENCE_LAUNCH_SERVICES = "PREFERENCE_LAUNCH_SERVICES";
    public static final String PREFERENCE_DOWNLOAD_DIRECTORY = "PREFERENCE_DOWNLOAD_DIRECTORY";
    public static final String PREFERENCE_DOWNLOAD_WIFI = "PREFERENCE_DOWNLOAD_WIFI";
    public static final String PREFERENCE_DOWNLOAD_ACTIVE = "PREFERENCE_DOWNLOAD_ACTIVE";
    public static final String PREFERENCE_DOWNLOAD_DEBUG = "PREFERENCE_DOWNLOAD_DEBUG";
    public static final String PREFERENCE_DOWNLOAD_STRATEGY = "PREFERENCE_DOWNLOAD_STRATEGY";
    public static final String PREFERENCE_DOWNLOAD_DELTAS = "PREFERENCE_DOWNLOAD_DELTAS";
    public static final String PREFERENCE_DOWNLOAD_INTERNAL = "PREFERENCE_DOWNLOAD_INTERNAL";
    public static final String PREFERENCE_NOTIFICATION_TOGGLE = "PREFERENCE_NOTIFICATION_TOGGLE";
    public static final String PREFERENCE_NOTIFICATION_PRIORITY = "PREFERENCE_NOTIFICATION_PRIORITY";
    public static final String PREFERENCE_NOTIFICATION_PROVIDER = "PREFERENCE_NOTIFICATION_PROVIDER";
    public static final String PREFERENCE_FAVOURITE_LIST = "PREFERENCE_FAVOURITE_LIST";
    public static final String PREFERENCE_FAVOURITE_PACKAGE_LIST = "PREFERENCE_FAVOURITE_PACKAGE_LIST";
    public static final String PREFERENCE_ENABLE_PROXY = "PREFERENCE_ENABLE_PROXY";
    public static final String PREFERENCE_PROXY_HOST = "PREFERENCE_PROXY_HOST";
    public static final String PREFERENCE_PROXY_PORT = "PREFERENCE_PROXY_PORT";
    public static final String PREFERENCE_PROXY_TYPE = "PREFERENCE_PROXY_TYPE";
    public static final String PREFERENCE_LOCALE_CUSTOM = "PREFERENCE_LOCALE_CUSTOM";
    public static final String PREFERENCE_LOCALE_LANG = "PREFERENCE_LOCALE_LANG";
    public static final String PREFERENCE_LOCALE_LIST = "PREFERENCE_LOCALE_LIST";
    public static final String PREFERENCE_LOCALE_COUNTRY = "PREFERENCE_LOCALE_COUNTRY";
    public static final String PREFERENCE_UPDATES_INTERVAL = "PREFERENCE_UPDATES_INTERVAL";
    public static final String PREFERENCE_UPDATES_AUTO = "PREFERENCE_UPDATES_AUTO";
    public static final String PREFERENCE_UPDATES_EXTENDED = "PREFERENCE_UPDATES_EXTENDED";
    public static final String PREFERENCE_ENABLE_CUSTOM_TOKENIZER = "PREFERENCE_ENABLE_CUSTOM_TOKENIZER";
    public static final String PREFERENCE_CUSTOM_TOKENIZER_URL = "PREFERENCE_CUSTOM_TOKENIZER_URL";
    public static final String PREFERENCE_TOKENIZER_URL = "PREFERENCE_TOKENIZER_URL";
    public static final String PREFERENCE_CACHE_STRATEGY = "PREFERENCE_CACHE_STRATEGY";
    public static final String PREFERENCE_CLEAN_JUNK = "PREFERENCE_CLEAN_JUNK";
    public static final String PREFERENCE_INSTALLATION_ABANDON_SESSION = "PREFERENCE_INSTALLATION_ABANDON_SESSION";
    public static final String PREFERENCE_INSTALLATION_PROFILE = "PREFERENCE_INSTALLATION_PROFILE";

    public static final String PREFERENCE_CACHE_DATE = "PREFERENCE_CACHE_DATE";
    public static final String PREFERENCE_SELF_UPDATE_DATE = "PREFERENCE_SELF_UPDATE_DATE";
    public static final String PREFERENCE_SELF_UPDATE = "PREFERENCE_SELF_UPDATE";

    public static final String FRAGMENT_NAME = "FRAGMENT_NAME";
    public static final String FRAGMENT_ABOUT = "FRAGMENT_ABOUT";
    public static final String FRAGMENT_ACCOUNTS = "FRAGMENT_ACCOUNTS";
    public static final String FRAGMENT_BLACKLIST = "FRAGMENT_BLACKLIST";
    public static final String FRAGMENT_FAV_LIST = "FRAGMENT_FAV_LIST";
    public static final String FRAGMENT_SPOOF = "FRAGMENT_SPOOF";
    public static final String FRAGMENT_SPOOF_DEVICE = "FRAGMENT_SPOOF_DEVICE";
    public static final String FRAGMENT_SPOOF_LOCALE = "FRAGMENT_SPOOF_LOCALE";
    public static final String FRAGMENT_SPOOF_GEOLOCATION = "FRAGMENT_SPOOF_GEOLOCATION";

    public static final String DOWNLOAD_PACKAGE_NAME = "DOWNLOAD_PACKAGE_NAME";
    public static final String DOWNLOAD_DISPLAY_NAME = "DOWNLOAD_DISPLAY_NAME";
    public static final String DOWNLOAD_VERSION_NAME = "DOWNLOAD_VERSION_NAME";
    public static final String DOWNLOAD_VERSION_CODE = "DOWNLOAD_VERSION_CODE";
    public static final String DOWNLOAD_ICON_URL = "DOWNLOAD_ICON_URL";
}
