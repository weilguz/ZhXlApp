// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.home;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SubjectListActivity$ViewHolder$$ViewBinder<T extends SubjectListActivity.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231700, "field 'mTvSelectText' and method 'onViewClicked'");
    target.mTvSelectText = finder.castView(view, 2131231700, "field 'mTvSelectText'");
    unbinder.view2131231700 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231130, "field 'mLlCancel' and method 'onViewClicked'");
    target.mLlCancel = finder.castView(view, 2131231130, "field 'mLlCancel'");
    unbinder.view2131231130 = view;
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

  protected static class InnerUnbinder<T extends SubjectListActivity.ViewHolder> implements Unbinder {
    private T target;

    View view2131231700;

    View view2131231130;

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
      view2131231700.setOnClickListener(null);
      target.mTvSelectText = null;
      view2131231130.setOnClickListener(null);
      target.mLlCancel = null;
    }
  }
}
