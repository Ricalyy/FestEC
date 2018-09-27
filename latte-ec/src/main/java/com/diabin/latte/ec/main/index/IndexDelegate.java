package com.diabin.latte.ec.main.index;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.diabin.latte.delegate.bottom.BottomItemDelegate;
import com.diabin.latte.ec.R;
import com.diabin.latte.ec.R2;
import com.joanzapata.iconify.widget.IconTextView;

import butterknife.BindView;

/**
 * Created by 黄陈聪 on 2018/9/27.
 */
public class IndexDelegate extends BottomItemDelegate {

    @BindView(R2.id.rv_index)
    RecyclerView mRecyclerView = null;
    @BindView(R2.id.srl_index)
    SwipeRefreshLayout mRefreshLayout = null;
    @BindView(R2.id.tb_index)
    Toolbar mToolbar = null;
    @BindView(R2.id.icon_index_scan)
    IconTextView mIconScan = null;
    @BindView(R2.id.et_search_view)
    AppCompatEditText mSearchView = null;

    @Override
    public Object setLayout() {
        return R.layout.delegate_index;
    }

    @Override
    public void onBindView(Bundle savedInstanceState, View rootView) {

    }
}
