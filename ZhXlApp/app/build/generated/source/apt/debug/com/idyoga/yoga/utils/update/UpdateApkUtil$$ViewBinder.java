// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.utils.update;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class UpdateApkUtil$$ViewBinder<T extends UpdateApkUtil> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231532, "field 'mTvApp'");
    target.mTvApp = finder.castView(view, 2131231532, "field 'mTvApp'");
    view = finder.findRequiredView(source, 2131231533, "field 'mTvAppVersion'");
    target.mTvAppVersion = finder.castView(view, 2131231533, "field 'mTvAppVersion'");
    view = finder.findRequiredView(source, 2131231618, "field 'mTvFileSize'");
    target.mTvFileSize = finder.castView(view, 2131231618, "field 'mTvFileSize'");
    view = finder.findRequiredView(source, 2131231764, "field 'mTvUpdataTime'");
    target.mTvUpdataTime = finder.castView(view, 2131231764, "field 'mTvUpdataTime'");
    view = finder.findRequiredView(source, 2131231763, "field 'mTvUpdataLog'");
    target.mTvUpdataLog = finder.castView(view, 2131231763, "field 'mTvUpdataLog'");
    view = finder.findRequiredView(source, 2131231548, "field 'mTvCancel' and method 'onViewClicked'");
    target.mTvCancel = finder.castView(view, 2131231548, "field 'mTvCancel'");
    unbinder.view2131231548 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231733, "field 'mTvSure' and method 'onViewClicked'");
    target.mTvSure = finder.castView(view, 2131231733, "field 'mTvSure'");
    unbinder.view2131231733 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231802, "field 'mViewLine'");
    target.mViewLine = view;
    view = finder.findRequiredView(source, 2131231153, "field 'mLlLayout'");
    target.mLlLayout = finder.castView(view, 2131231153, "field 'mLlLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends UpdateApkUtil> implements Unbinder {
    private T target;

    View view2131231548;

    View view2131231733;

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
      target.mTvApp = null;
      target.mTvAppVersion = null;
      target.mTvFileSize = null;
      target.mTvUpdataTime = null;
      target.mTvUpdataLog = null;
      view2131231548.setOnClickListener(null);
      target.mTvCancel = null;
      view2131231733.setOnClickListener(null);
      target.mTvSure = null;
      target.mViewLine = null;
      target.mLlLayout = null;
    }
  }
}
