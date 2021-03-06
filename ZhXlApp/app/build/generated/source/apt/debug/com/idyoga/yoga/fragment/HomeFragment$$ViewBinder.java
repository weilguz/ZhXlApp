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

public class HomeFragment$$ViewBinder<T extends HomeFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231183, "field 'mLlHomeTitle'");
    target.mLlHomeTitle = finder.castView(view, 2131231183, "field 'mLlHomeTitle'");
    view = finder.findRequiredView(source, 2131231000, "field 'mIvAddress'");
    target.mIvAddress = finder.castView(view, 2131231000, "field 'mIvAddress'");
    view = finder.findRequiredView(source, 2131231058, "field 'mIcSearch' and method 'onViewClicked'");
    target.mIcSearch = finder.castView(view, 2131231058, "field 'mIcSearch'");
    unbinder.view2131231058 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
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
    view = finder.findRequiredView(source, 2131231104, "field 'mLayout'");
    target.mLayout = finder.castView(view, 2131231104, "field 'mLayout'");
    view = finder.findRequiredView(source, 2131230957, "field 'mFlContent'");
    target.mFlContent = finder.castView(view, 2131230957, "field 'mFlContent'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends HomeFragment> implements Unbinder {
    private T target;

    View view2131231058;

    View view2131231128;

    View view2131230940;

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
      target.mLlHomeTitle = null;
      target.mIvAddress = null;
      view2131231058.setOnClickListener(null);
      target.mIcSearch = null;
      target.mTvAddress = null;
      view2131231128.setOnClickListener(null);
      target.mLlAddress = null;
      view2131230940.setOnClickListener(null);
      target.mEtSearch = null;
      target.mLayout = null;
      target.mFlContent = null;
    }
  }
}
