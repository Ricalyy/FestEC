package com.diabin.latte.delegates.web.event;

import android.content.Context;

import com.diabin.latte.delegates.LatteDelegate;

/**
 * Created by 黄陈聪 on 2018/10/17.
 */
public abstract class Event implements IEvent {

    private Context mContent = null;
    private String mAction = null;
    private LatteDelegate mDelegate =null;
    private String mUrl = null;

    public Context getContext() {
        return mContent;
    }

    public void setContext(Context mContext) {
        this.mContent = mContext;
    }

    public String getAction() {
        return mAction;
    }

    public void setAction(String mAction) {
        this.mAction = mAction;
    }

    public LatteDelegate getDelegate() {
        return mDelegate;
    }

    public void setDelegate(LatteDelegate mDelegate) {
        this.mDelegate = mDelegate;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
