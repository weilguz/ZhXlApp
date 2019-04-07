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

public class CourseCommentActivity$$ViewBinder<T extends CourseCommentActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231583, "field 'mTvCourseName'");
    target.mTvCourseName = finder.castView(view, 2131231583, "field 'mTvCourseName'");
    view = finder.findRequiredView(source, 2131231588, "field 'mTvCourseShop'");
    target.mTvCourseShop = finder.castView(view, 2131231588, "field 'mTvCourseShop'");
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
    view = finder.findRequiredView(source, 2131231038, "field 'mIvImg'");
    target.mIvImg = finder.castView(view, 2131231038, "field 'mIvImg'");
    view = finder.findRequiredView(source, 2131231591, "field 'mTvCourseTime'");
    target.mTvCourseTime = finder.castView(view, 2131231591, "field 'mTvCourseTime'");
    view = finder.findRequiredView(source, 2131231162, "field 'mLlLayoutPrice'");
    target.mLlLayoutPrice = finder.castView(view, 2131231162, "field 'mLlLayoutPrice'");
    view = finder.findRequiredView(source, 2131231354, "field 'mRlItemView'");
    target.mRlItemView = finder.castView(view, 2131231354, "field 'mRlItemView'");
    view = finder.findRequiredView(source, 2131230928, "field 'mEtComment'");
    target.mEtComment = finder.castView(view, 2131230928, "field 'mEtComment'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CourseCommentActivity> implements Unbinder {
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
      target.mTvCourseName = null;
      target.mTvCourseShop = null;
      view2131231202.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mTvTitleRight = null;
      view2131231203.setOnClickListener(null);
      target.mLlTitleRight = null;
      target.mLlCommonLayout = null;
      target.mIvImg = null;
      target.mTvCourseTime = null;
      target.mLlLayoutPrice = null;
      target.mRlItemView = null;
      target.mEtComment = null;
    }
  }
}
