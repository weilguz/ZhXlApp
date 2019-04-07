// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.loading;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class BindPhoneNumActivity$$ViewBinder<T extends BindPhoneNumActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231004, "field 'ivBack' and method 'onViewClicked'");
    target.ivBack = finder.castView(view, 2131231004, "field 'ivBack'");
    unbinder.view2131231004 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231754, "field 'tvTitle'");
    target.tvTitle = finder.castView(view, 2131231754, "field 'tvTitle'");
    view = finder.findRequiredView(source, 2131230938, "field 'etPhoneNum'");
    target.etPhoneNum = finder.castView(view, 2131230938, "field 'etPhoneNum'");
    view = finder.findRequiredView(source, 2131230811, "field 'btnGetCode' and method 'onViewClicked'");
    target.btnGetCode = finder.castView(view, 2131230811, "field 'btnGetCode'");
    unbinder.view2131230811 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230927, "field 'etCode'");
    target.etCode = finder.castView(view, 2131230927, "field 'etCode'");
    view = finder.findRequiredView(source, 2131230820, "field 'btnSubmit' and method 'onViewClicked'");
    target.btnSubmit = finder.castView(view, 2131230820, "field 'btnSubmit'");
    unbinder.view2131230820 = view;
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

  protected static class InnerUnbinder<T extends BindPhoneNumActivity> implements Unbinder {
    private T target;

    View view2131231004;

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
      target.ivBack = null;
      target.tvTitle = null;
      target.etPhoneNum = null;
      view2131230811.setOnClickListener(null);
      target.btnGetCode = null;
      target.etCode = null;
      view2131230820.setOnClickListener(null);
      target.btnSubmit = null;
    }
  }
}
