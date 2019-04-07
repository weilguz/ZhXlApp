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

public class OfflineCourseBuyActivity$$ViewBinder<T extends OfflineCourseBuyActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231203, "field 'mLlTitleRight'");
    target.mLlTitleRight = finder.castView(view, 2131231203, "field 'mLlTitleRight'");
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231038, "field 'mIvImg'");
    target.mIvImg = finder.castView(view, 2131231038, "field 'mIvImg'");
    view = finder.findRequiredView(source, 2131231583, "field 'mTvCourseName'");
    target.mTvCourseName = finder.castView(view, 2131231583, "field 'mTvCourseName'");
    view = finder.findRequiredView(source, 2131231594, "field 'mTvCourseTutor'");
    target.mTvCourseTutor = finder.castView(view, 2131231594, "field 'mTvCourseTutor'");
    view = finder.findRequiredView(source, 2131231591, "field 'mTvCourseTime'");
    target.mTvCourseTime = finder.castView(view, 2131231591, "field 'mTvCourseTime'");
    view = finder.findRequiredView(source, 2131231354, "field 'mRlItemView'");
    target.mRlItemView = finder.castView(view, 2131231354, "field 'mRlItemView'");
    view = finder.findRequiredView(source, 2131231491, "field 'mTagView'");
    target.mTagView = finder.castView(view, 2131231491, "field 'mTagView'");
    view = finder.findRequiredView(source, 2131231158, "field 'mLlLayoutItem'");
    target.mLlLayoutItem = finder.castView(view, 2131231158, "field 'mLlLayoutItem'");
    view = finder.findRequiredView(source, 2131231526, "field 'mTvAddress'");
    target.mTvAddress = finder.castView(view, 2131231526, "field 'mTvAddress'");
    view = finder.findRequiredView(source, 2131231749, "field 'mTvTime'");
    target.mTvTime = finder.castView(view, 2131231749, "field 'mTvTime'");
    view = finder.findRequiredView(source, 2131231746, "field 'mTvTell'");
    target.mTvTell = finder.castView(view, 2131231746, "field 'mTvTell'");
    view = finder.findRequiredView(source, 2131231543, "field 'mTvBuyCard' and method 'onViewClicked'");
    target.mTvBuyCard = finder.castView(view, 2131231543, "field 'mTvBuyCard'");
    unbinder.view2131231543 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231322, "field 'mRgView'");
    target.mRgView = finder.castView(view, 2131231322, "field 'mRgView'");
    view = finder.findRequiredView(source, 2131231062, "field 'mIvShare'");
    target.mIvShare = finder.castView(view, 2131231062, "field 'mIvShare'");
    view = finder.findRequiredView(source, 2131231571, "field 'mTvConsult'");
    target.mTvConsult = finder.castView(view, 2131231571, "field 'mTvConsult'");
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
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends OfflineCourseBuyActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231543;

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
      view2131231202.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mTvTitleRight = null;
      target.mLlTitleRight = null;
      target.mLlCommonLayout = null;
      target.mIvImg = null;
      target.mTvCourseName = null;
      target.mTvCourseTutor = null;
      target.mTvCourseTime = null;
      target.mRlItemView = null;
      target.mTagView = null;
      target.mLlLayoutItem = null;
      target.mTvAddress = null;
      target.mTvTime = null;
      target.mTvTell = null;
      view2131231543.setOnClickListener(null);
      target.mTvBuyCard = null;
      target.mRgView = null;
      target.mIvShare = null;
      target.mTvConsult = null;
      view2131231668.setOnClickListener(null);
      target.mTvNext = null;
      target.mLlFootLayout = null;
    }
  }
}
