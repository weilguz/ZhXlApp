// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment.course;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CourseTagFragment$$ViewBinder<T extends CourseTagFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231397, "field 'mRlvTag'");
    target.mRlvTag = finder.castView(view, 2131231397, "field 'mRlvTag'");
    view = finder.findRequiredView(source, 2131231174, "field 'mLlMore' and method 'onViewClicked'");
    target.mLlMore = finder.castView(view, 2131231174, "field 'mLlMore'");
    unbinder.view2131231174 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CourseTagFragment> implements Unbinder {
    private T target;

    View view2131231174;

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
      target.mRlvTag = null;
      view2131231174.setOnClickListener(null);
      target.mLlMore = null;
    }
  }
}
