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

public class AccountActivity$$ViewBinder<T extends AccountActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231756, "field 'mTvTitleRight'");
    target.mTvTitleRight = finder.castView(view, 2131231756, "field 'mTvTitleRight'");
    view = finder.findRequiredView(source, 2131231203, "field 'mLlTitleRight'");
    target.mLlTitleRight = finder.castView(view, 2131231203, "field 'mLlTitleRight'");
    view = finder.findRequiredView(source, 2131231136, "field 'mLlCommonLayout'");
    target.mLlCommonLayout = finder.castView(view, 2131231136, "field 'mLlCommonLayout'");
    view = finder.findRequiredView(source, 2131230937, "field 'mEtName'");
    target.mEtName = finder.castView(view, 2131230937, "field 'mEtName'");
    view = finder.findRequiredView(source, 2131231322, "field 'mRgView'");
    target.mRgView = finder.castView(view, 2131231322, "field 'mRgView'");
    view = finder.findRequiredView(source, 2131231539, "field 'mTvBirthday' and method 'onViewClicked'");
    target.mTvBirthday = finder.castView(view, 2131231539, "field 'mTvBirthday'");
    unbinder.view2131231539 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230935, "field 'mEtMobile'");
    target.mEtMobile = finder.castView(view, 2131230935, "field 'mEtMobile'");
    view = finder.findRequiredView(source, 2131231526, "field 'mTvAddress' and method 'onViewClicked'");
    target.mTvAddress = finder.castView(view, 2131231526, "field 'mTvAddress'");
    unbinder.view2131231526 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231728, "field 'mTvSubmit' and method 'onViewClicked'");
    target.mTvSubmit = finder.castView(view, 2131231728, "field 'mTvSubmit'");
    unbinder.view2131231728 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231308, "field 'mRbBoy'");
    target.mRbBoy = finder.castView(view, 2131231308, "field 'mRbBoy'");
    view = finder.findRequiredView(source, 2131231309, "field 'mRbGirl'");
    target.mRbGirl = finder.castView(view, 2131231309, "field 'mRbGirl'");
    view = finder.findRequiredView(source, 2131231038, "field 'mIvHp' and method 'onViewClicked'");
    target.mIvHp = finder.castView(view, 2131231038, "field 'mIvHp'");
    unbinder.view2131231038 = view;
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

  protected static class InnerUnbinder<T extends AccountActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231539;

    View view2131231526;

    View view2131231728;

    View view2131231038;

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
      target.mTvTitleRight = null;
      target.mLlTitleRight = null;
      target.mLlCommonLayout = null;
      target.mEtName = null;
      target.mRgView = null;
      view2131231539.setOnClickListener(null);
      target.mTvBirthday = null;
      target.mEtMobile = null;
      view2131231526.setOnClickListener(null);
      target.mTvAddress = null;
      view2131231728.setOnClickListener(null);
      target.mTvSubmit = null;
      target.mRbBoy = null;
      target.mRbGirl = null;
      view2131231038.setOnClickListener(null);
      target.mIvHp = null;
    }
  }
}
