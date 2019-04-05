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
    view = finder.findRequiredView(source, 2131231407, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231407, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231467, "field 'mSrlRefresh'");
    target.mSrlRefresh = finder.castView(view, 2131231467, "field 'mSrlRefresh'");
    view = finder.findRequiredView(source, 2131231353, "field 'mRvLayout'");
    target.mRvLayout = finder.castView(view, 2131231353, "field 'mRvLayout'");
    view = finder.findRequiredView(source, 2131231753, "field 'mTvTitleRight' and method 'onViewClicked'");
    target.mTvTitleRight = finder.castView(view, 2131231753, "field 'mTvTitleRight'");
    unbinder.view2131231753 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231200, "field 'mLlTitleRight'");
    target.mLlTitleRight = finder.castView(view, 2131231200, "field 'mLlTitleRight'");
    view = finder.findRequiredView(source, 2131231543, "field 'mTvCall' and method 'onViewClicked'");
    target.mTvCall = finder.castView(view, 2131231543, "field 'mTvCall'");
    unbinder.view2131231543 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout' and method 'onViewClicked'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    unbinder.view2131231133 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    view = finder.findRequiredView(source, 2131231779, "field 'mView'");
    target.mView = view;
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ShopDetailActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231753;

    View view2131231543;

    View view2131231133;

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
      target.mRvList = null;
      target.mSrlRefresh = null;
      target.mRvLayout = null;
      view2131231753.setOnClickListener(null);
      target.mTvTitleRight = null;
      target.mLlTitleRight = null;
      view2131231543.setOnClickListener(null);
      target.mTvCall = null;
      view2131231133.setOnClickListener(null);
      target.mLlCommonLayout = null;
      target.mView = null;
    }
  }
}
