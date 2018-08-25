package com.diabin.festec.example;

import com.diabin.latte.activities.ProxyActivity;
import com.diabin.latte.delegate.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
