package com.diabin.latte.delegates.web;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by huangchencong on 2018/10/17.
 */

public interface IWebViewInitializer {

    WebView initWebView(WebView webView);

    WebViewClient initWebViewClient();

    WebChromeClient initWebChromeClient();
}
