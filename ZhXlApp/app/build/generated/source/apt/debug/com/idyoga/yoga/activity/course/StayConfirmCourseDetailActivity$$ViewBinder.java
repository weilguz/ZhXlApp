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

public class StayConfirmCourseDetailActivity$$ViewBinder<T extends StayConfirmCourseDetailActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231035, "field 'mIvImg'");
    target.mIvImg = finder.castView(view, 2131231035, "field 'mIvImg'");
    view = finder.findRequiredView(source, 2131231580, "field 'mTvCourseName'");
    target.mTvCourseName = finder.castView(view, 2131231580, "field 'mTvCourseName'");
    view = finder.findRequiredView(source, 2131231573, "field 'mTvCourseDate'");
    target.mTvCourseDate = finder.castView(view, 2131231573, "field 'mTvCourseDate'");
    view = finder.findRequiredView(source, 2131231588, "field 'mTvCourseTime'");
    target.mTvCourseTime = finder.castView(view, 2131231588, "field 'mTvCourseTime'");
    view = finder.findRequiredView(source, 2131231351, "field 'mRlItemView'");
    target.mRlItemView = finder.castView(view, 2131231351, "field 'mRlItemView'");
    view = finder.findRequiredView(source, 2131231488, "field 'mTagView'");
    target.mTagView = finder.castView(view, 2131231488, "field 'mTagView'");
    view = finder.findRequiredView(source, 2131231155, "field 'mLlLayoutItem'");
    target.mLlLayoutItem = finder.castView(view, 2131231155, "field 'mLlLayoutItem'");
    view = finder.findRequiredView(source, 2131231708, "field 'mTvShopNameTag'");
    target.mTvShopNameTag = finder.castView(view, 2131231708, "field 'mTvShopNameTag'");
    view = finder.findRequiredView(source, 2131231707, "field 'mTvShopName'");
    target.mTvShopName = finder.castView(view, 2131231707, "field 'mTvShopName'");
    view = finder.findRequiredView(source, 2131231006, "field 'mIvCall' and method 'onViewClicked'");
    target.mIvCall = finder.castView(view, 2131231006, "field 'mIvCall'");
    unbinder.view2131231006 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231704, "field 'mTvShopAddress'");
    target.mTvShopAddress = finder.castView(view, 2131231704, "field 'mTvShopAddress'");
    view = finder.findRequiredView(source, 2131230997, "field 'mIvAddress' and method 'onViewClicked'");
    target.mIvAddress = finder.castView(view, 2131230997, "field 'mIvAddress'");
    unbinder.view2131230997 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231051, "field 'mIvQrCode'");
    target.mIvQrCode = finder.castView(view, 2131231051, "field 'mIvQrCode'");
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCourseQrCode'");
    target.mLlCourseQrCode = finder.castView(view, 2131231136, "field 'mLlCourseQrCode'");
    view = finder.findRequiredView(source, 2131231191, "field 'mLlSuccessLayout'");
    target.mLlSuccessLayout = finder.castView(view, 2131231191, "field 'mLlSuccessLayout'");
    view = finder.findRequiredView(source, 2131231545, "field 'mTvCancel' and method 'onViewClicked'");
    target.mTvCancel = finder.castView(view, 2131231545, "field 'mTvCancel'");
    unbinder.view2131231545 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231719, "field 'mTvState' and method 'onViewClicked'");
    target.mTvState = finder.castView(view, 2131231719, "field 'mTvState'");
    unbinder.view2131231719 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231711, "field 'mTvSignState'");
    target.mTvSignState = finder.castView(view, 2131231711, "field 'mTvSignState'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends StayConfirmCourseDetailActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231006;

    View view2131230997;

    View view2131231545;

    View view2131231719;

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
      target.mLlCommonLayout = null;
      target.mIvImg = null;
      target.mTvCourseName = null;
      target.mTvCourseDate = null;
      target.mTvCourseTime = null;
      target.mRlItemView = null;
      target.mTagView = null;
      target.mLlLayoutItem = null;
      target.mTvShopNameTag = null;
      target.mTvShopName = null;
      view2131231006.setOnClickListener(null);
      target.mIvCall = null;
      target.mTvShopAddress = null;
      view2131230997.setOnClickListener(null);
      target.mIvAddress = null;
      target.mIvQrCode = null;
      target.mLlCourseQrCode = null;
      target.mLlSuccessLayout = null;
      view2131231545.setOnClickListener(null);
      target.mTvCancel = null;
      view2131231719.setOnClickListener(null);
      target.mTvState = null;
      target.mTvSignState = null;
    }
  }
}
