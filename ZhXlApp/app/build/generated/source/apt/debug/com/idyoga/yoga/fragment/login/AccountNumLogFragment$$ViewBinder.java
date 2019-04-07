// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment.login;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class AccountNumLogFragment$$ViewBinder<T extends AccountNumLogFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131230933, "field 'etInputPhone'");
    target.etInputPhone = finder.castView(view, 2131230933, "field 'etInputPhone'");
    view = finder.findRequiredView(source, 2131231042, "field 'ivIsShowPwd'");
    target.ivIsShowPwd = finder.castView(view, 2131231042, "field 'ivIsShowPwd'");
    view = finder.findRequiredView(source, 2131230934, "field 'etInputPwd'");
    target.etInputPwd = finder.castView(view, 2131230934, "field 'etInputPwd'");
    view = finder.findRequiredView(source, 2131230810, "field 'btnForgetPrw'");
    target.btnForgetPrw = finder.castView(view, 2131230810, "field 'btnForgetPrw'");
    view = finder.findRequiredView(source, 2131231625, "field 'tvForgetPwd' and method 'onViewClicked'");
    target.tvForgetPwd = finder.castView(view, 2131231625, "field 'tvForgetPwd'");
    unbinder.view2131231625 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230813, "field 'btnLogin' and method 'onViewClicked'");
    target.btnLogin = finder.castView(view, 2131230813, "field 'btnLogin'");
    unbinder.view2131230813 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231098, "field 'ivWxLogin' and method 'onViewClicked'");
    target.ivWxLogin = finder.castView(view, 2131231098, "field 'ivWxLogin'");
    unbinder.view2131231098 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231369, "field 'rlShowPwd' and method 'onViewClicked'");
    target.rlShowPwd = finder.castView(view, 2131231369, "field 'rlShowPwd'");
    unbinder.view2131231369 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends AccountNumLogFragment> implements Unbinder {
    private T target;

    View view2131231625;

    View view2131230813;

    View view2131231098;

    View view2131231369;

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
      target.etInputPhone = null;
      target.ivIsShowPwd = null;
      target.etInputPwd = null;
      target.btnForgetPrw = null;
      view2131231625.setOnClickListener(null);
      target.tvForgetPwd = null;
      view2131230813.setOnClickListener(null);
      target.btnLogin = null;
      view2131231098.setOnClickListener(null);
      target.ivWxLogin = null;
      view2131231369.setOnClickListener(null);
      target.rlShowPwd = null;
    }
  }
}
