// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.card;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ActivationCardActivity$$ViewBinder<T extends ActivationCardActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131230926, "field 'etCardNum'");
    target.etCardNum = finder.castView(view, 2131230926, "field 'etCardNum'");
    view = finder.findRequiredView(source, 2131230924, "field 'etActivCode'");
    target.etActivCode = finder.castView(view, 2131230924, "field 'etActivCode'");
    view = finder.findRequiredView(source, 2131230802, "field 'btnActiv' and method 'onViewClicked'");
    target.btnActiv = finder.castView(view, 2131230802, "field 'btnActiv'");
    unbinder.view2131230802 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231182, "field 'mLlRoot'");
    target.mLlRoot = finder.castView(view, 2131231182, "field 'mLlRoot'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ActivationCardActivity> implements Unbinder {
    private T target;

    View view2131231004;

    View view2131230802;

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
      target.etCardNum = null;
      target.etActivCode = null;
      view2131230802.setOnClickListener(null);
      target.btnActiv = null;
      target.mLlRoot = null;
    }
  }
}
