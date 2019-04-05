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

public class CardDetailsActivity$$ViewBinder<T extends CardDetailsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231199, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231199, "field 'mLlTitleBack'");
    unbinder.view2131231199 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231754, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231754, "field 'mTvTitleText'");
    view = finder.findRequiredView(source, 2131231133, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231133, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231772, "field 'mTvVipName'");
    target.mTvVipName = finder.castView(view, 2131231772, "field 'mTvVipName'");
    view = finder.findRequiredView(source, 2131231668, "field 'mTvNum'");
    target.mTvNum = finder.castView(view, 2131231668, "field 'mTvNum'");
    view = finder.findRequiredView(source, 2131231594, "field 'mTvDate'");
    target.mTvDate = finder.castView(view, 2131231594, "field 'mTvDate'");
    view = finder.findRequiredView(source, 2131231149, "field 'mLlLabel'");
    target.mLlLabel = finder.castView(view, 2131231149, "field 'mLlLabel'");
    view = finder.findRequiredView(source, 2131231746, "field 'mTvTime'");
    target.mTvTime = finder.castView(view, 2131231746, "field 'mTvTime'");
    view = finder.findRequiredView(source, 2131231548, "field 'mTvCardChild'");
    target.mTvCardChild = finder.castView(view, 2131231548, "field 'mTvCardChild'");
    view = finder.findRequiredView(source, 2131231692, "field 'mTvRule'");
    target.mTvRule = finder.castView(view, 2131231692, "field 'mTvRule'");
    view = finder.findRequiredView(source, 2131231011, "field 'mIvCourseBInto'");
    target.mIvCourseBInto = finder.castView(view, 2131231011, "field 'mIvCourseBInto'");
    view = finder.findRequiredView(source, 2131231334, "field 'mRlCardChild' and method 'onViewClicked'");
    target.mRlCardChild = finder.castView(view, 2131231334, "field 'mRlCardChild'");
    unbinder.view2131231334 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231335, "field 'mRlCardCourse' and method 'onViewClicked'");
    target.mRlCardCourse = finder.castView(view, 2131231335, "field 'mRlCardCourse'");
    unbinder.view2131231335 = view;
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

  protected static class InnerUnbinder<T extends CardDetailsActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231334;

    View view2131231335;

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
      view2131231199.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mLlCommonLayout = null;
      target.mTvVipName = null;
      target.mTvNum = null;
      target.mTvDate = null;
      target.mLlLabel = null;
      target.mTvTime = null;
      target.mTvCardChild = null;
      target.mTvRule = null;
      target.mIvCourseBInto = null;
      view2131231334.setOnClickListener(null);
      target.mRlCardChild = null;
      view2131231335.setOnClickListener(null);
      target.mRlCardCourse = null;
    }
  }
}
