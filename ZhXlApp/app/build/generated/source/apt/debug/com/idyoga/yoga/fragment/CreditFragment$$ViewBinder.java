// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CreditFragment$$ViewBinder<T extends CreditFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231212, "field 'llWebRoot'");
    target.llWebRoot = finder.castView(view, 2131231212, "field 'llWebRoot'");
    view = finder.findRequiredView(source, 2131231165, "field 'llLeftBack' and method 'onViewClicked'");
    target.llLeftBack = finder.castView(view, 2131231165, "field 'llLeftBack'");
    unbinder.view2131231165 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231754, "field 'tvTitle'");
    target.tvTitle = finder.castView(view, 2131231754, "field 'tvTitle'");
    view = finder.findRequiredView(source, 2131231375, "field 'rlTitle'");
    target.rlTitle = finder.castView(view, 2131231375, "field 'rlTitle'");
    view = finder.findRequiredView(source, 2131231789, "field 'mVLayoutHead'");
    target.mVLayoutHead = view;
    view = finder.findRequiredView(source, 2131231166, "field 'mLlClose' and method 'onViewClicked'");
    target.mLlClose = finder.castView(view, 2131231166, "field 'mLlClose'");
    unbinder.view2131231166 = view;
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

  protected static class InnerUnbinder<T extends CreditFragment> implements Unbinder {
    private T target;

    View view2131231165;

    View view2131231166;

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
      target.llWebRoot = null;
      view2131231165.setOnClickListener(null);
      target.llLeftBack = null;
      target.tvTitle = null;
      target.rlTitle = null;
      target.mVLayoutHead = null;
      view2131231166.setOnClickListener(null);
      target.mLlClose = null;
    }
  }
}
