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

public class OrderCourseListActivity$$ViewBinder<T extends OrderCourseListActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231746, "field 'mTitle'");
    target.mTitle = finder.castView(view, 2131231746, "field 'mTitle'");
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231378, "field 'mRlv'");
    target.mRlv = finder.castView(view, 2131231378, "field 'mRlv'");
    view = finder.findRequiredView(source, 2131231161, "field 'mLlLeft' and method 'onViewClicked'");
    target.mLlLeft = finder.castView(view, 2131231161, "field 'mLlLeft'");
    unbinder.view2131231161 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231053, "field 'mIvRight' and method 'onViewClicked'");
    target.mIvRight = finder.castView(view, 2131231053, "field 'mIvRight'");
    unbinder.view2131231053 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231383, "field 'mRlvDate'");
    target.mRlvDate = finder.castView(view, 2131231383, "field 'mRlvDate'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends OrderCourseListActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231161;

    View view2131231053;

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
      target.mTitle = null;
      target.mLlCommonLayout = null;
      target.mRlv = null;
      view2131231161.setOnClickListener(null);
      target.mLlLeft = null;
      view2131231053.setOnClickListener(null);
      target.mIvRight = null;
      target.mRlvDate = null;
    }
  }
}
