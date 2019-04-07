// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class VideoFragment$$ViewBinder<T extends VideoFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231000, "field 'mIvAddress'");
    target.mIvAddress = finder.castView(view, 2131231000, "field 'mIvAddress'");
    view = finder.findRequiredView(source, 2131231526, "field 'mTvAddress'");
    target.mTvAddress = finder.castView(view, 2131231526, "field 'mTvAddress'");
    view = finder.findRequiredView(source, 2131231128, "field 'mLlAddress' and method 'onViewClicked'");
    target.mLlAddress = finder.castView(view, 2131231128, "field 'mLlAddress'");
    unbinder.view2131231128 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230940, "field 'mEtSearch' and method 'onViewClicked'");
    target.mEtSearch = finder.castView(view, 2131230940, "field 'mEtSearch'");
    unbinder.view2131230940 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231058, "field 'mIvSearch' and method 'onViewClicked'");
    target.mIvSearch = finder.castView(view, 2131231058, "field 'mIvSearch'");
    unbinder.view2131231058 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231183, "field 'mLlSearchTitle'");
    target.mLlSearchTitle = finder.castView(view, 2131231183, "field 'mLlSearchTitle'");
    view = finder.findRequiredView(source, 2131231410, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231410, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231470, "field 'mSrlRefresh'");
    target.mSrlRefresh = finder.castView(view, 2131231470, "field 'mSrlRefresh'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends VideoFragment> implements Unbinder {
    private T target;

    View view2131231128;

    View view2131230940;

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
      target.mIvAddress = null;
      target.mTvAddress = null;
      view2131231128.setOnClickListener(null);
      target.mLlAddress = null;
      view2131230940.setOnClickListener(null);
      target.mEtSearch = null;
      view2131231058.setOnClickListener(null);
      target.mIvSearch = null;
      target.mLlSearchTitle = null;
      target.mRvList = null;
      target.mSrlRefresh = null;
    }
  }
}
