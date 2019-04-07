// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.video;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class VideoDetailActivity$$ViewBinder<T extends VideoDetailActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231754, "field 'mTitle'");
    target.mTitle = finder.castView(view, 2131231754, "field 'mTitle'");
    view = finder.findRequiredView(source, 2131231136, "field 'mCommonLayut'");
    target.mCommonLayut = finder.castView(view, 2131231136, "field 'mCommonLayut'");
    view = finder.findRequiredView(source, 2131231202, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231202, "field 'mLlTitleBack'");
    unbinder.view2131231202 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231289, "field 'mPlayerView'");
    target.mPlayerView = finder.castView(view, 2131231289, "field 'mPlayerView'");
    view = finder.findRequiredView(source, 2131231735, "field 'mTvTag'");
    target.mTvTag = finder.castView(view, 2131231735, "field 'mTvTag'");
    view = finder.findRequiredView(source, 2131231583, "field 'mTvCourseName'");
    target.mTvCourseName = finder.castView(view, 2131231583, "field 'mTvCourseName'");
    view = finder.findRequiredView(source, 2131231600, "field 'mTvDescriptionSwitch'");
    target.mTvDescriptionSwitch = finder.castView(view, 2131231600, "field 'mTvDescriptionSwitch'");
    view = finder.findRequiredView(source, 2131231019, "field 'mIvDescriptionSwitch'");
    target.mIvDescriptionSwitch = finder.castView(view, 2131231019, "field 'mIvDescriptionSwitch'");
    view = finder.findRequiredView(source, 2131231141, "field 'mLlDescriptionSwitch' and method 'onViewClicked'");
    target.mLlDescriptionSwitch = finder.castView(view, 2131231141, "field 'mLlDescriptionSwitch'");
    unbinder.view2131231141 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231573, "field 'mTvCount'");
    target.mTvCount = finder.castView(view, 2131231573, "field 'mTvCount'");
    view = finder.findRequiredView(source, 2131231626, "field 'mTvFree'");
    target.mTvFree = finder.castView(view, 2131231626, "field 'mTvFree'");
    view = finder.findRequiredView(source, 2131231747, "field 'mTvTerm'");
    target.mTvTerm = finder.castView(view, 2131231747, "field 'mTvTerm'");
    view = finder.findRequiredView(source, 2131231818, "field 'mWebView'");
    target.mWebView = finder.castView(view, 2131231818, "field 'mWebView'");
    view = finder.findRequiredView(source, 2131231140, "field 'mLlDescription'");
    target.mLlDescription = finder.castView(view, 2131231140, "field 'mLlDescription'");
    view = finder.findRequiredView(source, 2131231179, "field 'mLlOrderVideo'");
    target.mLlOrderVideo = finder.castView(view, 2131231179, "field 'mLlOrderVideo'");
    view = finder.findRequiredView(source, 2131231138, "field 'mLlContentLayout'");
    target.mLlContentLayout = finder.castView(view, 2131231138, "field 'mLlContentLayout'");
    view = finder.findRequiredView(source, 2131231392, "field 'mRlvOtherVideo'");
    target.mRlvOtherVideo = finder.castView(view, 2131231392, "field 'mRlvOtherVideo'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends VideoDetailActivity> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231141;

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
      target.mTitle = null;
      target.mCommonLayut = null;
      view2131231202.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mPlayerView = null;
      target.mTvTag = null;
      target.mTvCourseName = null;
      target.mTvDescriptionSwitch = null;
      target.mIvDescriptionSwitch = null;
      view2131231141.setOnClickListener(null);
      target.mLlDescriptionSwitch = null;
      target.mTvCount = null;
      target.mTvFree = null;
      target.mTvTerm = null;
      target.mWebView = null;
      target.mLlDescription = null;
      target.mLlOrderVideo = null;
      target.mLlContentLayout = null;
      target.mRlvOtherVideo = null;
    }
  }
}
