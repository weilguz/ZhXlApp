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

public class LessonAppointmentResultActivity$$ViewBinder<T extends LessonAppointmentResultActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231691, "field 'tvResult'");
    target.tvResult = finder.castView(view, 2131231691, "field 'tvResult'");
    view = finder.findRequiredView(source, 2131231676, "field 'tvOrderId'");
    target.tvOrderId = finder.castView(view, 2131231676, "field 'tvOrderId'");
    view = finder.findRequiredView(source, 2131231642, "field 'tvLessonName'");
    target.tvLessonName = finder.castView(view, 2131231642, "field 'tvLessonName'");
    view = finder.findRequiredView(source, 2131231565, "field 'tvClassroomName'");
    target.tvClassroomName = finder.castView(view, 2131231565, "field 'tvClassroomName'");
    view = finder.findRequiredView(source, 2131231644, "field 'tvLessonTeacher'");
    target.tvLessonTeacher = finder.castView(view, 2131231644, "field 'tvLessonTeacher'");
    view = finder.findRequiredView(source, 2131231645, "field 'tvLessonTime'");
    target.tvLessonTime = finder.castView(view, 2131231645, "field 'tvLessonTime'");
    view = finder.findRequiredView(source, 2131231641, "field 'tvLessonAttention'");
    target.tvLessonAttention = finder.castView(view, 2131231641, "field 'tvLessonAttention'");
    view = finder.findRequiredView(source, 2131231640, "field 'tvLessonAddress'");
    target.tvLessonAddress = finder.castView(view, 2131231640, "field 'tvLessonAddress'");
    view = finder.findRequiredView(source, 2131231643, "field 'tvLessonPhone'");
    target.tvLessonPhone = finder.castView(view, 2131231643, "field 'tvLessonPhone'");
    view = finder.findRequiredView(source, 2131230818, "field 'btnReturn' and method 'onViewClicked'");
    target.btnReturn = finder.castView(view, 2131230818, "field 'btnReturn'");
    unbinder.view2131230818 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231153, "field 'mLayout'");
    target.mLayout = finder.castView(view, 2131231153, "field 'mLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LessonAppointmentResultActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131230818;

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
      target.mLlCommonLayout = null;
      target.tvResult = null;
      target.tvOrderId = null;
      target.tvLessonName = null;
      target.tvClassroomName = null;
      target.tvLessonTeacher = null;
      target.tvLessonTime = null;
      target.tvLessonAttention = null;
      target.tvLessonAddress = null;
      target.tvLessonPhone = null;
      view2131230818.setOnClickListener(null);
      target.btnReturn = null;
      target.mLayout = null;
    }
  }
}
