// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.setting;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SettingActivity$$ViewBinder<T extends SettingActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231756, "field 'mTvTitleRight'");
    target.mTvTitleRight = finder.castView(view, 2131231756, "field 'mTvTitleRight'");
    view = finder.findRequiredView(source, 2131231203, "field 'llTitleRight'");
    target.llTitleRight = finder.castView(view, 2131231203, "field 'llTitleRight'");
    view = finder.findRequiredView(source, 2131231136, "field 'llCommonLayout'");
    target.llCommonLayout = finder.castView(view, 2131231136, "field 'llCommonLayout'");
    view = finder.findRequiredView(source, 2131231329, "field 'mRlAccountSafe' and method 'onViewClicked'");
    target.mRlAccountSafe = finder.castView(view, 2131231329, "field 'mRlAccountSafe'");
    unbinder.view2131231329 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231544, "field 'mTvCacheSize'");
    target.mTvCacheSize = finder.castView(view, 2131231544, "field 'mTvCacheSize'");
    view = finder.findRequiredView(source, 2131231340, "field 'rlClear' and method 'onViewClicked'");
    target.rlClear = finder.castView(view, 2131231340, "field 'rlClear'");
    unbinder.view2131231340 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231767, "field 'mTvVersionName'");
    target.mTvVersionName = finder.castView(view, 2131231767, "field 'mTvVersionName'");
    view = finder.findRequiredView(source, 2131231339, "field 'mRlCheckUpdate' and method 'onViewClicked'");
    target.mRlCheckUpdate = finder.castView(view, 2131231339, "field 'mRlCheckUpdate'");
    unbinder.view2131231339 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231328, "field 'mRlAbout' and method 'onViewClicked'");
    target.mRlAbout = finder.castView(view, 2131231328, "field 'mRlAbout'");
    unbinder.view2131231328 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230814, "field 'mBtnLoginOut' and method 'onViewClicked'");
    target.mBtnLoginOut = finder.castView(view, 2131230814, "field 'mBtnLoginOut'");
    unbinder.view2131230814 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SettingActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231329;

    View view2131231340;

    View view2131231339;

    View view2131231328;

    View view2131230814;

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
      target.mTvTitleRight = null;
      target.llTitleRight = null;
      target.llCommonLayout = null;
      view2131231329.setOnClickListener(null);
      target.mRlAccountSafe = null;
      target.mTvCacheSize = null;
      view2131231340.setOnClickListener(null);
      target.rlClear = null;
      target.mTvVersionName = null;
      view2131231339.setOnClickListener(null);
      target.mRlCheckUpdate = null;
      view2131231328.setOnClickListener(null);
      target.mRlAbout = null;
      view2131230814.setOnClickListener(null);
      target.mBtnLoginOut = null;
    }
  }
}
