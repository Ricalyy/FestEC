package com.diabin.latte.delegates.web.client;

import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.diabin.latte.delegates.web.WebDelegate;
import com.diabin.latte.delegates.web.route.Router;

/**
 * Created by huangchencong on 2018/10/17.
 */

public class WebViewClientImpl extends WebViewClient {

    private final WebDelegate DELEGATE;

    public WebViewClientImpl(WebDelegate delegate) {
        this.DELEGATE = delegate;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return Router.getInstance().handleWebUrl(DELEGATE, url);
    }
}
