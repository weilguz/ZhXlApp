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

public class ShopListActivity$$ViewBinder<T extends ShopListActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231410, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231410, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231739, "field 'mTvTagA'");
    target.mTvTagA = finder.castView(view, 2131231739, "field 'mTvTagA'");
    view = finder.findRequiredView(source, 2131231076, "field 'mIvTagA'");
    target.mIvTagA = finder.castView(view, 2131231076, "field 'mIvTagA'");
    view = finder.findRequiredView(source, 2131231197, "field 'mLlTagA' and method 'onViewClicked'");
    target.mLlTagA = finder.castView(view, 2131231197, "field 'mLlTagA'");
    unbinder.view2131231197 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231740, "field 'mTvTagB'");
    target.mTvTagB = finder.castView(view, 2131231740, "field 'mTvTagB'");
    view = finder.findRequiredView(source, 2131231077, "field 'mIvTagB'");
    target.mIvTagB = finder.castView(view, 2131231077, "field 'mIvTagB'");
    view = finder.findRequiredView(source, 2131231198, "field 'mLlTagB' and method 'onViewClicked'");
    target.mLlTagB = finder.castView(view, 2131231198, "field 'mLlTagB'");
    unbinder.view2131231198 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231701, "field 'mTvSelectClassify' and method 'onViewClicked'");
    target.mTvSelectClassify = finder.castView(view, 2131231701, "field 'mTvSelectClassify'");
    unbinder.view2131231701 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ShopListActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231197;

    View view2131231198;

    View view2131231701;

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
      target.mRvList = null;
      target.mTvTagA = null;
      target.mIvTagA = null;
      view2131231197.setOnClickListener(null);
      target.mLlTagA = null;
      target.mTvTagB = null;
      target.mIvTagB = null;
      view2131231198.setOnClickListener(null);
      target.mLlTagB = null;
      view2131231701.setOnClickListener(null);
      target.mTvSelectClassify = null;
    }
  }
}
