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

public class FragmentCourseByVideo$$ViewBinder<T extends FragmentCourseByVideo> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231150, "field 'mLlLayout'");
    target.mLlLayout = finder.castView(view, 2131231150, "field 'mLlLayout'");
    view = finder.findRequiredView(source, 2131230883, "field 'mScrollView'");
    target.mScrollView = finder.castView(view, 2131230883, "field 'mScrollView'");
    view = finder.findRequiredView(source, 2131230836, "field 'mBvView'");
    target.mBvView = finder.castView(view, 2131230836, "field 'mBvView'");
    view = finder.findRequiredView(source, 2131231467, "field 'mSrlRefresh'");
    target.mSrlRefresh = finder.castView(view, 2131231467, "field 'mSrlRefresh'");
    view = finder.findRequiredView(source, 2131231224, "field 'mLvList'");
    target.mLvList = finder.castView(view, 2131231224, "field 'mLvList'");
    view = finder.findRequiredView(source, 2131231736, "field 'mTvTagA'");
    target.mTvTagA = finder.castView(view, 2131231736, "field 'mTvTagA'");
    view = finder.findRequiredView(source, 2131231073, "field 'mIvTagA'");
    target.mIvTagA = finder.castView(view, 2131231073, "field 'mIvTagA'");
    view = finder.findRequiredView(source, 2131231194, "field 'mLlTagA' and method 'onViewClicked'");
    target.mLlTagA = finder.castView(view, 2131231194, "field 'mLlTagA'");
    unbinder.view2131231194 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231737, "field 'mTvTagB'");
    target.mTvTagB = finder.castView(view, 2131231737, "field 'mTvTagB'");
    view = finder.findRequiredView(source, 2131231074, "field 'mIvTagB'");
    target.mIvTagB = finder.castView(view, 2131231074, "field 'mIvTagB'");
    view = finder.findRequiredView(source, 2131231195, "field 'mLlTagB' and method 'onViewClicked'");
    target.mLlTagB = finder.castView(view, 2131231195, "field 'mLlTagB'");
    unbinder.view2131231195 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231738, "field 'mTvTagC'");
    target.mTvTagC = finder.castView(view, 2131231738, "field 'mTvTagC'");
    view = finder.findRequiredView(source, 2131231075, "field 'mIvTagC'");
    target.mIvTagC = finder.castView(view, 2131231075, "field 'mIvTagC'");
    view = finder.findRequiredView(source, 2131231196, "field 'mLlTagC' and method 'onViewClicked'");
    target.mLlTagC = finder.castView(view, 2131231196, "field 'mLlTagC'");
    unbinder.view2131231196 = view;
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

  protected static class InnerUnbinder<T extends FragmentCourseByVideo> implements Unbinder {
    private T target;

    View view2131231194;

    View view2131231195;

    View view2131231196;

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
      target.mLlLayout = null;
      target.mScrollView = null;
      target.mBvView = null;
      target.mSrlRefresh = null;
      target.mLvList = null;
      target.mTvTagA = null;
      target.mIvTagA = null;
      view2131231194.setOnClickListener(null);
      target.mLlTagA = null;
      target.mTvTagB = null;
      target.mIvTagB = null;
      view2131231195.setOnClickListener(null);
      target.mLlTagB = null;
      target.mTvTagC = null;
      target.mIvTagC = null;
      view2131231196.setOnClickListener(null);
      target.mLlTagC = null;
    }
  }
}
