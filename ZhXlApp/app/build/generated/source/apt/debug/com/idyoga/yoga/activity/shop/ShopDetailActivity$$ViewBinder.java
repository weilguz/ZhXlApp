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

public class ShopDetailActivity$$ViewBinder<T extends ShopDetailActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231410, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231410, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231470, "field 'mSrlRefresh'");
    target.mSrlRefresh = finder.castView(view, 2131231470, "field 'mSrlRefresh'");
    view = finder.findRequiredView(source, 2131231356, "field 'mRvLayout'");
    target.mRvLayout = finder.castView(view, 2131231356, "field 'mRvLayout'");
    view = finder.findRequiredView(source, 2131231756, "field 'mTvTitleRight' and method 'onViewClicked'");
    target.mTvTitleRight = finder.castView(view, 2131231756, "field 'mTvTitleRight'");
    unbinder.view2131231756 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231203, "field 'mLlTitleRight'");
    target.mLlTitleRight = finder.castView(view, 2131231203, "field 'mLlTitleRight'");
    view = finder.findRequiredView(source, 2131231546, "field 'mTvCall' and method 'onViewClicked'");
    target.mTvCall = finder.castView(view, 2131231546, "field 'mTvCall'");
    unbinder.view2131231546 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout' and method 'onViewClicked'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    unbinder.view2131231136 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    view = finder.findRequiredView(source, 2131231782, "field 'mView'");
    target.mView = view;
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ShopDetailActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231756;

    View view2131231546;

    View view2131231136;

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
      target.mRvList = null;
      target.mSrlRefresh = null;
      target.mRvLayout = null;
      view2131231756.setOnClickListener(null);
      target.mTvTitleRight = null;
      target.mLlTitleRight = null;
      view2131231546.setOnClickListener(null);
      target.mTvCall = null;
      view2131231136.setOnClickListener(null);
      target.mLlCommonLayout = null;
      target.mView = null;
    }
  }
}
