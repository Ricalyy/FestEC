package com.diabin.festec.example.event;

import android.webkit.WebView;
import android.widget.Toast;

import com.diabin.latte.delegates.web.event.Event;

/**
 * Created by 黄陈聪 on 2018/10/17.
 */
public class TestEvent extends Event {
    @Override
    public String execute(String params) {
        Toast.makeText(getContext(), params, Toast.LENGTH_LONG).show();
        getWebView().post(new Runnable() {
            final WebView webView = getWebView();

            @Override
            public void run() {
                webView.evaluateJavascript("nativeCall();", null);
            }
        });
        return null;
    }
}
