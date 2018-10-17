package com.diabin.latte.delegates.web.event;

import android.widget.Toast;

/**
 * Created by 黄陈聪 on 2018/10/17.
 */
public class TestEvent extends Event {
    @Override
    public String execute(String params) {
        Toast.makeText(getContext(), params, Toast.LENGTH_LONG).show();
        return null;
    }
}
