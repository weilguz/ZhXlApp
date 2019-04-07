// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.loading;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SetCityActivity$$ViewBinder<T extends SetCityActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231004, "field 'mIvBack' and method 'onViewClicked'");
    target.mIvBack = finder.castView(view, 2131231004, "field 'mIvBack'");
    unbinder.view2131231004 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231352, "field 'mRlHeadLayout'");
    target.mRlHeadLayout = finder.castView(view, 2131231352, "field 'mRlHeadLayout'");
    view = finder.findRequiredView(source, 2131231410, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231410, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131230982, "field 'mIndexBar'");
    target.mIndexBar = finder.castView(view, 2131230982, "field 'mIndexBar'");
    view = finder.findRequiredView(source, 2131231521, "field 'mTvSideBarHint'");
    target.mTvSideBarHint = finder.castView(view, 2131231521, "field 'mTvSideBarHint'");
    view = finder.findRequiredView(source, 2131231668, "field 'mTvNext' and method 'onViewClicked'");
    target.mTvNext = finder.castView(view, 2131231668, "field 'mTvNext'");
    unbinder.view2131231668 = view;
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

  protected static class InnerUnbinder<T extends SetCityActivity> implements Unbinder {
    private T target;

    View view2131231004;

    View view2131231668;

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
      view2131231004.setOnClickListener(null);
      target.mIvBack = null;
      target.mRlHeadLayout = null;
      target.mRvList = null;
      target.mIndexBar = null;
      target.mTvSideBarHint = null;
      view2131231668.setOnClickListener(null);
      target.mTvNext = null;
    }
  }
}
