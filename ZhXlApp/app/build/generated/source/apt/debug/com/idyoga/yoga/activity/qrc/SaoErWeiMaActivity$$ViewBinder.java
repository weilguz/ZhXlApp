// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.qrc;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SaoErWeiMaActivity$$ViewBinder<T extends SaoErWeiMaActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131230958, "field 'mFlMyContainer'");
    target.mFlMyContainer = finder.castView(view, 2131230958, "field 'mFlMyContainer'");
    view = finder.findRequiredView(source, 2131230815, "field 'mBtnMainBack'");
    target.mBtnMainBack = finder.castView(view, 2131230815, "field 'mBtnMainBack'");
    view = finder.findRequiredView(source, 2131231203, "field 'mLinearLayout'");
    target.mLinearLayout = finder.castView(view, 2131231203, "field 'mLinearLayout'");
    view = finder.findRequiredView(source, 2131231651, "field 'mTvMainTitle'");
    target.mTvMainTitle = finder.castView(view, 2131231651, "field 'mTvMainTitle'");
    view = finder.findRequiredView(source, 2131231650, "field 'mTvMainRight'");
    target.mTvMainRight = finder.castView(view, 2131231650, "field 'mTvMainRight'");
    view = finder.findRequiredView(source, 2131231439, "field 'mSecondButton1'");
    target.mSecondButton1 = finder.castView(view, 2131231439, "field 'mSecondButton1'");
    view = finder.findRequiredView(source, 2131231153, "field 'mLlLayout'");
    target.mLlLayout = finder.castView(view, 2131231153, "field 'mLlLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SaoErWeiMaActivity> implements Unbinder {
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
      target.mFlMyContainer = null;
      target.mBtnMainBack = null;
      target.mLinearLayout = null;
      target.mTvMainTitle = null;
      target.mTvMainRight = null;
      target.mSecondButton1 = null;
      target.mLlLayout = null;
    }
  }
}
