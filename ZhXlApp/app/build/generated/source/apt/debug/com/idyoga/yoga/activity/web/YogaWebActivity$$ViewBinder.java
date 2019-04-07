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

public class YogaWebActivity$$ViewBinder<T extends YogaWebActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131230871, "field 'mLlLayout'");
    target.mLlLayout = finder.castView(view, 2131230871, "field 'mLlLayout'");
    view = finder.findRequiredView(source, 2131231208, "field 'mLlWebBack' and method 'onViewClicked'");
    target.mLlWebBack = finder.castView(view, 2131231208, "field 'mLlWebBack'");
    unbinder.view2131231208 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231209, "field 'mLlWebClose' and method 'onViewClicked'");
    target.mLlWebClose = finder.castView(view, 2131231209, "field 'mLlWebClose'");
    unbinder.view2131231209 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231776, "field 'mTvWebTitle'");
    target.mTvWebTitle = finder.castView(view, 2131231776, "field 'mTvWebTitle'");
    view = finder.findRequiredView(source, 2131231211, "field 'mLlWebMore' and method 'onViewClicked'");
    target.mLlWebMore = finder.castView(view, 2131231211, "field 'mLlWebMore'");
    unbinder.view2131231211 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends YogaWebActivity> implements Unbinder {
    private T target;

    View view2131231208;

    View view2131231209;

    View view2131231211;

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
      target.mLlLayout = null;
      view2131231208.setOnClickListener(null);
      target.mLlWebBack = null;
      view2131231209.setOnClickListener(null);
      target.mLlWebClose = null;
      target.mTvWebTitle = null;
      view2131231211.setOnClickListener(null);
      target.mLlWebMore = null;
      target.mLlCommonLayout = null;
    }
  }
}
