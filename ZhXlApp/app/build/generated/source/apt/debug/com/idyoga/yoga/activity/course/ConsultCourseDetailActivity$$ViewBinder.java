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

public class ConsultCourseDetailActivity$$ViewBinder<T extends ConsultCourseDetailActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231199, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231199, "field 'mLlTitleBack'");
    unbinder.view2131231199 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231200, "field 'mLlTitleRight' and method 'onViewClicked'");
    target.mLlTitleRight = finder.castView(view, 2131231200, "field 'mLlTitleRight'");
    unbinder.view2131231200 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231035, "field 'mIvImg'");
    target.mIvImg = finder.castView(view, 2131231035, "field 'mIvImg'");
    view = finder.findRequiredView(source, 2131231580, "field 'mTvCourseName'");
    target.mTvCourseName = finder.castView(view, 2131231580, "field 'mTvCourseName'");
    view = finder.findRequiredView(source, 2131231591, "field 'mTvCourseTutor'");
    target.mTvCourseTutor = finder.castView(view, 2131231591, "field 'mTvCourseTutor'");
    view = finder.findRequiredView(source, 2131231588, "field 'mTvCourseTime'");
    target.mTvCourseTime = finder.castView(view, 2131231588, "field 'mTvCourseTime'");
    view = finder.findRequiredView(source, 2131231351, "field 'mRlItemView'");
    target.mRlItemView = finder.castView(view, 2131231351, "field 'mRlItemView'");
    view = finder.findRequiredView(source, 2131231488, "field 'mTagView'");
    target.mTagView = finder.castView(view, 2131231488, "field 'mTagView'");
    view = finder.findRequiredView(source, 2131231155, "field 'mLlLayoutItem'");
    target.mLlLayoutItem = finder.castView(view, 2131231155, "field 'mLlLayoutItem'");
    view = finder.findRequiredView(source, 2131231707, "field 'mTvShopName'");
    target.mTvShopName = finder.castView(view, 2131231707, "field 'mTvShopName'");
    view = finder.findRequiredView(source, 2131231704, "field 'mTvShopAddress'");
    target.mTvShopAddress = finder.castView(view, 2131231704, "field 'mTvShopAddress'");
    view = finder.findRequiredView(source, 2131231706, "field 'mTvShopMobile'");
    target.mTvShopMobile = finder.castView(view, 2131231706, "field 'mTvShopMobile'");
    view = finder.findRequiredView(source, 2131231750, "field 'mTvTimeType'");
    target.mTvTimeType = finder.castView(view, 2131231750, "field 'mTvTimeType'");
    view = finder.findRequiredView(source, 2131231613, "field 'mTvExpect'");
    target.mTvExpect = finder.castView(view, 2131231613, "field 'mTvExpect'");
    view = finder.findRequiredView(source, 2131231479, "field 'mSvView'");
    target.mSvView = finder.castView(view, 2131231479, "field 'mSvView'");
    view = finder.findRequiredView(source, 2131231665, "field 'mTvNext'");
    target.mTvNext = finder.castView(view, 2131231665, "field 'mTvNext'");
    view = finder.findRequiredView(source, 2131231142, "field 'mLlFootLayout'");
    target.mLlFootLayout = finder.castView(view, 2131231142, "field 'mLlFootLayout'");
    view = finder.findRequiredView(source, 2131231754, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231754, "field 'mTvTitleText'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ConsultCourseDetailActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231200;

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
      view2131231199.setOnClickListener(null);
      target.mLlTitleBack = null;
      view2131231200.setOnClickListener(null);
      target.mLlTitleRight = null;
      target.mLlCommonLayout = null;
      target.mIvImg = null;
      target.mTvCourseName = null;
      target.mTvCourseTutor = null;
      target.mTvCourseTime = null;
      target.mRlItemView = null;
      target.mTagView = null;
      target.mLlLayoutItem = null;
      target.mTvShopName = null;
      target.mTvShopAddress = null;
      target.mTvShopMobile = null;
      target.mTvTimeType = null;
      target.mTvExpect = null;
      target.mSvView = null;
      target.mTvNext = null;
      target.mLlFootLayout = null;
      target.mTvTitleText = null;
    }
  }
}
