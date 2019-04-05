// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainActivity$$ViewBinder<T extends MainActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131230873, "field 'mContent'");
    target.mContent = finder.castView(view, 2131230873, "field 'mContent'");
    view = finder.findRequiredView(source, 2131231146, "field 'mLlHome' and method 'onViewClicked'");
    target.mLlHome = finder.castView(view, 2131231146, "field 'mLlHome'");
    unbinder.view2131231146 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231131, "field 'mLlCategory' and method 'onViewClicked'");
    target.mLlCategory = finder.castView(view, 2131231131, "field 'mLlCategory'");
    unbinder.view2131231131 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231185, "field 'mLlService' and method 'onViewClicked'");
    target.mLlService = finder.castView(view, 2131231185, "field 'mLlService'");
    unbinder.view2131231185 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231169, "field 'mLlMine' and method 'onViewClicked'");
    target.mLlMine = finder.castView(view, 2131231169, "field 'mLlMine'");
    unbinder.view2131231169 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231120, "field 'mLl'");
    target.mLl = finder.castView(view, 2131231120, "field 'mLl'");
    view = finder.findRequiredView(source, 2131231025, "field 'mIvHome'");
    target.mIvHome = finder.castView(view, 2131231025, "field 'mIvHome'");
    view = finder.findRequiredView(source, 2131231755, "field 'mTvTop'");
    target.mTvTop = finder.castView(view, 2131231755, "field 'mTvTop'");
    view = finder.findRequiredView(source, 2131231010, "field 'mIvCourse'");
    target.mIvCourse = finder.castView(view, 2131231010, "field 'mIvCourse'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends MainActivity> implements Unbinder {
    private T target;

    View view2131231146;

    View view2131231131;

    View view2131231185;

    View view2131231169;

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
      target.mContent = null;
      view2131231146.setOnClickListener(null);
      target.mLlHome = null;
      view2131231131.setOnClickListener(null);
      target.mLlCategory = null;
      view2131231185.setOnClickListener(null);
      target.mLlService = null;
      view2131231169.setOnClickListener(null);
      target.mLlMine = null;
      target.mLl = null;
      target.mIvHome = null;
      target.mTvTop = null;
      target.mIvCourse = null;
    }
  }
}
