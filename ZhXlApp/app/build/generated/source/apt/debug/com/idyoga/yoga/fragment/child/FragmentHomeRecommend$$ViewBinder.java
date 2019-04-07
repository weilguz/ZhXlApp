// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment.child;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class FragmentHomeRecommend$$ViewBinder<T extends FragmentHomeRecommend> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231470, "field 'mSrlRefresh'");
    target.mSrlRefresh = finder.castView(view, 2131231470, "field 'mSrlRefresh'");
    view = finder.findRequiredView(source, 2131231410, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231410, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231105, "field 'mLayoutF'");
    target.mLayoutF = finder.castView(view, 2131231105, "field 'mLayoutF'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends FragmentHomeRecommend> implements Unbinder {
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
      target.mSrlRefresh = null;
      target.mRvList = null;
      target.mLayoutF = null;
    }
  }
}
