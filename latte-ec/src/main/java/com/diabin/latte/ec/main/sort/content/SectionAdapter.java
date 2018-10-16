package com.diabin.latte.ec.main.sort.content;

import android.support.v7.widget.AppCompatImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.diabin.latte.ec.R;

import java.util.List;

/**
 * Created by 黄陈聪 on 2018/10/16.
 */
public class SectionAdapter extends BaseSectionQuickAdapter<SectionBean, BaseViewHolder> {

//    private static final RequestOptions OPTIONS = new RequestOptions()
//            .diskCacheStrategy(DiskCacheStrategy.ALL)
//            .dontAnimate();

    public SectionAdapter(int layoutResId, int sectionHeadResId, List<SectionBean> data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder baseViewHolder, SectionBean sectionBean) {
        baseViewHolder.setText(R.id.header, sectionBean.header);
        baseViewHolder.setVisible(R.id.more, sectionBean.isMore());
        baseViewHolder.addOnClickListener(R.id.more);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, SectionBean sectionBean) {
        //sectionBean.t返回SectionBean类型
        final String thumb = sectionBean.t.getGoodsThumb();
        final String name = sectionBean.t.getGoodsName();
        final int goodsId = sectionBean.t.getGoodsId();
        final SectionContentItemEntity entity = sectionBean.t;
        baseViewHolder.setText(R.id.tv, name);
        final AppCompatImageView goodsImageView = baseViewHolder.getView(R.id.iv);
        Glide.with(mContext)
                .load(thumb)
                .into(goodsImageView);
    }
}
