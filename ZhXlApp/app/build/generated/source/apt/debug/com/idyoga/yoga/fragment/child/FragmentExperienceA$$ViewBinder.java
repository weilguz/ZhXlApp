// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment.child;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class FragmentExperienceA$$ViewBinder<T extends FragmentExperienceA> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231467, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131231467, "field 'mRefreshLayout'");
    view = finder.findRequiredView(source, 2131230836, "field 'mBannerV'");
    target.mBannerV = finder.castView(view, 2131230836, "field 'mBannerV'");
    view = finder.findRequiredView(source, 2131230971, "field 'mGvView'");
    target.mGvView = finder.castView(view, 2131230971, "field 'mGvView'");
    view = finder.findRequiredView(source, 2131231083, "field 'mIvTop' and method 'onViewClicked'");
    target.mIvTop = finder.castView(view, 2131231083, "field 'mIvTop'");
    unbinder.view2131231083 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231407, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231407, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131231479, "field 'mSvView'");
    target.mSvView = finder.castView(view, 2131231479, "field 'mSvView'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends FragmentExperienceA> implements Unbinder {
    private T target;

    View view2131231083;

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
      target.mRefreshLayout = null;
      target.mBannerV = null;
      target.mGvView = null;
      view2131231083.setOnClickListener(null);
      target.mIvTop = null;
      target.mRvList = null;
      target.mSvView = null;
    }
  }
}
