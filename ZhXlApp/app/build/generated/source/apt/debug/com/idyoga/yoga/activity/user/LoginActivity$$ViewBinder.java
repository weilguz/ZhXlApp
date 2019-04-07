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

public class LoginActivity$$ViewBinder<T extends LoginActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231167, "field 'llLgBk' and method 'onViewClicked'");
    target.llLgBk = finder.castView(view, 2131231167, "field 'llLgBk'");
    unbinder.view2131231167 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231168, "field 'llLgRg' and method 'onViewClicked'");
    target.llLgRg = finder.castView(view, 2131231168, "field 'llLgRg'");
    unbinder.view2131231168 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230977, "field 'homeTabs'");
    target.homeTabs = finder.castView(view, 2131230977, "field 'homeTabs'");
    view = finder.findRequiredView(source, 2131230978, "field 'homeVpContent'");
    target.homeVpContent = finder.castView(view, 2131230978, "field 'homeVpContent'");
    view = finder.findRequiredView(source, 2131230859, "field 'civHead'");
    target.civHead = finder.castView(view, 2131230859, "field 'civHead'");
    view = finder.findRequiredView(source, 2131231376, "field 'rlTitleBar'");
    target.rlTitleBar = finder.castView(view, 2131231376, "field 'rlTitleBar'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends LoginActivity> implements Unbinder {
    private T target;

    View view2131231167;

    View view2131231168;

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
      view2131231167.setOnClickListener(null);
      target.llLgBk = null;
      view2131231168.setOnClickListener(null);
      target.llLgRg = null;
      target.homeTabs = null;
      target.homeVpContent = null;
      target.civHead = null;
      target.rlTitleBar = null;
    }
  }
}
