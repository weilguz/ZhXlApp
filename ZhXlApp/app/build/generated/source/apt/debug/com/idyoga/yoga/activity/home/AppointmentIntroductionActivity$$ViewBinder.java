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

public class AppointmentIntroductionActivity$$ViewBinder<T extends AppointmentIntroductionActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231353, "field 'mRlLayout'");
    target.mRlLayout = finder.castView(view, 2131231353, "field 'mRlLayout'");
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231199, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231199, "field 'mLlTitleBack'");
    unbinder.view2131231199 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231754, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231754, "field 'mTvTitleText'");
    view = finder.findRequiredView(source, 2131231200, "field 'mLlTileRight'");
    target.mLlTileRight = finder.castView(view, 2131231200, "field 'mLlTileRight'");
    view = finder.findRequiredView(source, 2131231753, "field 'mTvRightText'");
    target.mTvRightText = finder.castView(view, 2131231753, "field 'mTvRightText'");
    view = finder.findRequiredView(source, 2131231381, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231381, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231142, "field 'mFootLayout'");
    target.mFootLayout = finder.castView(view, 2131231142, "field 'mFootLayout'");
    view = finder.findRequiredView(source, 2131231665, "field 'mTvNext' and method 'onViewClicked'");
    target.mTvNext = finder.castView(view, 2131231665, "field 'mTvNext'");
    unbinder.view2131231665 = view;
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

  protected static class InnerUnbinder<T extends AppointmentIntroductionActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231665;

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
      target.mRlLayout = null;
      target.mLlCommonLayout = null;
      view2131231199.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mLlTileRight = null;
      target.mTvRightText = null;
      target.mRvList = null;
      target.mFootLayout = null;
      view2131231665.setOnClickListener(null);
      target.mTvNext = null;
    }
  }
}
