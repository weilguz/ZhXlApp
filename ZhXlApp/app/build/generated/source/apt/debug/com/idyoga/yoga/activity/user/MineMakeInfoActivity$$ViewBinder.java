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

public class MineMakeInfoActivity$$ViewBinder<T extends MineMakeInfoActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231001, "field 'mIvBack' and method 'onViewClicked'");
    target.mIvBack = finder.castView(view, 2131231001, "field 'mIvBack'");
    unbinder.view2131231001 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231086, "field 'mIvUserHp' and method 'onViewClicked'");
    target.mIvUserHp = finder.castView(view, 2131231086, "field 'mIvUserHp'");
    unbinder.view2131231086 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230937, "field 'mEtName'");
    target.mEtName = finder.castView(view, 2131230937, "field 'mEtName'");
    view = finder.findRequiredView(source, 2131230843, "field 'mCbSexBox' and method 'onViewClicked'");
    target.mCbSexBox = finder.castView(view, 2131230843, "field 'mCbSexBox'");
    unbinder.view2131230843 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230844, "field 'mCbSexGirl' and method 'onViewClicked'");
    target.mCbSexGirl = finder.castView(view, 2131230844, "field 'mCbSexGirl'");
    unbinder.view2131230844 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231523, "field 'mTvAddress' and method 'onViewClicked'");
    target.mTvAddress = finder.castView(view, 2131231523, "field 'mTvAddress'");
    unbinder.view2131231523 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230820, "field 'mBtnSubmit' and method 'onViewClicked'");
    target.mBtnSubmit = finder.castView(view, 2131230820, "field 'mBtnSubmit'");
    unbinder.view2131230820 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231762, "field 'mTvUploadHp' and method 'onViewClicked'");
    target.mTvUploadHp = finder.castView(view, 2131231762, "field 'mTvUploadHp'");
    unbinder.view2131231762 = view;
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

  protected static class InnerUnbinder<T extends MineMakeInfoActivity> implements Unbinder {
    private T target;

    View view2131231001;

    View view2131231086;

    View view2131230843;

    View view2131230844;

    View view2131231523;

    View view2131230820;

    View view2131231762;

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
      view2131231001.setOnClickListener(null);
      target.mIvBack = null;
      view2131231086.setOnClickListener(null);
      target.mIvUserHp = null;
      target.mEtName = null;
      view2131230843.setOnClickListener(null);
      target.mCbSexBox = null;
      view2131230844.setOnClickListener(null);
      target.mCbSexGirl = null;
      view2131231523.setOnClickListener(null);
      target.mTvAddress = null;
      view2131230820.setOnClickListener(null);
      target.mBtnSubmit = null;
      view2131231762.setOnClickListener(null);
      target.mTvUploadHp = null;
    }
  }
}
