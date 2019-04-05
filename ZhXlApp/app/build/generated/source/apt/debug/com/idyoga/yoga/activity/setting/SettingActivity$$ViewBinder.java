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
    view = finder.findRequiredView(source, 2131231200, "field 'llTitleRight'");
    target.llTitleRight = finder.castView(view, 2131231200, "field 'llTitleRight'");
    view = finder.findRequiredView(source, 2131231133, "field 'llCommonLayout'");
    target.llCommonLayout = finder.castView(view, 2131231133, "field 'llCommonLayout'");
    view = finder.findRequiredView(source, 2131231326, "field 'mRlAccountSafe' and method 'onViewClicked'");
    target.mRlAccountSafe = finder.castView(view, 2131231326, "field 'mRlAccountSafe'");
    unbinder.view2131231326 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231541, "field 'mTvCacheSize'");
    target.mTvCacheSize = finder.castView(view, 2131231541, "field 'mTvCacheSize'");
    view = finder.findRequiredView(source, 2131231337, "field 'rlClear' and method 'onViewClicked'");
    target.rlClear = finder.castView(view, 2131231337, "field 'rlClear'");
    unbinder.view2131231337 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231764, "field 'mTvVersionName'");
    target.mTvVersionName = finder.castView(view, 2131231764, "field 'mTvVersionName'");
    view = finder.findRequiredView(source, 2131231336, "field 'mRlCheckUpdate' and method 'onViewClicked'");
    target.mRlCheckUpdate = finder.castView(view, 2131231336, "field 'mRlCheckUpdate'");
    unbinder.view2131231336 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231325, "field 'mRlAbout' and method 'onViewClicked'");
    target.mRlAbout = finder.castView(view, 2131231325, "field 'mRlAbout'");
    unbinder.view2131231325 = view;
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

    View view2131231199;

    View view2131231326;

    View view2131231337;

    View view2131231336;

    View view2131231325;

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
      view2131231199.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mTvTitleRight = null;
      target.llTitleRight = null;
      target.llCommonLayout = null;
      view2131231326.setOnClickListener(null);
      target.mRlAccountSafe = null;
      target.mTvCacheSize = null;
      view2131231337.setOnClickListener(null);
      target.rlClear = null;
      target.mTvVersionName = null;
      view2131231336.setOnClickListener(null);
      target.mRlCheckUpdate = null;
      view2131231325.setOnClickListener(null);
      target.mRlAbout = null;
      view2131230814.setOnClickListener(null);
      target.mBtnLoginOut = null;
    }
  }
}
