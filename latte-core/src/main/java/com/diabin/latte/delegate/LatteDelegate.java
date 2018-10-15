package com.diabin.latte.delegate;

/**
 * Created by huangchencong on 2018/8/26.
 */

public abstract class LatteDelegate extends PermissionCheckerDelegate {
    public <T extends LatteDelegate> T getParentDelegate() {
        return (T) getParentFragment();
    }
}
