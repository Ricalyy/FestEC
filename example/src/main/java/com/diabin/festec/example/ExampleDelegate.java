package com.diabin.festec.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.diabin.latte.delegate.LatteDelegate;

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

    }
}
