package com.diabin.festec.example;

import android.app.Application;

import com.diabin.latte.app.Latte;
import com.diabin.latte.ec.database.DataBaseManager;
import com.diabin.latte.ec.icon.FontEcModule;
import com.diabin.latte.net.interceptors.DebugInterceptor;
import com.facebook.stetho.Stetho;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

/**
 * Created by huangchencong on 2018/8/25.
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("https://127.0.0.1")
                .withInterceptor(new DebugInterceptor("index", R.raw.good))
                .withInterceptor(new DebugInterceptor("user", R.raw.user))
                .withInterceptor(new DebugInterceptor("sort_list_data", R.raw.sort_list_data))
                .withInterceptor(new DebugInterceptor("sort_content_list", R.raw.sort_content_list))
                .configure();
        initStetho();
        DataBaseManager.getInstance().init(this);
    }

    private void initStetho() {
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build()
        );
    }
}
