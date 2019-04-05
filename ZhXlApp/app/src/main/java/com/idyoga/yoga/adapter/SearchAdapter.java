package com.idyoga.yoga.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.idyoga.yoga.R;
import com.idyoga.yoga.activity.search.SearchActivity;
import com.idyoga.yoga.common.adapter.CommonAdapter;
import com.idyoga.yoga.common.adapter.ViewHolder;
import com.idyoga.yoga.model.SearchRecordBean;
import com.idyoga.yoga.utils.ToastUtil;

import java.util.List;

import vip.devkit.library.Logcat;
import vip.devkit.library.SharedPreferencesUtils;
import vip.devkit.library.StringUtil;
import vip.devkit.view.common.suklib.view.FlowLayout.FlowLayout;
import vip.devkit.view.common.suklib.view.FlowLayout.TagAdapter;
import vip.devkit.view.common.suklib.view.FlowLayout.TagFlowLayout;

/**
 * 文 件 名: SearchAdapter
 * 创 建 人: By k
 * 创建日期: 2018/5/11 16:41
 * 邮   箱:  vip@devkit.vip
 * 博   客: www.devkit.vip
 * 修改时间：
 * 修改备注：
 */
public class SearchAdapter extends CommonAdapter<SearchRecordBean.TagBean> {

    private Context mContext;
    List<SearchRecordBean.TagBean> mBeanList;
    public SearchAdapter(Context context, List<SearchRecordBean.TagBean> mBeanList, int layoutId) {
        super(context, mBeanList, layoutId);
        this.mContext = context;
        this.mBeanList= mBeanList;
    }

    @Override
    public void convert(ViewHolder holder, final SearchRecordBean.TagBean tagBean, final int position) {
        holder.setText(R.id.tv_title, tagBean.getTagTitle());
        String tagTitle = tagBean.getTagTitle();
        TextView textView =  holder.getView(R.id.tv_clean);
        if (!StringUtil.isEmpty(tagTitle)&&tagTitle.equals("历史记录")) {
            textView.setVisibility(View.VISIBLE);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ToastUtil.showToast("清除历史搜索");
                    mBeanList.remove(position);
                    SharedPreferencesUtils.removeSP(mContext,"SearchRecord");
                    notifyDataSetChanged();
                }
            });
        }else {
            textView.setVisibility(View.GONE);
        }
        TagFlowLayout mTagView = holder.getView(R.id.tag_view);
        mTagView.setAdapter(new TagAdapter<String>(tagBean.getList()) {
            @Override
            public View getView(FlowLayout parent, int position, String tag) {
                LayoutInflater mInflater = LayoutInflater.from(mContext);
                TextView tv = (TextView) mInflater.inflate(R.layout.option_item, parent, false);
                tv.setText(tag);
                tv.setTextSize(13);
                tv.setTextColor(Color.parseColor("#333333"));
                tv.setBackgroundResource(R.drawable.bg_a_14);
                return tv;
            }
        });
        mTagView.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                Logcat.i("点击了：" + tagBean.getTagTitle() + "/" + tagBean.getList().get(position));
                Intent intent = new Intent(mContext, SearchActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("mKeyword",tagBean.getList().get(position));
                intent.putExtras(bundle);
                mContext.startActivity(intent);
                return true;
            }
        });
    }



}