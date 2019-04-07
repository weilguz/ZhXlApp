// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.lbs;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class LbsActivity$$ViewBinder<T extends LbsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231157, "field 'mLlLayoutBack' and method 'onViewClicked'");
    target.mLlLayoutBack = finder.castView(view, 2131231157, "field 'mLlLayoutBack'");
    unbinder.view2131231157 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231209, "field 'mLlWebClose'");
    target.mLlWebClose = finder.castView(view, 2131231209, "field 'mLlWebClose'");
    view = finder.findRequiredView(source, 2131231754, "field 'mTvTitle'");
    target.mTvTitle = finder.castView(view, 2131231754, "field 'mTvTitle'");
    view = finder.findRequiredView(source, 2131231160, "field 'mLlLayoutMore' and method 'onViewClicked'");
    target.mLlLayoutMore = finder.castView(view, 2131231160, "field 'mLlLayoutMore'");
    unbinder.view2131231160 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231258, "field 'mMapView'");
    target.mMapView = finder.castView(view, 2131231258, "field 'mMapView'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LbsActivity> implements Unbinder {
    private T target;

    View view2131231157;

    View view2131231160;

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
      view2131231157.setOnClickListener(null);
      target.mLlLayoutBack = null;
      target.mLlWebClose = null;
      target.mTvTitle = null;
      view2131231160.setOnClickListener(null);
      target.mLlLayoutMore = null;
      target.mLlCommonLayout = null;
      target.mMapView = null;
    }
  }
}
