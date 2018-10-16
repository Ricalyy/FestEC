package com.diabin.festec.example;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.diabin.latte.delegates.LatteDelegate;
import com.diabin.latte.net.RestClient;
import com.diabin.latte.net.callback.IError;
import com.diabin.latte.net.callback.IFailure;
import com.diabin.latte.net.callback.ISuccess;

import org.jetbrains.annotations.Nullable;

/**
 * Created by huangchencong on 2018/8/26.
 */

public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        testRestClient();
    }

    private void testRestClient() {
        RestClient.builder()
                .url("https://127.0.0.1/index")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Toast.makeText(getContext(), response, Toast.LENGTH_LONG).show();
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .build()
                .get();
    }
}
