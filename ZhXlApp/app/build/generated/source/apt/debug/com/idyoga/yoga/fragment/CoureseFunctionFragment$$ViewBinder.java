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

public class CoureseFunctionFragment$$ViewBinder<T extends CoureseFunctionFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231397, "field 'mRlvTag'");
    target.mRlvTag = finder.castView(view, 2131231397, "field 'mRlvTag'");
    view = finder.findRequiredView(source, 2131231143, "field 'mLlDown' and method 'onViewClicked'");
    target.mLlDown = finder.castView(view, 2131231143, "field 'mLlDown'");
    unbinder.view2131231143 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    view = finder.findRequiredView(source, 2131231800, "field 'mView'");
    target.mView = view;
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CoureseFunctionFragment> implements Unbinder {
    private T target;

    View view2131231143;

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
      view2131231143.setOnClickListener(null);
      target.mLlDown = null;
      target.mView = null;
    }
  }
}
