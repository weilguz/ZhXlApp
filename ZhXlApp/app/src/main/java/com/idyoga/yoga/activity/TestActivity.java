/**
 * ****************************** Copyright (c)*********************************\
 * *
 * *                 (c) Copyright 2017, DevKit.vip, china, qd. sd
 * *                          All Rights Reserved
 * *
 * *                           By(K)
 * *
 * *-----------------------------------版本信息------------------------------------
 * * 版    本: V0.1
 * *
 * *------------------------------------------------------------------------------
 * *******************************End of Head************************************\
 */
package com.idyoga.yoga.activity;

import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.idyoga.yoga.R;
import com.idyoga.yoga.adapter.HFDemoRecyclerviewAdapter;
import com.idyoga.yoga.base.BaseActivity;
import com.idyoga.yoga.model.HomePageData;
import com.idyoga.yoga.utils.ViewUtil;
import com.idyoga.yoga.view.AaTextView;
import com.idyoga.yoga.view.CollapsibleTextView;

import java.util.List;

import butterknife.BindView;
import vip.devkit.library.Logcat;

/**
 * 文 件 名: TestActivity
 * 创 建 人: By k
 * 创建日期: 2018/3/25 15:53
 * 邮   箱:  vip@devkit.vip
 * 博   客: www.devkit.vip
 * 修改时间：
 * 修改备注：
 */
public class TestActivity extends BaseActivity {

    /*@BindView(R.id.rlv)
    RecyclerView mRlv;*/

    private String mCityId;
    String mUserId;
    String mLatitude;
    String mLongitude;
    private int mPage = 1;
    private HFDemoRecyclerviewAdapter mAdapter;
    private String textContent = "abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz";

    @Override
    protected void initData() {
        /*mCityId = (String) SharedPreferencesUtils.getSP(this, "cityId", "");
        mUserId = String.valueOf((int) SharedPreferencesUtils.getSP(this, "UserId", 0));
        mLatitude = (String) SharedPreferencesUtils.getSP(this, "latitude", "");
        mLongitude = (String) SharedPreferencesUtils.getSP(this, "longitude", "");
        toRequest();*/
    }

    @Override
    protected int setLayoutId() {
        return R.layout.a_test;
    }

    boolean isClick = false;
    @Override
    protected void initView() {
        /*TextView tv = findViewById(R.id.tv_text);
        SpannableString string = new SpannableString("abcdefghijklmn");
        MyCLickSpan cLickSpan = new MyCLickSpan();
        //right_up
        Drawable down = getResources().getDrawable(R.drawable.right_down);
        down.setBounds(0,0,ViewUtil.dp2px(this,22), ViewUtil.dp2px(this,22));
        ImageSpan spanDrawable = new ImageSpan(down);
        string.setSpan(spanDrawable,string.length() - 3 ,string.length(),Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        string.setSpan(cLickSpan,0,string.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv.setText(string);


        final CollapsibleTextView text = findViewById(R.id.text);
        text.setText("abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz,abcdefghijklmnopqrstuvwxyz");
        */
        /*mAdapter = new HFDemoRecyclerviewAdapter(this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mRlv.setLayoutManager(manager);
        mRlv.setAdapter(mAdapter);*/
//        final CollapsibleTextView text = findViewById(R.id.text);
        /*text.setMovementMethod(LinkMovementMethod.getInstance());
        final ViewGroup.LayoutParams lp = text.getLayoutParams();
        ViewTreeObserver observer = text.getViewTreeObserver();
        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Layout layout = text.getLayout();
                int lineCount = layout.getLineCount();
                if (lineCount <= 3){
                    text.getLayoutParams().height = ViewGroup.LayoutParams.WRAP_CONTENT;
                }else{
                    text.getLayoutParams().height = layout.getHeight() / lineCount * 3;
                }
            }
        });*/
        /*text.setOnExtendClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClick){
                    text.setIsShowMore(false);
                }else{
                    text.setIsShowMore(true);
                }
                Layout layout = text.getLayout();
                int lineCount = layout.getLineCount();
                int height = layout.getHeight();
                int lineHeight = height / lineCount;
                if (isClick){
                    lp.height = lineHeight * 3;
                    isClick = false;
                }else{
                    isClick = true;
                    text.setText(textContent);
                    lp.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                }
                text.setLayoutParams(lp);
            }
        });*/

        AaTextView text = findViewById(R.id.expandable_text);
        text.setText(textContent);
    }

    class MyCLickSpan extends ClickableSpan{

        @Override
        public void onClick(View widget) {
            Logcat.i("--------------------------------------------- MyCLickSpan onClick ");
        }
    }

    private boolean isLoadMore = false;
    @Override
    protected void setListener() {
        /*mRlv.setOnScrollListener(new RecyclerView.OnScrollListener() {

            private int mLastPosition;

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                LinearLayoutManager manager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int totalItemCount = manager.getItemCount();
                int visibleItemCount = manager.getChildCount();
                if (visibleItemCount > 0 && newState == RecyclerView.SCROLL_STATE_IDLE && mLastPosition >= totalItemCount - 1){
                    //mAdapter.setShowLoadMore(true);
                    isLoadMore = true;
                    onLoadMore();
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                mLastPosition = layoutManager.findLastVisibleItemPosition();
            }
        });*/
    }

    private void onLoadMore() {
        mPage += 1;
        toRequest();
    }

    private void toRequest() {
        /*Map map = new HashMap<>();
        map.put("userId", mUserId + "");
        map.put("cityId", mCityId + "");
        map.put("lat", mLatitude + "");
        map.put("long", mLongitude + "");
        map.put("page", mPage + "");
        map.put("size", "10");
        OkHttpUtils.get().url(ApiConstants.Urls.EQUITY_COURSE_PAGE_DATA).params(map).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e, int id) {
                dismissLoading();
            }

            @Override
            public void onResponse(String response, int id) {
                Logcat.e("权益课课 getHeadInfo :" + mCityId + "/" + response);
                dismissLoading();
                response = response.replace("\"data\":[]", "\"data\":null");
                ResultBean resultBean = JSON.parseObject(response, ResultBean.class);
                if ("1".equals(resultBean.getCode())){
                    HomePageData mHomeBean = JSON.parseObject(resultBean.getData(), HomePageData.class);
                    if (mHomeBean != null) {
                        initViewData(mHomeBean);
                    }
                }
            }
        });*/
    }

    private void initViewData(HomePageData mHomeBean) {
        //mAdapter
        HomePageData.JumpUrlArrBean jumpUrlArr = mHomeBean.getJumpUrlArr();
        HomePageData.UserDataBean userData = mHomeBean.getUserData();
        if (userData != null && jumpUrlArr != null){
            userData.setSignUrl(jumpUrlArr.getSignUrl());
        }
        //mAdapter.setShowLoadMore(false);
        Logcat.i("-------------------------------------------isLoadMore = " + isLoadMore);
        if (!isLoadMore){
            mAdapter.setDatas(mHomeBean);
        }else{
            mAdapter.addData(mHomeBean);
            isLoadMore = false;
        }
//        WaitViewController.from(getStateViewRoot()).removeChilds();
    }

    class MyAdapter extends BaseMultiItemQuickAdapter<Ad,BaseViewHolder>{

        public MyAdapter(List<Ad> data) {
            super(data);
            //addItemType();
        }

        @Override
        protected void convert(BaseViewHolder helper, Ad item) {

        }
    }

    class Ad implements MultiItemEntity {

        @Override
        public int getItemType() {
            return 0;

        }
    }
}
