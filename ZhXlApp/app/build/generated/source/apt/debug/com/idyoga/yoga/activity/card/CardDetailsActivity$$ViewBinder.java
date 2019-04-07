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
    view = finder.findRequiredView(source, 2131231202, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231202, "field 'mLlTitleBack'");
    unbinder.view2131231202 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231757, "field 'mTvTitleText'");
    target.mTvTitleText = finder.castView(view, 2131231757, "field 'mTvTitleText'");
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131231775, "field 'mTvVipName'");
    target.mTvVipName = finder.castView(view, 2131231775, "field 'mTvVipName'");
    view = finder.findRequiredView(source, 2131231671, "field 'mTvNum'");
    target.mTvNum = finder.castView(view, 2131231671, "field 'mTvNum'");
    view = finder.findRequiredView(source, 2131231597, "field 'mTvDate'");
    target.mTvDate = finder.castView(view, 2131231597, "field 'mTvDate'");
    view = finder.findRequiredView(source, 2131231152, "field 'mLlLabel'");
    target.mLlLabel = finder.castView(view, 2131231152, "field 'mLlLabel'");
    view = finder.findRequiredView(source, 2131231749, "field 'mTvTime'");
    target.mTvTime = finder.castView(view, 2131231749, "field 'mTvTime'");
    view = finder.findRequiredView(source, 2131231551, "field 'mTvCardChild'");
    target.mTvCardChild = finder.castView(view, 2131231551, "field 'mTvCardChild'");
    view = finder.findRequiredView(source, 2131231695, "field 'mTvRule'");
    target.mTvRule = finder.castView(view, 2131231695, "field 'mTvRule'");
    view = finder.findRequiredView(source, 2131231014, "field 'mIvCourseBInto'");
    target.mIvCourseBInto = finder.castView(view, 2131231014, "field 'mIvCourseBInto'");
    view = finder.findRequiredView(source, 2131231337, "field 'mRlCardChild' and method 'onViewClicked'");
    target.mRlCardChild = finder.castView(view, 2131231337, "field 'mRlCardChild'");
    unbinder.view2131231337 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231338, "field 'mRlCardCourse' and method 'onViewClicked'");
    target.mRlCardCourse = finder.castView(view, 2131231338, "field 'mRlCardCourse'");
    unbinder.view2131231338 = view;
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

    View view2131231202;

    View view2131231337;

    View view2131231338;

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
      view2131231202.setOnClickListener(null);
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
      view2131231337.setOnClickListener(null);
      target.mRlCardChild = null;
      view2131231338.setOnClickListener(null);
      target.mRlCardCourse = null;
    }
  }
}
