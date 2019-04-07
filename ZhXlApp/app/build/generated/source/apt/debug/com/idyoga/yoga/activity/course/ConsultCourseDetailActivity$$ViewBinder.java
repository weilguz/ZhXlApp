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
    view = finder.findRequiredView(source, 2131231202, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231202, "field 'mLlTitleBack'");
    unbinder.view2131231202 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
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
    view = finder.findRequiredView(source, 2131231710, "field 'mTvShopName'");
    target.mTvShopName = finder.castView(view, 2131231710, "field 'mTvShopName'");
    view = finder.findRequiredView(source, 2131231707, "field 'mTvShopAddress'");
    target.mTvShopAddress = finder.castView(view, 2131231707, "field 'mTvShopAddress'");
    view = finder.findRequiredView(source, 2131231709, "field 'mTvShopMobile'");
    target.mTvShopMobile = finder.castView(view, 2131231709, "field 'mTvShopMobile'");
    view = finder.findRequiredView(source, 2131231753, "field 'mTvTimeType'");
    target.mTvTimeType = finder.castView(view, 2131231753, "field 'mTvTimeType'");
    view = finder.findRequiredView(source, 2131231616, "field 'mTvExpect'");
    target.mTvExpect = finder.castView(view, 2131231616, "field 'mTvExpect'");
    view = finder.findRequiredView(source, 2131231482, "field 'mSvView'");
    target.mSvView = finder.castView(view, 2131231482, "field 'mSvView'");
    view = finder.findRequiredView(source, 2131231668, "field 'mTvNext'");
    target.mTvNext = finder.castView(view, 2131231668, "field 'mTvNext'");
    view = finder.findRequiredView(source, 2131231145, "field 'mLlFootLayout'");
    target.mLlFootLayout = finder.castView(view, 2131231145, "field 'mLlFootLayout'");
    view = finder.findRequiredView(source, 2131231757, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231757, "field 'mTvTitleText'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ConsultCourseDetailActivity> implements Unbinder {
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
      view2131231203.setOnClickListener(null);
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
