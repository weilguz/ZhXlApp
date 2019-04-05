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

public class ExperienceLessonAppointmentActivity$$ViewBinder<T extends ExperienceLessonAppointmentActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231580, "field 'mCourseName'");
    target.mCourseName = finder.castView(view, 2131231580, "field 'mCourseName'");
    view = finder.findRequiredView(source, 2131231199, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231199, "field 'mLlTitleBack'");
    unbinder.view2131231199 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231707, "field 'mTvShopName'");
    target.mTvShopName = finder.castView(view, 2131231707, "field 'mTvShopName'");
    view = finder.findRequiredView(source, 2131231704, "field 'mTvShopAddress'");
    target.mTvShopAddress = finder.castView(view, 2131231704, "field 'mTvShopAddress'");
    view = finder.findRequiredView(source, 2131231701, "field 'mTvSelectTime'");
    target.mTvSelectTime = finder.castView(view, 2131231701, "field 'mTvSelectTime'");
    view = finder.findRequiredView(source, 2131231699, "field 'mTvSelectTeacher'");
    target.mTvSelectTeacher = finder.castView(view, 2131231699, "field 'mTvSelectTeacher'");
    view = finder.findRequiredView(source, 2131231678, "field 'mTvPeopleNum'");
    target.mTvPeopleNum = finder.castView(view, 2131231678, "field 'mTvPeopleNum'");
    view = finder.findRequiredView(source, 2131231656, "field 'mTvMobile'");
    target.mTvMobile = finder.castView(view, 2131231656, "field 'mTvMobile'");
    view = finder.findRequiredView(source, 2131231547, "field 'mTvCard'");
    target.mTvCard = finder.castView(view, 2131231547, "field 'mTvCard'");
    view = finder.findRequiredView(source, 2131231654, "field 'mTvMessage'");
    target.mTvMessage = finder.castView(view, 2131231654, "field 'mTvMessage'");
    view = finder.findRequiredView(source, 2131231665, "field 'mTvNext' and method 'onViewClicked'");
    target.mTvNext = finder.castView(view, 2131231665, "field 'mTvNext'");
    unbinder.view2131231665 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231142, "field 'mLlFootLayout'");
    target.mLlFootLayout = finder.castView(view, 2131231142, "field 'mLlFootLayout'");
    view = finder.findRequiredView(source, 2131231362, "field 'mRlRoot'");
    target.mRlRoot = finder.castView(view, 2131231362, "field 'mRlRoot'");
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231035, "field 'mIvImg'");
    target.mIvImg = finder.castView(view, 2131231035, "field 'mIvImg'");
    view = finder.findRequiredView(source, 2131231588, "field 'mCourseTime'");
    target.mCourseTime = finder.castView(view, 2131231588, "field 'mCourseTime'");
    view = finder.findRequiredView(source, 2131231364, "field 'mRlSelectCard' and method 'onViewClicked'");
    target.mRlSelectCard = finder.castView(view, 2131231364, "field 'mRlSelectCard'");
    unbinder.view2131231364 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231371, "method 'onViewClicked'");
    unbinder.view2131231371 = view;
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

  protected static class InnerUnbinder<T extends ExperienceLessonAppointmentActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231665;

    View view2131231364;

    View view2131231371;

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
      target.mCourseName = null;
      view2131231199.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvShopName = null;
      target.mTvShopAddress = null;
      target.mTvSelectTime = null;
      target.mTvSelectTeacher = null;
      target.mTvPeopleNum = null;
      target.mTvMobile = null;
      target.mTvCard = null;
      target.mTvMessage = null;
      view2131231665.setOnClickListener(null);
      target.mTvNext = null;
      target.mLlFootLayout = null;
      target.mRlRoot = null;
      target.mLlCommonLayout = null;
      target.mIvImg = null;
      target.mCourseTime = null;
      view2131231364.setOnClickListener(null);
      target.mRlSelectCard = null;
      view2131231371.setOnClickListener(null);
    }
  }
}
