package com.diabin.festec.example;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.widget.Toast;

import com.diabin.latte.activities.ProxyActivity;
import com.diabin.latte.delegate.LatteDelegate;
import com.diabin.latte.ec.launcher.LauncherDelegate;
import com.diabin.latte.ec.launcher.LauncherScrollDelegate;
import com.diabin.latte.ec.sign.ISignListener;
import com.diabin.latte.ec.sign.SignInDelegate;
import com.diabin.latte.ec.sign.SignUpDelegate;

import org.jetbrains.annotations.Nullable;

public class ExampleActivity extends ProxyActivity implements ISignListener {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new SignInDelegate();
    }

    @Override
    public void onSignInSuccess() {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSignUpSuccess() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
    }

}
