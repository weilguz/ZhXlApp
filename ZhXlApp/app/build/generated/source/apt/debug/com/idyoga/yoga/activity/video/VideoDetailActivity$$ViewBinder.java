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
    view = finder.findRequiredView(source, 2131231751, "field 'mTitle'");
    target.mTitle = finder.castView(view, 2131231751, "field 'mTitle'");
    view = finder.findRequiredView(source, 2131231133, "field 'mCommonLayut'");
    target.mCommonLayut = finder.castView(view, 2131231133, "field 'mCommonLayut'");
    view = finder.findRequiredView(source, 2131231199, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231199, "field 'mLlTitleBack'");
    unbinder.view2131231199 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231286, "field 'mPlayerView'");
    target.mPlayerView = finder.castView(view, 2131231286, "field 'mPlayerView'");
    view = finder.findRequiredView(source, 2131231732, "field 'mTvTag'");
    target.mTvTag = finder.castView(view, 2131231732, "field 'mTvTag'");
    view = finder.findRequiredView(source, 2131231580, "field 'mTvCourseName'");
    target.mTvCourseName = finder.castView(view, 2131231580, "field 'mTvCourseName'");
    view = finder.findRequiredView(source, 2131231597, "field 'mTvDescriptionSwitch'");
    target.mTvDescriptionSwitch = finder.castView(view, 2131231597, "field 'mTvDescriptionSwitch'");
    view = finder.findRequiredView(source, 2131231016, "field 'mIvDescriptionSwitch'");
    target.mIvDescriptionSwitch = finder.castView(view, 2131231016, "field 'mIvDescriptionSwitch'");
    view = finder.findRequiredView(source, 2131231138, "field 'mLlDescriptionSwitch' and method 'onViewClicked'");
    target.mLlDescriptionSwitch = finder.castView(view, 2131231138, "field 'mLlDescriptionSwitch'");
    unbinder.view2131231138 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231570, "field 'mTvCount'");
    target.mTvCount = finder.castView(view, 2131231570, "field 'mTvCount'");
    view = finder.findRequiredView(source, 2131231623, "field 'mTvFree'");
    target.mTvFree = finder.castView(view, 2131231623, "field 'mTvFree'");
    view = finder.findRequiredView(source, 2131231744, "field 'mTvTerm'");
    target.mTvTerm = finder.castView(view, 2131231744, "field 'mTvTerm'");
    view = finder.findRequiredView(source, 2131231815, "field 'mWebView'");
    target.mWebView = finder.castView(view, 2131231815, "field 'mWebView'");
    view = finder.findRequiredView(source, 2131231137, "field 'mLlDescription'");
    target.mLlDescription = finder.castView(view, 2131231137, "field 'mLlDescription'");
    view = finder.findRequiredView(source, 2131231176, "field 'mLlOrderVideo'");
    target.mLlOrderVideo = finder.castView(view, 2131231176, "field 'mLlOrderVideo'");
    view = finder.findRequiredView(source, 2131231135, "field 'mLlContentLayout'");
    target.mLlContentLayout = finder.castView(view, 2131231135, "field 'mLlContentLayout'");
    view = finder.findRequiredView(source, 2131231389, "field 'mRlvOtherVideo'");
    target.mRlvOtherVideo = finder.castView(view, 2131231389, "field 'mRlvOtherVideo'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends VideoDetailActivity> implements Unbinder {
    private T target;

    View view2131231199;

    View view2131231138;

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
      view2131231199.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mPlayerView = null;
      target.mTvTag = null;
      target.mTvCourseName = null;
      target.mTvDescriptionSwitch = null;
      target.mIvDescriptionSwitch = null;
      view2131231138.setOnClickListener(null);
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
