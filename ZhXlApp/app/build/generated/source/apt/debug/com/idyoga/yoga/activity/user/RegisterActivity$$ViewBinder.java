// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.user;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class RegisterActivity$$ViewBinder<T extends RegisterActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231004, "field 'mIvBack' and method 'onViewClicked'");
    target.mIvBack = finder.castView(view, 2131231004, "field 'mIvBack'");
    unbinder.view2131231004 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230930, "field 'mEtHandset'");
    target.mEtHandset = finder.castView(view, 2131230930, "field 'mEtHandset'");
    view = finder.findRequiredView(source, 2131230931, "field 'mEtInPwd1'");
    target.mEtInPwd1 = finder.castView(view, 2131230931, "field 'mEtInPwd1'");
    view = finder.findRequiredView(source, 2131231195, "field 'mLlSwitch1' and method 'onViewClicked'");
    target.mLlSwitch1 = finder.castView(view, 2131231195, "field 'mLlSwitch1'");
    unbinder.view2131231195 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230932, "field 'mEtInPwd2'");
    target.mEtInPwd2 = finder.castView(view, 2131230932, "field 'mEtInPwd2'");
    view = finder.findRequiredView(source, 2131231196, "field 'mLlSwitch2' and method 'onViewClicked'");
    target.mLlSwitch2 = finder.castView(view, 2131231196, "field 'mLlSwitch2'");
    unbinder.view2131231196 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230927, "field 'mEtCode'");
    target.mEtCode = finder.castView(view, 2131230927, "field 'mEtCode'");
    view = finder.findRequiredView(source, 2131230811, "field 'mBtnGetCode' and method 'onViewClicked'");
    target.mBtnGetCode = finder.castView(view, 2131230811, "field 'mBtnGetCode'");
    unbinder.view2131230811 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231074, "field 'mIvSwitch1'");
    target.mIvSwitch1 = finder.castView(view, 2131231074, "field 'mIvSwitch1'");
    view = finder.findRequiredView(source, 2131231075, "field 'mIvSwitch2'");
    target.mIvSwitch2 = finder.castView(view, 2131231075, "field 'mIvSwitch2'");
    view = finder.findRequiredView(source, 2131230820, "field 'mBtnSubmit' and method 'onViewClicked'");
    target.mBtnSubmit = finder.castView(view, 2131230820, "field 'mBtnSubmit'");
    unbinder.view2131230820 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231365, "field 'rlRoot'");
    target.rlRoot = finder.castView(view, 2131231365, "field 'rlRoot'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends RegisterActivity> implements Unbinder {
    private T target;

    View view2131231004;

    View view2131231195;

    View view2131231196;

    View view2131230811;

    View view2131230820;

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
      view2131231004.setOnClickListener(null);
      target.mIvBack = null;
      target.mEtHandset = null;
      target.mEtInPwd1 = null;
      view2131231195.setOnClickListener(null);
      target.mLlSwitch1 = null;
      target.mEtInPwd2 = null;
      view2131231196.setOnClickListener(null);
      target.mLlSwitch2 = null;
      target.mEtCode = null;
      view2131230811.setOnClickListener(null);
      target.mBtnGetCode = null;
      target.mIvSwitch1 = null;
      target.mIvSwitch2 = null;
      view2131230820.setOnClickListener(null);
      target.mBtnSubmit = null;
      target.rlRoot = null;
    }
  }
}
