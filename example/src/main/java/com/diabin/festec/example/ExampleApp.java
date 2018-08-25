package com.diabin.festec.example;

import android.app.Application;

import com.diabin.latte.app.Latte;

/**
 * Created by huangchencong on 2018/8/25.
 */

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this).withApiHost("http://127.0.0.1/").configure();
    }
}
