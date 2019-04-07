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

public class ActivaSuccessActivity$$ViewBinder<T extends ActivaSuccessActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231375, "field 'rlTitle'");
    target.rlTitle = finder.castView(view, 2131231375, "field 'rlTitle'");
    view = finder.findRequiredView(source, 2131230819, "field 'btnSee' and method 'onViewClicked'");
    target.btnSee = finder.castView(view, 2131230819, "field 'btnSee'");
    unbinder.view2131230819 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230805, "field 'btnBespoke' and method 'onViewClicked'");
    target.btnBespoke = finder.castView(view, 2131230805, "field 'btnBespoke'");
    unbinder.view2131230805 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231005, "field 'ivBackYellow'");
    target.ivBackYellow = finder.castView(view, 2131231005, "field 'ivBackYellow'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ActivaSuccessActivity> implements Unbinder {
    private T target;

    View view2131231004;

    View view2131230819;

    View view2131230805;

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
      target.rlTitle = null;
      view2131230819.setOnClickListener(null);
      target.btnSee = null;
      view2131230805.setOnClickListener(null);
      target.btnBespoke = null;
      target.ivBackYellow = null;
    }
  }
}
