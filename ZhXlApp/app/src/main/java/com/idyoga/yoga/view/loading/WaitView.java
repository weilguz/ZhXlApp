/*
******************************* Copyright (c)*********************************\
**
**                 (c) Copyright 2018, 珠海现联瑜君岚运营管理有限公司, china, qd. sd
**                                All Rights Reserved
**
**                           By(珠海现联瑜君岚运营管理有限公司)
********************************End of Head************************************\
*/
package com.idyoga.yoga.view.loading;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.ColorInt;
import android.support.annotation.Dimension;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.view.View;

/**
 * File   Name: WaitView
 * Create Date: 2018/10/22 16:28
 * Describe   :
 * Author     : By k
 * E-mail     : vip@devkit.vip
 * VersionName: 1
 * VersionCode: V 1.0
 * Code Update:（author - time）
 * Update Describe：
 */
public class WaitView extends View {
    @ColorInt
    private int mColor;
    @Dimension
    private int mRadius;
    @IntRange(from = 0, to = 255)
    private int mAlpha;
    private RectF mDrawRect;

    private WaitViewController mController;
    private Paint mPaint;

    public WaitView(@NonNull WaitViewController controller) {
        super(controller.getContext());
        mController = controller;
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.setMeasuredDimension((int) mDrawRect.width(), (int) mDrawRect.height());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(mColor);
        mPaint.setAlpha(mAlpha);
        canvas.drawRoundRect(mDrawRect, mRadius, mRadius, mPaint);
    }

    WaitViewController getController() {
        return mController;
    }

    public WaitView color(@ColorInt int color) {
        mColor = color;
        return this;
    }

    public WaitView radius(@Dimension int radius) {
        mRadius = radius;
        return this;
    }

    public WaitView alpha(@IntRange(from = 0, to = 255) int alpha) {
        mAlpha = alpha;
        return this;
    }

    public WaitView drawRect(RectF drawRect) {
        mDrawRect = drawRect;
        return this;
    }

}
