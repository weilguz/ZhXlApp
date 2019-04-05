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

public class CourseFragment$$ViewBinder<T extends CourseFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131230879, "field 'mCourseTabs'");
    target.mCourseTabs = finder.castView(view, 2131230879, "field 'mCourseTabs'");
    view = finder.findRequiredView(source, 2131230880, "field 'mCourseVpContent'");
    target.mCourseVpContent = finder.castView(view, 2131230880, "field 'mCourseVpContent'");
    view = finder.findRequiredView(source, 2131231523, "field 'mTvAddress'");
    target.mTvAddress = finder.castView(view, 2131231523, "field 'mTvAddress'");
    view = finder.findRequiredView(source, 2131230997, "field 'mIvAddress'");
    target.mIvAddress = finder.castView(view, 2131230997, "field 'mIvAddress'");
    view = finder.findRequiredView(source, 2131231125, "field 'mLlAddress' and method 'onViewClicked'");
    target.mLlAddress = finder.castView(view, 2131231125, "field 'mLlAddress'");
    unbinder.view2131231125 = view;
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
    view = finder.findRequiredView(source, 2131231180, "field 'mLlSearchTitle'");
    target.mLlSearchTitle = finder.castView(view, 2131231180, "field 'mLlSearchTitle'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CourseFragment> implements Unbinder {
    private T target;

    View view2131231125;

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
      target.mCourseTabs = null;
      target.mCourseVpContent = null;
      target.mTvAddress = null;
      target.mIvAddress = null;
      view2131231125.setOnClickListener(null);
      target.mLlAddress = null;
      view2131230940.setOnClickListener(null);
      target.mEtSearch = null;
      target.mLlSearchTitle = null;
    }
  }
}
