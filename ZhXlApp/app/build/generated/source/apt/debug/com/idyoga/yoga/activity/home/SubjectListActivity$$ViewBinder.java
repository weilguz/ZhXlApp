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

public class SubjectListActivity$$ViewBinder<T extends SubjectListActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231482, "field 'mNsvView'");
    target.mNsvView = finder.castView(view, 2131231482, "field 'mNsvView'");
    view = finder.findRequiredView(source, 2131231035, "field 'mIvHpImg'");
    target.mIvHpImg = finder.castView(view, 2131231035, "field 'mIvHpImg'");
    view = finder.findRequiredView(source, 2131231287, "field 'mPlView'");
    target.mPlView = finder.castView(view, 2131231287, "field 'mPlView'");
    view = finder.findRequiredView(source, 2131231353, "field 'mRlHList'");
    target.mRlHList = finder.castView(view, 2131231353, "field 'mRlHList'");
    view = finder.findRequiredView(source, 2131231230, "field 'mLvVideoList'");
    target.mLvVideoList = finder.castView(view, 2131231230, "field 'mLvVideoList'");
    view = finder.findRequiredView(source, 2131231727, "field 'mTvSubjectTitle'");
    target.mTvSubjectTitle = finder.castView(view, 2131231727, "field 'mTvSubjectTitle'");
    view = finder.findRequiredView(source, 2131231725, "field 'mTvSubjectNumber'");
    target.mTvSubjectNumber = finder.castView(view, 2131231725, "field 'mTvSubjectNumber'");
    view = finder.findRequiredView(source, 2131231373, "field 'mRlSubjectTitle'");
    target.mRlSubjectTitle = finder.castView(view, 2131231373, "field 'mRlSubjectTitle'");
    view = finder.findRequiredView(source, 2131231579, "field 'mTvCourseIntroduce'");
    target.mTvCourseIntroduce = finder.castView(view, 2131231579, "field 'mTvCourseIntroduce'");
    view = finder.findRequiredView(source, 2131230998, "field 'mIv'");
    target.mIv = finder.castView(view, 2131230998, "field 'mIv'");
    view = finder.findRequiredView(source, 2131231348, "field 'mRlCourseMore' and method 'onViewClicked'");
    target.mRlCourseMore = finder.castView(view, 2131231348, "field 'mRlCourseMore'");
    unbinder.view2131231348 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231639, "field 'mTvJoinNumber'");
    target.mTvJoinNumber = finder.castView(view, 2131231639, "field 'mTvJoinNumber'");
    view = finder.findRequiredView(source, 2131231603, "field 'mTvDifficulty'");
    target.mTvDifficulty = finder.castView(view, 2131231603, "field 'mTvDifficulty'");
    view = finder.findRequiredView(source, 2131231591, "field 'mTvCourseTime'");
    target.mTvCourseTime = finder.castView(view, 2131231591, "field 'mTvCourseTime'");
    view = finder.findRequiredView(source, 2131231577, "field 'mTvCourseFunction'");
    target.mTvCourseFunction = finder.castView(view, 2131231577, "field 'mTvCourseFunction'");
    view = finder.findRequiredView(source, 2131231593, "field 'mTvCourseTotal'");
    target.mTvCourseTotal = finder.castView(view, 2131231593, "field 'mTvCourseTotal'");
    view = finder.findRequiredView(source, 2131231130, "field 'mLlBarBack' and method 'onViewClicked'");
    target.mLlBarBack = finder.castView(view, 2131231130, "field 'mLlBarBack'");
    unbinder.view2131231130 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231537, "field 'mTvBarTitle'");
    target.mTvBarTitle = finder.castView(view, 2131231537, "field 'mTvBarTitle'");
    view = finder.findRequiredView(source, 2131231006, "field 'mIvBack'");
    target.mIvBack = finder.castView(view, 2131231006, "field 'mIvBack'");
    view = finder.findRequiredView(source, 2131231007, "field 'mIvBarRight' and method 'onViewClicked'");
    target.mIvBarRight = finder.castView(view, 2131231007, "field 'mIvBarRight'");
    unbinder.view2131231007 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231131, "field 'mLlBarRight'");
    target.mLlBarRight = finder.castView(view, 2131231131, "field 'mLlBarRight'");
    view = finder.findRequiredView(source, 2131231135, "field 'mLlCommonBar'");
    target.mLlCommonBar = finder.castView(view, 2131231135, "field 'mLlCommonBar'");
    view = finder.findRequiredView(source, 2131231410, "field 'mRlList'");
    target.mRlList = finder.castView(view, 2131231410, "field 'mRlList'");
    view = finder.findRequiredView(source, 2131231729, "field 'mTvSubscribe' and method 'onViewClicked'");
    target.mTvSubscribe = finder.castView(view, 2131231729, "field 'mTvSubscribe'");
    unbinder.view2131231729 = view;
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

  protected static class InnerUnbinder<T extends SubjectListActivity> implements Unbinder {
    private T target;

    View view2131231348;

    View view2131231130;

    View view2131231007;

    View view2131231729;

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
      target.mNsvView = null;
      target.mIvHpImg = null;
      target.mPlView = null;
      target.mRlHList = null;
      target.mLvVideoList = null;
      target.mTvSubjectTitle = null;
      target.mTvSubjectNumber = null;
      target.mRlSubjectTitle = null;
      target.mTvCourseIntroduce = null;
      target.mIv = null;
      view2131231348.setOnClickListener(null);
      target.mRlCourseMore = null;
      target.mTvJoinNumber = null;
      target.mTvDifficulty = null;
      target.mTvCourseTime = null;
      target.mTvCourseFunction = null;
      target.mTvCourseTotal = null;
      view2131231130.setOnClickListener(null);
      target.mLlBarBack = null;
      target.mTvBarTitle = null;
      target.mIvBack = null;
      view2131231007.setOnClickListener(null);
      target.mIvBarRight = null;
      target.mLlBarRight = null;
      target.mLlCommonBar = null;
      target.mRlList = null;
      view2131231729.setOnClickListener(null);
      target.mTvSubscribe = null;
    }
  }
}
