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
    view = finder.findRequiredView(source, 2131231583, "field 'mCourseName'");
    target.mCourseName = finder.castView(view, 2131231583, "field 'mCourseName'");
    view = finder.findRequiredView(source, 2131231202, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231202, "field 'mLlTitleBack'");
    unbinder.view2131231202 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231710, "field 'mTvShopName'");
    target.mTvShopName = finder.castView(view, 2131231710, "field 'mTvShopName'");
    view = finder.findRequiredView(source, 2131231707, "field 'mTvShopAddress'");
    target.mTvShopAddress = finder.castView(view, 2131231707, "field 'mTvShopAddress'");
    view = finder.findRequiredView(source, 2131231704, "field 'mTvSelectTime'");
    target.mTvSelectTime = finder.castView(view, 2131231704, "field 'mTvSelectTime'");
    view = finder.findRequiredView(source, 2131231702, "field 'mTvSelectTeacher'");
    target.mTvSelectTeacher = finder.castView(view, 2131231702, "field 'mTvSelectTeacher'");
    view = finder.findRequiredView(source, 2131231681, "field 'mTvPeopleNum'");
    target.mTvPeopleNum = finder.castView(view, 2131231681, "field 'mTvPeopleNum'");
    view = finder.findRequiredView(source, 2131231659, "field 'mTvMobile'");
    target.mTvMobile = finder.castView(view, 2131231659, "field 'mTvMobile'");
    view = finder.findRequiredView(source, 2131231550, "field 'mTvCard'");
    target.mTvCard = finder.castView(view, 2131231550, "field 'mTvCard'");
    view = finder.findRequiredView(source, 2131231657, "field 'mTvMessage'");
    target.mTvMessage = finder.castView(view, 2131231657, "field 'mTvMessage'");
    view = finder.findRequiredView(source, 2131231668, "field 'mTvNext' and method 'onViewClicked'");
    target.mTvNext = finder.castView(view, 2131231668, "field 'mTvNext'");
    unbinder.view2131231668 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231145, "field 'mLlFootLayout'");
    target.mLlFootLayout = finder.castView(view, 2131231145, "field 'mLlFootLayout'");
    view = finder.findRequiredView(source, 2131231365, "field 'mRlRoot'");
    target.mRlRoot = finder.castView(view, 2131231365, "field 'mRlRoot'");
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231038, "field 'mIvImg'");
    target.mIvImg = finder.castView(view, 2131231038, "field 'mIvImg'");
    view = finder.findRequiredView(source, 2131231591, "field 'mCourseTime'");
    target.mCourseTime = finder.castView(view, 2131231591, "field 'mCourseTime'");
    view = finder.findRequiredView(source, 2131231367, "field 'mRlSelectCard' and method 'onViewClicked'");
    target.mRlSelectCard = finder.castView(view, 2131231367, "field 'mRlSelectCard'");
    unbinder.view2131231367 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231374, "method 'onViewClicked'");
    unbinder.view2131231374 = view;
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

    View view2131231202;

    View view2131231668;

    View view2131231367;

    View view2131231374;

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
      view2131231202.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvShopName = null;
      target.mTvShopAddress = null;
      target.mTvSelectTime = null;
      target.mTvSelectTeacher = null;
      target.mTvPeopleNum = null;
      target.mTvMobile = null;
      target.mTvCard = null;
      target.mTvMessage = null;
      view2131231668.setOnClickListener(null);
      target.mTvNext = null;
      target.mLlFootLayout = null;
      target.mRlRoot = null;
      target.mLlCommonLayout = null;
      target.mIvImg = null;
      target.mCourseTime = null;
      view2131231367.setOnClickListener(null);
      target.mRlSelectCard = null;
      view2131231374.setOnClickListener(null);
    }
  }
}
