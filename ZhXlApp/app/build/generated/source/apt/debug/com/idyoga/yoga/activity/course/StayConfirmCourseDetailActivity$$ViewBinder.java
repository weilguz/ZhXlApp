// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.course;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class StayConfirmCourseDetailActivity$$ViewBinder<T extends StayConfirmCourseDetailActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231202, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231202, "field 'mLlTitleBack'");
    unbinder.view2131231202 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231757, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231757, "field 'mTvTitleText'");
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231038, "field 'mIvImg'");
    target.mIvImg = finder.castView(view, 2131231038, "field 'mIvImg'");
    view = finder.findRequiredView(source, 2131231583, "field 'mTvCourseName'");
    target.mTvCourseName = finder.castView(view, 2131231583, "field 'mTvCourseName'");
    view = finder.findRequiredView(source, 2131231576, "field 'mTvCourseDate'");
    target.mTvCourseDate = finder.castView(view, 2131231576, "field 'mTvCourseDate'");
    view = finder.findRequiredView(source, 2131231591, "field 'mTvCourseTime'");
    target.mTvCourseTime = finder.castView(view, 2131231591, "field 'mTvCourseTime'");
    view = finder.findRequiredView(source, 2131231354, "field 'mRlItemView'");
    target.mRlItemView = finder.castView(view, 2131231354, "field 'mRlItemView'");
    view = finder.findRequiredView(source, 2131231491, "field 'mTagView'");
    target.mTagView = finder.castView(view, 2131231491, "field 'mTagView'");
    view = finder.findRequiredView(source, 2131231158, "field 'mLlLayoutItem'");
    target.mLlLayoutItem = finder.castView(view, 2131231158, "field 'mLlLayoutItem'");
    view = finder.findRequiredView(source, 2131231711, "field 'mTvShopNameTag'");
    target.mTvShopNameTag = finder.castView(view, 2131231711, "field 'mTvShopNameTag'");
    view = finder.findRequiredView(source, 2131231710, "field 'mTvShopName'");
    target.mTvShopName = finder.castView(view, 2131231710, "field 'mTvShopName'");
    view = finder.findRequiredView(source, 2131231009, "field 'mIvCall' and method 'onViewClicked'");
    target.mIvCall = finder.castView(view, 2131231009, "field 'mIvCall'");
    unbinder.view2131231009 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231707, "field 'mTvShopAddress'");
    target.mTvShopAddress = finder.castView(view, 2131231707, "field 'mTvShopAddress'");
    view = finder.findRequiredView(source, 2131231000, "field 'mIvAddress' and method 'onViewClicked'");
    target.mIvAddress = finder.castView(view, 2131231000, "field 'mIvAddress'");
    unbinder.view2131231000 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231054, "field 'mIvQrCode'");
    target.mIvQrCode = finder.castView(view, 2131231054, "field 'mIvQrCode'");
    view = finder.findRequiredView(source, 2131231139, "field 'mLlCourseQrCode'");
    target.mLlCourseQrCode = finder.castView(view, 2131231139, "field 'mLlCourseQrCode'");
    view = finder.findRequiredView(source, 2131231194, "field 'mLlSuccessLayout'");
    target.mLlSuccessLayout = finder.castView(view, 2131231194, "field 'mLlSuccessLayout'");
    view = finder.findRequiredView(source, 2131231548, "field 'mTvCancel' and method 'onViewClicked'");
    target.mTvCancel = finder.castView(view, 2131231548, "field 'mTvCancel'");
    unbinder.view2131231548 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231722, "field 'mTvState' and method 'onViewClicked'");
    target.mTvState = finder.castView(view, 2131231722, "field 'mTvState'");
    unbinder.view2131231722 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231714, "field 'mTvSignState'");
    target.mTvSignState = finder.castView(view, 2131231714, "field 'mTvSignState'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends StayConfirmCourseDetailActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231009;

    View view2131231000;

    View view2131231548;

    View view2131231722;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      view2131231202.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mLlCommonLayout = null;
      target.mIvImg = null;
      target.mTvCourseName = null;
      target.mTvCourseDate = null;
      target.mTvCourseTime = null;
      target.mRlItemView = null;
      target.mTagView = null;
      target.mLlLayoutItem = null;
      target.mTvShopNameTag = null;
      target.mTvShopName = null;
      view2131231009.setOnClickListener(null);
      target.mIvCall = null;
      target.mTvShopAddress = null;
      view2131231000.setOnClickListener(null);
      target.mIvAddress = null;
      target.mIvQrCode = null;
      target.mLlCourseQrCode = null;
      target.mLlSuccessLayout = null;
      view2131231548.setOnClickListener(null);
      target.mTvCancel = null;
      view2131231722.setOnClickListener(null);
      target.mTvState = null;
      target.mTvSignState = null;
    }
  }
}
