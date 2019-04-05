// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.user;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class UpdatePwdActivity$$ViewBinder<T extends UpdatePwdActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231199, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231199, "field 'mLlTitleBack'");
    unbinder.view2131231199 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231754, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231754, "field 'mTvTitleText'");
    view = finder.findRequiredView(source, 2131231753, "field 'mTvTitleRight'");
    target.mTvTitleRight = finder.castView(view, 2131231753, "field 'mTvTitleRight'");
    view = finder.findRequiredView(source, 2131231200, "field 'mLlTitleRight'");
    target.mLlTitleRight = finder.castView(view, 2131231200, "field 'mLlTitleRight'");
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131230939, "field 'mEtPwd'");
    target.mEtPwd = finder.castView(view, 2131230939, "field 'mEtPwd'");
    view = finder.findRequiredView(source, 2131231070, "field 'mIvSwitch' and method 'onViewClicked'");
    target.mIvSwitch = finder.castView(view, 2131231070, "field 'mIvSwitch'");
    unbinder.view2131231070 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230941, "field 'mEtSmsCode'");
    target.mEtSmsCode = finder.castView(view, 2131230941, "field 'mEtSmsCode'");
    view = finder.findRequiredView(source, 2131230811, "field 'mBtnGetCode' and method 'onViewClicked'");
    target.mBtnGetCode = finder.castView(view, 2131230811, "field 'mBtnGetCode'");
    unbinder.view2131230811 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231656, "field 'mTvMobile'");
    target.mTvMobile = finder.castView(view, 2131231656, "field 'mTvMobile'");
    view = finder.findRequiredView(source, 2131231725, "field 'mTvSubmit' and method 'onViewClicked'");
    target.mTvSubmit = finder.castView(view, 2131231725, "field 'mTvSubmit'");
    unbinder.view2131231725 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230935, "field 'mEtMobile'");
    target.mEtMobile = finder.castView(view, 2131230935, "field 'mEtMobile'");
    view = finder.findRequiredView(source, 2131231156, "field 'mLlLayoutMobile'");
    target.mLlLayoutMobile = finder.castView(view, 2131231156, "field 'mLlLayoutMobile'");
    view = finder.findRequiredView(source, 2131231564, "field 'mTvCodeTag'");
    target.mTvCodeTag = finder.castView(view, 2131231564, "field 'mTvCodeTag'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends UpdatePwdActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231070;

    View view2131230811;

    View view2131231725;

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
      view2131231199.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mTvTitleRight = null;
      target.mLlTitleRight = null;
      target.mLlCommonLayout = null;
      target.mEtPwd = null;
      view2131231070.setOnClickListener(null);
      target.mIvSwitch = null;
      target.mEtSmsCode = null;
      view2131230811.setOnClickListener(null);
      target.mBtnGetCode = null;
      target.mTvMobile = null;
      view2131231725.setOnClickListener(null);
      target.mTvSubmit = null;
      target.mEtMobile = null;
      target.mLlLayoutMobile = null;
      target.mTvCodeTag = null;
    }
  }
}
