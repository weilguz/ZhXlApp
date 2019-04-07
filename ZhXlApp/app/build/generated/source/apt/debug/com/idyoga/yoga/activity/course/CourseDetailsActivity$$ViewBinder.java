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

public class CourseDetailsActivity$$ViewBinder<T extends CourseDetailsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231016, "field 'mIvCourseImg'");
    target.mIvCourseImg = finder.castView(view, 2131231016, "field 'mIvCourseImg'");
    view = finder.findRequiredView(source, 2131231592, "field 'mTvCourseTitle'");
    target.mTvCourseTitle = finder.castView(view, 2131231592, "field 'mTvCourseTitle'");
    view = finder.findRequiredView(source, 2131231583, "field 'mTvCourseName'");
    target.mTvCourseName = finder.castView(view, 2131231583, "field 'mTvCourseName'");
    view = finder.findRequiredView(source, 2131231722, "field 'mTvState'");
    target.mTvState = finder.castView(view, 2131231722, "field 'mTvState'");
    view = finder.findRequiredView(source, 2131231574, "field 'mTvCourseAddress'");
    target.mTvCourseAddress = finder.castView(view, 2131231574, "field 'mTvCourseAddress'");
    view = finder.findRequiredView(source, 2131231591, "field 'mTvCourseTime'");
    target.mTvCourseTime = finder.castView(view, 2131231591, "field 'mTvCourseTime'");
    view = finder.findRequiredView(source, 2131231745, "field 'mTvTeacherName'");
    target.mTvTeacherName = finder.castView(view, 2131231745, "field 'mTvTeacherName'");
    view = finder.findRequiredView(source, 2131231202, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231202, "field 'mLlTitleBack'");
    unbinder.view2131231202 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    view = finder.findRequiredView(source, 2131231757, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231757, "field 'mTvTitleText'");
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CourseDetailsActivity> implements Unbinder {
    private T target;

    View view2131231202;

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
      target.mIvCourseImg = null;
      target.mTvCourseTitle = null;
      target.mTvCourseName = null;
      target.mTvState = null;
      target.mTvCourseAddress = null;
      target.mTvCourseTime = null;
      target.mTvTeacherName = null;
      view2131231202.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mLlCommonLayout = null;
    }
  }
}
