// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.tutor;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class TutorListActivity$$ViewBinder<T extends TutorListActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231753, "field 'mTvTitleRight'");
    target.mTvTitleRight = finder.castView(view, 2131231753, "field 'mTvTitleRight'");
    view = finder.findRequiredView(source, 2131231200, "field 'mLlTitleRight'");
    target.mLlTitleRight = finder.castView(view, 2131231200, "field 'mLlTitleRight'");
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231407, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231407, "field 'mRvList'");
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
    view = finder.findRequiredView(source, 2131231698, "field 'mTvSelectClassify' and method 'onViewClicked'");
    target.mTvSelectClassify = finder.castView(view, 2131231698, "field 'mTvSelectClassify'");
    unbinder.view2131231698 = view;
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

  protected static class InnerUnbinder<T extends TutorListActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231194;

    View view2131231195;

    View view2131231698;

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
      target.mTvTitleRight = null;
      target.mLlTitleRight = null;
      target.mLlCommonLayout = null;
      target.mRvList = null;
      target.mTvTagA = null;
      target.mIvTagA = null;
      view2131231194.setOnClickListener(null);
      target.mLlTagA = null;
      target.mTvTagB = null;
      target.mIvTagB = null;
      view2131231195.setOnClickListener(null);
      target.mLlTagB = null;
      view2131231698.setOnClickListener(null);
      target.mTvSelectClassify = null;
    }
  }
}
