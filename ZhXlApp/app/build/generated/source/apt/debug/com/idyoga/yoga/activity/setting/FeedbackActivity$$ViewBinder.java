// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.setting;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class FeedbackActivity$$ViewBinder<T extends FeedbackActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131230929, "field 'mEtContent'");
    target.mEtContent = finder.castView(view, 2131230929, "field 'mEtContent'");
    view = finder.findRequiredView(source, 2131231671, "field 'mTvNum'");
    target.mTvNum = finder.castView(view, 2131231671, "field 'mTvNum'");
    view = finder.findRequiredView(source, 2131231137, "field 'mLlContent'");
    target.mLlContent = finder.castView(view, 2131231137, "field 'mLlContent'");
    view = finder.findRequiredView(source, 2131231728, "field 'mTvSubmit' and method 'onViewClicked'");
    target.mTvSubmit = finder.castView(view, 2131231728, "field 'mTvSubmit'");
    unbinder.view2131231728 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231682, "field 'mTvPicTag'");
    target.mTvPicTag = finder.castView(view, 2131231682, "field 'mTvPicTag'");
    view = finder.findRequiredView(source, 2131231410, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231410, "field 'mRvList'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends FeedbackActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231728;

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
      target.mLlCommonLayout = null;
      target.mEtContent = null;
      target.mTvNum = null;
      target.mLlContent = null;
      view2131231728.setOnClickListener(null);
      target.mTvSubmit = null;
      target.mTvPicTag = null;
      target.mRvList = null;
    }
  }
}
