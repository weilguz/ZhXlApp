// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class EffectiveCardFragment$$ViewBinder<T extends EffectiveCardFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231670, "field 'tvNoCard'");
    target.tvNoCard = finder.castView(view, 2131231670, "field 'tvNoCard'");
    view = finder.findRequiredView(source, 2131231525, "field 'tvActivaCard' and method 'onViewClicked'");
    target.tvActivaCard = finder.castView(view, 2131231525, "field 'tvActivaCard'");
    unbinder.view2131231525 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231615, "field 'tvExchange' and method 'onViewClicked'");
    target.tvExchange = finder.castView(view, 2131231615, "field 'tvExchange'");
    unbinder.view2131231615 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231178, "field 'llNoCard'");
    target.llNoCard = finder.castView(view, 2131231178, "field 'llNoCard'");
    view = finder.findRequiredView(source, 2131231225, "field 'lvCardList'");
    target.lvCardList = finder.castView(view, 2131231225, "field 'lvCardList'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends EffectiveCardFragment> implements Unbinder {
    private T target;

    View view2131231525;

    View view2131231615;

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
      target.tvNoCard = null;
      view2131231525.setOnClickListener(null);
      target.tvActivaCard = null;
      view2131231615.setOnClickListener(null);
      target.tvExchange = null;
      target.llNoCard = null;
      target.lvCardList = null;
    }
  }
}
