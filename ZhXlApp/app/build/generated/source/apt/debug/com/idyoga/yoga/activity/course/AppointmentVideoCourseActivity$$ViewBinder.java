// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.course;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class AppointmentVideoCourseActivity$$ViewBinder<T extends AppointmentVideoCourseActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231202, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231202, "field 'mLlTitleBack'");
    unbinder.view2131231202 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231757, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231757, "field 'mTvTitleText'");
    view = finder.findRequiredView(source, 2131231756, "field 'mTvTitleRight'");
    target.mTvTitleRight = finder.castView(view, 2131231756, "field 'mTvTitleRight'");
    view = finder.findRequiredView(source, 2131231203, "field 'mLlTitleRight' and method 'onViewClicked'");
    target.mLlTitleRight = finder.castView(view, 2131231203, "field 'mLlTitleRight'");
    unbinder.view2131231203 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231227, "field 'mLvList'");
    target.mLvList = finder.castView(view, 2131231227, "field 'mLvList'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends AppointmentVideoCourseActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231203;

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
      view2131231202.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mTvTitleRight = null;
      view2131231203.setOnClickListener(null);
      target.mLlTitleRight = null;
      target.mLlCommonLayout = null;
      target.mLvList = null;
    }
  }
}
