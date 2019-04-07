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

public class PhoneLoginFragment$$ViewBinder<T extends PhoneLoginFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131230933, "field 'etInputPhone'");
    target.etInputPhone = finder.castView(view, 2131230933, "field 'etInputPhone'");
    view = finder.findRequiredView(source, 2131230811, "field 'btnGetCode' and method 'onViewClicked'");
    target.btnGetCode = finder.castView(view, 2131230811, "field 'btnGetCode'");
    unbinder.view2131230811 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230934, "field 'etInputPwd'");
    target.etInputPwd = finder.castView(view, 2131230934, "field 'etInputPwd'");
    view = finder.findRequiredView(source, 2131230810, "field 'btnForgetPrw' and method 'onViewClicked'");
    target.btnForgetPrw = finder.castView(view, 2131230810, "field 'btnForgetPrw'");
    unbinder.view2131230810 = view;
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
    view = finder.findRequiredView(source, 2131230813, "field 'btnLogin' and method 'onViewClicked'");
    target.btnLogin = finder.castView(view, 2131230813, "field 'btnLogin'");
    unbinder.view2131230813 = view;
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

  protected static class InnerUnbinder<T extends PhoneLoginFragment> implements Unbinder {
    private T target;

    View view2131230811;

    View view2131230810;

    View view2131231098;

    View view2131230813;

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
      view2131230811.setOnClickListener(null);
      target.btnGetCode = null;
      target.etInputPwd = null;
      view2131230810.setOnClickListener(null);
      target.btnForgetPrw = null;
      view2131231098.setOnClickListener(null);
      target.ivWxLogin = null;
      view2131230813.setOnClickListener(null);
      target.btnLogin = null;
    }
  }
}
