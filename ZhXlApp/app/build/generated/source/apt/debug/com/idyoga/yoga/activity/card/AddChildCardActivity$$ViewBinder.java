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

public class AddChildCardActivity$$ViewBinder<T extends AddChildCardActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131231555, "field 'mTvCardName'");
    target.mTvCardName = finder.castView(view, 2131231555, "field 'mTvCardName'");
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
    view = finder.findRequiredView(source, 2131230927, "field 'mEtCode'");
    target.mEtCode = finder.castView(view, 2131230927, "field 'mEtCode'");
    view = finder.findRequiredView(source, 2131230811, "field 'mBtnGetCode' and method 'onViewClicked'");
    target.mBtnGetCode = finder.castView(view, 2131230811, "field 'mBtnGetCode'");
    unbinder.view2131230811 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
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
    view = finder.findRequiredView(source, 2131231762, "field 'mTvType'");
    target.mTvType = finder.castView(view, 2131231762, "field 'mTvType'");
    view = finder.findRequiredView(source, 2131231665, "field 'mTvName'");
    target.mTvName = finder.castView(view, 2131231665, "field 'mTvName'");
    view = finder.findRequiredView(source, 2131231706, "field 'mTvSex'");
    target.mTvSex = finder.castView(view, 2131231706, "field 'mTvSex'");
    view = finder.findRequiredView(source, 2131231540, "field 'mTvBirthdayName'");
    target.mTvBirthdayName = finder.castView(view, 2131231540, "field 'mTvBirthdayName'");
    view = finder.findRequiredView(source, 2131231659, "field 'mTvMobile'");
    target.mTvMobile = finder.castView(view, 2131231659, "field 'mTvMobile'");
    view = finder.findRequiredView(source, 2131231161, "field 'mLlLayoutNewUser'");
    target.mLlLayoutNewUser = finder.castView(view, 2131231161, "field 'mLlLayoutNewUser'");
    view = finder.findRequiredView(source, 2131231660, "field 'mTvMobile1'");
    target.mTvMobile1 = finder.castView(view, 2131231660, "field 'mTvMobile1'");
    view = finder.findRequiredView(source, 2131230936, "field 'mEtMobile1'");
    target.mEtMobile1 = finder.castView(view, 2131230936, "field 'mEtMobile1'");
    view = finder.findRequiredView(source, 2131230939, "field 'mEtPwd'");
    target.mEtPwd = finder.castView(view, 2131230939, "field 'mEtPwd'");
    view = finder.findRequiredView(source, 2131231163, "field 'mLlLayoutUser'");
    target.mLlLayoutUser = finder.castView(view, 2131231163, "field 'mLlLayoutUser'");
    view = finder.findRequiredView(source, 2131230840, "field 'mCbNewUser'");
    target.mCbNewUser = finder.castView(view, 2131230840, "field 'mCbNewUser'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends AddChildCardActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231539;

    View view2131230811;

    View view2131231526;

    View view2131231728;

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
      target.mTvCardName = null;
      target.mEtName = null;
      target.mRgView = null;
      view2131231539.setOnClickListener(null);
      target.mTvBirthday = null;
      target.mEtMobile = null;
      target.mEtCode = null;
      view2131230811.setOnClickListener(null);
      target.mBtnGetCode = null;
      view2131231526.setOnClickListener(null);
      target.mTvAddress = null;
      view2131231728.setOnClickListener(null);
      target.mTvSubmit = null;
      target.mTvType = null;
      target.mTvName = null;
      target.mTvSex = null;
      target.mTvBirthdayName = null;
      target.mTvMobile = null;
      target.mLlLayoutNewUser = null;
      target.mTvMobile1 = null;
      target.mEtMobile1 = null;
      target.mEtPwd = null;
      target.mLlLayoutUser = null;
      target.mCbNewUser = null;
    }
  }
}
