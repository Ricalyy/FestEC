package com.diabin.festec.example;

import android.app.Application;
import android.util.Log;

import com.diabin.latte.app.Latte;
import com.diabin.latte.ec.icon.FontEcModule;
import com.diabin.latte.net.interceptors.DebugInterceptor;
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
                .withApiHost("http://127.0.0.1/")
                .withInterceptor(new DebugInterceptor("index", R.raw.test))
                .configure();
    }
}
