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

public class AppointmentCourseDetailActivity$$ViewBinder<T extends AppointmentCourseDetailActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231722, "field 'mTvState'");
    target.mTvState = finder.castView(view, 2131231722, "field 'mTvState'");
    view = finder.findRequiredView(source, 2131231070, "field 'mIvState'");
    target.mIvState = finder.castView(view, 2131231070, "field 'mIvState'");
    view = finder.findRequiredView(source, 2131231583, "field 'mTvCourseName'");
    target.mTvCourseName = finder.castView(view, 2131231583, "field 'mTvCourseName'");
    view = finder.findRequiredView(source, 2131231591, "field 'mTvCourseTime'");
    target.mTvCourseTime = finder.castView(view, 2131231591, "field 'mTvCourseTime'");
    view = finder.findRequiredView(source, 2131231710, "field 'mTvShopName'");
    target.mTvShopName = finder.castView(view, 2131231710, "field 'mTvShopName'");
    view = finder.findRequiredView(source, 2131231526, "field 'mTvAddress' and method 'onViewClicked'");
    target.mTvAddress = finder.castView(view, 2131231526, "field 'mTvAddress'");
    unbinder.view2131231526 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231188, "field 'mLlService' and method 'onViewClicked'");
    target.mLlService = finder.castView(view, 2131231188, "field 'mLlService'");
    unbinder.view2131231188 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231482, "field 'mSvView'");
    target.mSvView = finder.castView(view, 2131231482, "field 'mSvView'");
    view = finder.findRequiredView(source, 2131231728, "field 'mTvSubmit' and method 'onViewClicked'");
    target.mTvSubmit = finder.castView(view, 2131231728, "field 'mTvSubmit'");
    unbinder.view2131231728 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231623, "field 'mTvFollowTitle'");
    target.mTvFollowTitle = finder.castView(view, 2131231623, "field 'mTvFollowTitle'");
    view = finder.findRequiredView(source, 2131231621, "field 'mTvFollow'");
    target.mTvFollow = finder.castView(view, 2131231621, "field 'mTvFollow'");
    view = finder.findRequiredView(source, 2131231692, "field 'mTvResultState'");
    target.mTvResultState = finder.castView(view, 2131231692, "field 'mTvResultState'");
    view = finder.findRequiredView(source, 2131231693, "field 'mTvResultTime'");
    target.mTvResultTime = finder.castView(view, 2131231693, "field 'mTvResultTime'");
    view = finder.findRequiredView(source, 2131231720, "field 'mTvStartState'");
    target.mTvStartState = finder.castView(view, 2131231720, "field 'mTvStartState'");
    view = finder.findRequiredView(source, 2131231721, "field 'mTvStartTime'");
    target.mTvStartTime = finder.castView(view, 2131231721, "field 'mTvStartTime'");
    view = finder.findRequiredView(source, 2131231753, "field 'mTvTimeType'");
    target.mTvTimeType = finder.castView(view, 2131231753, "field 'mTvTimeType'");
    view = finder.findRequiredView(source, 2131231192, "field 'mLlStartState'");
    target.mLlStartState = finder.castView(view, 2131231192, "field 'mLlStartState'");
    view = finder.findRequiredView(source, 2131231793, "field 'mVState'");
    target.mVState = view;
    view = finder.findRequiredView(source, 2131231055, "field 'mIvResultStateRight'");
    target.mIvResultStateRight = finder.castView(view, 2131231055, "field 'mIvResultStateRight'");
    view = finder.findRequiredView(source, 2131231387, "field 'mRlvHead'");
    target.mRlvHead = finder.castView(view, 2131231387, "field 'mRlvHead'");
    view = finder.findRequiredView(source, 2131231470, "field 'mSrlRefresh'");
    target.mSrlRefresh = finder.castView(view, 2131231470, "field 'mSrlRefresh'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends AppointmentCourseDetailActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231526;

    View view2131231188;

    View view2131231728;

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
      target.mTvState = null;
      target.mIvState = null;
      target.mTvCourseName = null;
      target.mTvCourseTime = null;
      target.mTvShopName = null;
      view2131231526.setOnClickListener(null);
      target.mTvAddress = null;
      view2131231188.setOnClickListener(null);
      target.mLlService = null;
      target.mSvView = null;
      view2131231728.setOnClickListener(null);
      target.mTvSubmit = null;
      target.mTvFollowTitle = null;
      target.mTvFollow = null;
      target.mTvResultState = null;
      target.mTvResultTime = null;
      target.mTvStartState = null;
      target.mTvStartTime = null;
      target.mTvTimeType = null;
      target.mLlStartState = null;
      target.mVState = null;
      target.mIvResultStateRight = null;
      target.mRlvHead = null;
      target.mSrlRefresh = null;
    }
  }
}
