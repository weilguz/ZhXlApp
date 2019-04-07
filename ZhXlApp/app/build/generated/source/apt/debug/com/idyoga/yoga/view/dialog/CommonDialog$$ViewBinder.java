// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.view.dialog;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CommonDialog$$ViewBinder<T extends CommonDialog> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231754, "field 'mTvTitle'");
    target.mTvTitle = finder.castView(view, 2131231754, "field 'mTvTitle'");
    view = finder.findRequiredView(source, 2131231664, "field 'mTvMsg'");
    target.mTvMsg = finder.castView(view, 2131231664, "field 'mTvMsg'");
    view = finder.findRequiredView(source, 2131231733, "field 'mBtnSure'");
    target.mBtnSure = finder.castView(view, 2131231733, "field 'mBtnSure'");
    view = finder.findRequiredView(source, 2131231548, "field 'mBtnCancel'");
    target.mBtnCancel = finder.castView(view, 2131231548, "field 'mBtnCancel'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CommonDialog> implements Unbinder {
    private T target;

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
      target.mTvTitle = null;
      target.mTvMsg = null;
      target.mBtnSure = null;
      target.mBtnCancel = null;
    }
  }
}
