// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.shop;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ShopExperienceCourseActivity$$ViewBinder<T extends ShopExperienceCourseActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231485, "field 'mTabView'");
    target.mTabView = finder.castView(view, 2131231485, "field 'mTabView'");
    view = finder.findRequiredView(source, 2131231715, "field 'mTvSort' and method 'onViewClicked'");
    target.mTvSort = finder.castView(view, 2131231715, "field 'mTvSort'");
    unbinder.view2131231715 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231619, "field 'mTvFilter' and method 'onViewClicked'");
    target.mTvFilter = finder.castView(view, 2131231619, "field 'mTvFilter'");
    unbinder.view2131231619 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231176, "field 'mLlMsg'");
    target.mLlMsg = finder.castView(view, 2131231176, "field 'mLlMsg'");
    view = finder.findRequiredView(source, 2131231410, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231410, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231470, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131231470, "field 'mRefreshLayout'");
    view = finder.findRequiredView(source, 2131231138, "field 'mLlContentLayout'");
    target.mLlContentLayout = finder.castView(view, 2131231138, "field 'mLlContentLayout'");
    view = finder.findRequiredView(source, 2131231067, "field 'mIvSort'");
    target.mIvSort = finder.castView(view, 2131231067, "field 'mIvSort'");
    view = finder.findRequiredView(source, 2131231023, "field 'mIvFilter'");
    target.mIvFilter = finder.castView(view, 2131231023, "field 'mIvFilter'");
    view = finder.findRequiredView(source, 2131231191, "field 'mLlSortLayout' and method 'onViewClicked'");
    target.mLlSortLayout = finder.castView(view, 2131231191, "field 'mLlSortLayout'");
    unbinder.view2131231191 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231144, "field 'mLlFilterLayout' and method 'onViewClicked'");
    target.mLlFilterLayout = finder.castView(view, 2131231144, "field 'mLlFilterLayout'");
    unbinder.view2131231144 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231129, "field 'mllAddressLayout' and method 'onViewClicked'");
    target.mllAddressLayout = finder.castView(view, 2131231129, "field 'mllAddressLayout'");
    unbinder.view2131231129 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231526, "field 'mTvAddress'");
    target.mTvAddress = finder.castView(view, 2131231526, "field 'mTvAddress'");
    view = finder.findRequiredView(source, 2131231000, "field 'mIvAddress'");
    target.mIvAddress = finder.castView(view, 2131231000, "field 'mIvAddress'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ShopExperienceCourseActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231715;

    View view2131231619;

    View view2131231191;

    View view2131231144;

    View view2131231129;

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
      target.mTabView = null;
      view2131231715.setOnClickListener(null);
      target.mTvSort = null;
      view2131231619.setOnClickListener(null);
      target.mTvFilter = null;
      target.mLlMsg = null;
      target.mRvList = null;
      target.mRefreshLayout = null;
      target.mLlContentLayout = null;
      target.mIvSort = null;
      target.mIvFilter = null;
      view2131231191.setOnClickListener(null);
      target.mLlSortLayout = null;
      view2131231144.setOnClickListener(null);
      target.mLlFilterLayout = null;
      view2131231129.setOnClickListener(null);
      target.mllAddressLayout = null;
      target.mTvAddress = null;
      target.mIvAddress = null;
    }
  }
}
