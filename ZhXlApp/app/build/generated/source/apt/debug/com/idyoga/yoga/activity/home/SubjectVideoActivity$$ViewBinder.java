// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.activity.home;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SubjectVideoActivity$$ViewBinder<T extends SubjectVideoActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231233, "field 'mYogaVideoPlayer'");
    target.mYogaVideoPlayer = finder.castView(view, 2131231233, "field 'mYogaVideoPlayer'");
    view = finder.findRequiredView(source, 2131231202, "field 'mLlTitleBack' and method 'onViewClicked'");
    target.mLlTitleBack = finder.castView(view, 2131231202, "field 'mLlTitleBack'");
    unbinder.view2131231202 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
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
    view = finder.findRequiredView(source, 2131231771, "field 'mTvVideoName'");
    target.mTvVideoName = finder.castView(view, 2131231771, "field 'mTvVideoName'");
    view = finder.findRequiredView(source, 2131231769, "field 'mTvVideoGrade'");
    target.mTvVideoGrade = finder.castView(view, 2131231769, "field 'mTvVideoGrade'");
    view = finder.findRequiredView(source, 2131231770, "field 'mTvVideoDescription'");
    target.mTvVideoDescription = finder.castView(view, 2131231770, "field 'mTvVideoDescription'");
    view = finder.findRequiredView(source, 2131231482, "field 'mScrollView'");
    target.mScrollView = finder.castView(view, 2131231482, "field 'mScrollView'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SubjectVideoActivity> implements Unbinder {
    private T target;

    View view2131231202;

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
      target.mYogaVideoPlayer = null;
      view2131231202.setOnClickListener(null);
      target.mLlTitleBack = null;
      target.mTvTitleText = null;
      target.mTvTitleRight = null;
      target.mLlTitleRight = null;
      target.mLlCommonLayout = null;
      target.mTvVideoName = null;
      target.mTvVideoGrade = null;
      target.mTvVideoDescription = null;
      target.mScrollView = null;
    }
  }
}
