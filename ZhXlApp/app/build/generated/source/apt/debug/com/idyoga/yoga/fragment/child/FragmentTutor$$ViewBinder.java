// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment.child;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class FragmentTutor$$ViewBinder<T extends FragmentTutor> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231407, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231407, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231467, "field 'mSrlRefresh'");
    target.mSrlRefresh = finder.castView(view, 2131231467, "field 'mSrlRefresh'");
    view = finder.findRequiredView(source, 2131230836, "field 'mBvView'");
    target.mBvView = finder.castView(view, 2131230836, "field 'mBvView'");
    view = finder.findRequiredView(source, 2131230883, "field 'mNsvView'");
    target.mNsvView = finder.castView(view, 2131230883, "field 'mNsvView'");
    view = finder.findRequiredView(source, 2131231150, "field 'mLlLayout'");
    target.mLlLayout = finder.castView(view, 2131231150, "field 'mLlLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends FragmentTutor> implements Unbinder {
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
      target.mRvList = null;
      target.mSrlRefresh = null;
      target.mBvView = null;
      target.mNsvView = null;
      target.mLlLayout = null;
    }
  }
}