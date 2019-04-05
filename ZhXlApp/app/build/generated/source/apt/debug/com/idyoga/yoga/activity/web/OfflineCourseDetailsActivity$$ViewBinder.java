// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.web;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class OfflineCourseDetailsActivity$$ViewBinder<T extends OfflineCourseDetailsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231207, "field 'mLlWebLayout'");
    target.mLlWebLayout = finder.castView(view, 2131231207, "field 'mLlWebLayout'");
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
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231200, "field 'mLlTitleRight'");
    target.mLlTitleRight = finder.castView(view, 2131231200, "field 'mLlTitleRight'");
    view = finder.findRequiredView(source, 2131231059, "field 'mIvShare' and method 'onViewClicked'");
    target.mIvShare = finder.castView(view, 2131231059, "field 'mIvShare'");
    unbinder.view2131231059 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231568, "field 'mTvConsult' and method 'onViewClicked'");
    target.mTvConsult = finder.castView(view, 2131231568, "field 'mTvConsult'");
    unbinder.view2131231568 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231665, "field 'mTvNext' and method 'onViewClicked'");
    target.mTvNext = finder.castView(view, 2131231665, "field 'mTvNext'");
    unbinder.view2131231665 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231142, "field 'mLlFootLayout'");
    target.mLlFootLayout = finder.castView(view, 2131231142, "field 'mLlFootLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends OfflineCourseDetailsActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231059;

    View view2131231568;

    View view2131231665;

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
      target.mLlWebLayout = null;
      view2131231199.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mTvTitleRight = null;
      target.mLlCommonLayout = null;
      target.mLlTitleRight = null;
      view2131231059.setOnClickListener(null);
      target.mIvShare = null;
      view2131231568.setOnClickListener(null);
      target.mTvConsult = null;
      view2131231665.setOnClickListener(null);
      target.mTvNext = null;
      target.mLlFootLayout = null;
    }
  }
}
