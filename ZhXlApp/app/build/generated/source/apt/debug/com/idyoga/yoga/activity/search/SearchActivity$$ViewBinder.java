// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.search;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SearchActivity$$ViewBinder<T extends SearchActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231526, "field 'mTvAddress' and method 'onViewClicked'");
    target.mTvAddress = finder.castView(view, 2131231526, "field 'mTvAddress'");
    unbinder.view2131231526 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230940, "field 'mEtSearch'");
    target.mEtSearch = finder.castView(view, 2131230940, "field 'mEtSearch'");
    view = finder.findRequiredView(source, 2131231058, "field 'mIvSearch' and method 'onViewClicked'");
    target.mIvSearch = finder.castView(view, 2131231058, "field 'mIvSearch'");
    unbinder.view2131231058 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231342, "field 'mRlCommonLayout'");
    target.mRlCommonLayout = finder.castView(view, 2131231342, "field 'mRlCommonLayout'");
    view = finder.findRequiredView(source, 2131231485, "field 'mTabView'");
    target.mTabView = finder.castView(view, 2131231485, "field 'mTabView'");
    view = finder.findRequiredView(source, 2131231816, "field 'mVpView'");
    target.mVpView = finder.castView(view, 2131231816, "field 'mVpView'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SearchActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231526;

    View view2131231058;

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
      view2131231526.setOnClickListener(null);
      target.mTvAddress = null;
      target.mEtSearch = null;
      view2131231058.setOnClickListener(null);
      target.mIvSearch = null;
      target.mRlCommonLayout = null;
      target.mTabView = null;
      target.mVpView = null;
    }
  }
}
