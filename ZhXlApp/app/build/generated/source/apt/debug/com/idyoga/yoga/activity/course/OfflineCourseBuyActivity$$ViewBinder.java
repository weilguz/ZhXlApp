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
    view = finder.findRequiredView(source, 2131231199, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231199, "field 'mLlTitleBack'");
    unbinder.view2131231199 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231754, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231754, "field 'mTvTitleText'");
    view = finder.findRequiredView(source, 2131231753, "field 'mTvTitleRight'");
    target.mTvTitleRight = finder.castView(view, 2131231753, "field 'mTvTitleRight'");
    view = finder.findRequiredView(source, 2131231200, "field 'mLlTitleRight'");
    target.mLlTitleRight = finder.castView(view, 2131231200, "field 'mLlTitleRight'");
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
    view = finder.findRequiredView(source, 2131231523, "field 'mTvAddress'");
    target.mTvAddress = finder.castView(view, 2131231523, "field 'mTvAddress'");
    view = finder.findRequiredView(source, 2131231746, "field 'mTvTime'");
    target.mTvTime = finder.castView(view, 2131231746, "field 'mTvTime'");
    view = finder.findRequiredView(source, 2131231743, "field 'mTvTell'");
    target.mTvTell = finder.castView(view, 2131231743, "field 'mTvTell'");
    view = finder.findRequiredView(source, 2131231540, "field 'mTvBuyCard' and method 'onViewClicked'");
    target.mTvBuyCard = finder.castView(view, 2131231540, "field 'mTvBuyCard'");
    unbinder.view2131231540 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231319, "field 'mRgView'");
    target.mRgView = finder.castView(view, 2131231319, "field 'mRgView'");
    view = finder.findRequiredView(source, 2131231059, "field 'mIvShare'");
    target.mIvShare = finder.castView(view, 2131231059, "field 'mIvShare'");
    view = finder.findRequiredView(source, 2131231568, "field 'mTvConsult'");
    target.mTvConsult = finder.castView(view, 2131231568, "field 'mTvConsult'");
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
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends OfflineCourseBuyActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231540;

    View view2131231665;

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
      view2131231540.setOnClickListener(null);
      target.mTvBuyCard = null;
      target.mRgView = null;
      target.mIvShare = null;
      target.mTvConsult = null;
      view2131231665.setOnClickListener(null);
      target.mTvNext = null;
      target.mLlFootLayout = null;
    }
  }
}
