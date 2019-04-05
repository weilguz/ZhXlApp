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
    view = finder.findRequiredView(source, 2131231482, "field 'mTabView'");
    target.mTabView = finder.castView(view, 2131231482, "field 'mTabView'");
    view = finder.findRequiredView(source, 2131231712, "field 'mTvSort' and method 'onViewClicked'");
    target.mTvSort = finder.castView(view, 2131231712, "field 'mTvSort'");
    unbinder.view2131231712 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231616, "field 'mTvFilter' and method 'onViewClicked'");
    target.mTvFilter = finder.castView(view, 2131231616, "field 'mTvFilter'");
    unbinder.view2131231616 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231173, "field 'mLlMsg'");
    target.mLlMsg = finder.castView(view, 2131231173, "field 'mLlMsg'");
    view = finder.findRequiredView(source, 2131231407, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231407, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231467, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131231467, "field 'mRefreshLayout'");
    view = finder.findRequiredView(source, 2131231135, "field 'mLlContentLayout'");
    target.mLlContentLayout = finder.castView(view, 2131231135, "field 'mLlContentLayout'");
    view = finder.findRequiredView(source, 2131231064, "field 'mIvSort'");
    target.mIvSort = finder.castView(view, 2131231064, "field 'mIvSort'");
    view = finder.findRequiredView(source, 2131231020, "field 'mIvFilter'");
    target.mIvFilter = finder.castView(view, 2131231020, "field 'mIvFilter'");
    view = finder.findRequiredView(source, 2131231188, "field 'mLlSortLayout' and method 'onViewClicked'");
    target.mLlSortLayout = finder.castView(view, 2131231188, "field 'mLlSortLayout'");
    unbinder.view2131231188 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231141, "field 'mLlFilterLayout' and method 'onViewClicked'");
    target.mLlFilterLayout = finder.castView(view, 2131231141, "field 'mLlFilterLayout'");
    unbinder.view2131231141 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231126, "field 'mllAddressLayout' and method 'onViewClicked'");
    target.mllAddressLayout = finder.castView(view, 2131231126, "field 'mllAddressLayout'");
    unbinder.view2131231126 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231523, "field 'mTvAddress'");
    target.mTvAddress = finder.castView(view, 2131231523, "field 'mTvAddress'");
    view = finder.findRequiredView(source, 2131230997, "field 'mIvAddress'");
    target.mIvAddress = finder.castView(view, 2131230997, "field 'mIvAddress'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ShopExperienceCourseActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231712;

    View view2131231616;

    View view2131231188;

    View view2131231141;

    View view2131231126;

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
      target.mTabView = null;
      view2131231712.setOnClickListener(null);
      target.mTvSort = null;
      view2131231616.setOnClickListener(null);
      target.mTvFilter = null;
      target.mLlMsg = null;
      target.mRvList = null;
      target.mRefreshLayout = null;
      target.mLlContentLayout = null;
      target.mIvSort = null;
      target.mIvFilter = null;
      view2131231188.setOnClickListener(null);
      target.mLlSortLayout = null;
      view2131231141.setOnClickListener(null);
      target.mLlFilterLayout = null;
      view2131231126.setOnClickListener(null);
      target.mllAddressLayout = null;
      target.mTvAddress = null;
      target.mIvAddress = null;
    }
  }
}
