package com.diabin.latte.ui.refresh;

import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.Toast;

import com.diabin.latte.app.Latte;
import com.diabin.latte.net.RestClient;
import com.diabin.latte.net.callback.ISuccess;

/**
 * Created by 黄陈聪 on 2018/9/27.
 */
public class RefreshHandler implements SwipeRefreshLayout.OnRefreshListener {

    private final SwipeRefreshLayout REFRESH_LAYOUT;

    public RefreshHandler(SwipeRefreshLayout REFRESH_LAYOUT) {
        this.REFRESH_LAYOUT = REFRESH_LAYOUT;
        REFRESH_LAYOUT.setOnRefreshListener(this);
    }

    private void refresh() {
        REFRESH_LAYOUT.setRefreshing(true);
        Latte.getHandler().postDelayed(new Runnable() {
            @Override
            public void run() {
                REFRESH_LAYOUT.setRefreshing(false);
            }
        }, 2000);
    }

    public void firstPage(String url) {
        RestClient.builder()
                .url(url)
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
//                        Toast.makeText(Latte.getApplication(), response, Toast.LENGTH_LONG).show();
                    }
                })
                .build()
                .get();

    }

    @Override
    public void onRefresh() {
        refresh();
    }
}
