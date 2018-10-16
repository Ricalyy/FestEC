package com.diabin.latte.delegates.web;

import com.alibaba.fastjson.JSON;

/**
 * Created by huangchencong on 2018/10/17.
 */

public class LatteWebInterface {
    private final WebDelegate DELEGATE;

    private LatteWebInterface(WebDelegate delegate) {
        this.DELEGATE = delegate;
    }

    static LatteWebInterface create(WebDelegate delegate) {
        return new LatteWebInterface(delegate);
    }

    public String event(String params) {
        final String action = JSON.parseObject(params).getString("action");
        return null;
    }
}
