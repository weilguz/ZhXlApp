// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.qrc;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ScanResultActivity$$ViewBinder<T extends ScanResultActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231199, "field 'mLlTitleBack'");
    target.mLlTitleBack = finder.castView(view, 2131231199, "field 'mLlTitleBack'");
    view = finder.findRequiredView(source, 2131231754, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231754, "field 'mTvTitleText'");
    view = finder.findRequiredView(source, 2131231753, "field 'mTvTitleRight'");
    target.mTvTitleRight = finder.castView(view, 2131231753, "field 'mTvTitleRight'");
    view = finder.findRequiredView(source, 2131231200, "field 'mLlTitleRight'");
    target.mLlTitleRight = finder.castView(view, 2131231200, "field 'mLlTitleRight'");
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231033, "field 'mIvIcon'");
    target.mIvIcon = finder.castView(view, 2131231033, "field 'mIvIcon'");
    view = finder.findRequiredView(source, 2131231666, "field 'mTvNickname'");
    target.mTvNickname = finder.castView(view, 2131231666, "field 'mTvNickname'");
    view = finder.findRequiredView(source, 2131231759, "field 'mTvType'");
    target.mTvType = finder.castView(view, 2131231759, "field 'mTvType'");
    view = finder.findRequiredView(source, 2131230815, "method 'onViewClicked'");
    unbinder.view2131230815 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231647, "method 'onViewClicked'");
    unbinder.view2131231647 = view;
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

  protected static class InnerUnbinder<T extends ScanResultActivity> implements Unbinder {
    private T target;

    View view2131230815;

    View view2131231647;

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
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mTvTitleRight = null;
      target.mLlTitleRight = null;
      target.mLlCommonLayout = null;
      target.mIvIcon = null;
      target.mTvNickname = null;
      target.mTvType = null;
      view2131230815.setOnClickListener(null);
      view2131231647.setOnClickListener(null);
    }
  }
}
