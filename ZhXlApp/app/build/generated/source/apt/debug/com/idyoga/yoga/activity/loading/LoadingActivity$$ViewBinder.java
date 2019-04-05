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

public class LoadingActivity$$ViewBinder<T extends LoadingActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131230969, "field 'guideVp'");
    target.guideVp = finder.castView(view, 2131230969, "field 'guideVp'");
    view = finder.findRequiredView(source, 2131230968, "field 'guideIv' and method 'onViewClicked'");
    target.guideIv = finder.castView(view, 2131230968, "field 'guideIv'");
    unbinder.view2131230968 = view;
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

  protected static class InnerUnbinder<T extends LoadingActivity> implements Unbinder {
    private T target;

    View view2131230968;

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
      target.guideVp = null;
      view2131230968.setOnClickListener(null);
      target.guideIv = null;
    }
  }
}
