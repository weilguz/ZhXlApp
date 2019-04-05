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
    view = finder.findRequiredView(source, 2131231479, "field 'mNsvView'");
    target.mNsvView = finder.castView(view, 2131231479, "field 'mNsvView'");
    view = finder.findRequiredView(source, 2131231032, "field 'mIvHpImg'");
    target.mIvHpImg = finder.castView(view, 2131231032, "field 'mIvHpImg'");
    view = finder.findRequiredView(source, 2131231284, "field 'mPlView'");
    target.mPlView = finder.castView(view, 2131231284, "field 'mPlView'");
    view = finder.findRequiredView(source, 2131231350, "field 'mRlHList'");
    target.mRlHList = finder.castView(view, 2131231350, "field 'mRlHList'");
    view = finder.findRequiredView(source, 2131231227, "field 'mLvVideoList'");
    target.mLvVideoList = finder.castView(view, 2131231227, "field 'mLvVideoList'");
    view = finder.findRequiredView(source, 2131231724, "field 'mTvSubjectTitle'");
    target.mTvSubjectTitle = finder.castView(view, 2131231724, "field 'mTvSubjectTitle'");
    view = finder.findRequiredView(source, 2131231722, "field 'mTvSubjectNumber'");
    target.mTvSubjectNumber = finder.castView(view, 2131231722, "field 'mTvSubjectNumber'");
    view = finder.findRequiredView(source, 2131231370, "field 'mRlSubjectTitle'");
    target.mRlSubjectTitle = finder.castView(view, 2131231370, "field 'mRlSubjectTitle'");
    view = finder.findRequiredView(source, 2131231576, "field 'mTvCourseIntroduce'");
    target.mTvCourseIntroduce = finder.castView(view, 2131231576, "field 'mTvCourseIntroduce'");
    view = finder.findRequiredView(source, 2131230995, "field 'mIv'");
    target.mIv = finder.castView(view, 2131230995, "field 'mIv'");
    view = finder.findRequiredView(source, 2131231345, "field 'mRlCourseMore' and method 'onViewClicked'");
    target.mRlCourseMore = finder.castView(view, 2131231345, "field 'mRlCourseMore'");
    unbinder.view2131231345 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231636, "field 'mTvJoinNumber'");
    target.mTvJoinNumber = finder.castView(view, 2131231636, "field 'mTvJoinNumber'");
    view = finder.findRequiredView(source, 2131231600, "field 'mTvDifficulty'");
    target.mTvDifficulty = finder.castView(view, 2131231600, "field 'mTvDifficulty'");
    view = finder.findRequiredView(source, 2131231588, "field 'mTvCourseTime'");
    target.mTvCourseTime = finder.castView(view, 2131231588, "field 'mTvCourseTime'");
    view = finder.findRequiredView(source, 2131231574, "field 'mTvCourseFunction'");
    target.mTvCourseFunction = finder.castView(view, 2131231574, "field 'mTvCourseFunction'");
    view = finder.findRequiredView(source, 2131231590, "field 'mTvCourseTotal'");
    target.mTvCourseTotal = finder.castView(view, 2131231590, "field 'mTvCourseTotal'");
    view = finder.findRequiredView(source, 2131231127, "field 'mLlBarBack' and method 'onViewClicked'");
    target.mLlBarBack = finder.castView(view, 2131231127, "field 'mLlBarBack'");
    unbinder.view2131231127 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231534, "field 'mTvBarTitle'");
    target.mTvBarTitle = finder.castView(view, 2131231534, "field 'mTvBarTitle'");
    view = finder.findRequiredView(source, 2131231003, "field 'mIvBack'");
    target.mIvBack = finder.castView(view, 2131231003, "field 'mIvBack'");
    view = finder.findRequiredView(source, 2131231004, "field 'mIvBarRight' and method 'onViewClicked'");
    target.mIvBarRight = finder.castView(view, 2131231004, "field 'mIvBarRight'");
    unbinder.view2131231004 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231128, "field 'mLlBarRight'");
    target.mLlBarRight = finder.castView(view, 2131231128, "field 'mLlBarRight'");
    view = finder.findRequiredView(source, 2131231132, "field 'mLlCommonBar'");
    target.mLlCommonBar = finder.castView(view, 2131231132, "field 'mLlCommonBar'");
    view = finder.findRequiredView(source, 2131231407, "field 'mRlList'");
    target.mRlList = finder.castView(view, 2131231407, "field 'mRlList'");
    view = finder.findRequiredView(source, 2131231726, "field 'mTvSubscribe' and method 'onViewClicked'");
    target.mTvSubscribe = finder.castView(view, 2131231726, "field 'mTvSubscribe'");
    unbinder.view2131231726 = view;
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

    View view2131231345;

    View view2131231127;

    View view2131231004;

    View view2131231726;

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
      view2131231345.setOnClickListener(null);
      target.mRlCourseMore = null;
      target.mTvJoinNumber = null;
      target.mTvDifficulty = null;
      target.mTvCourseTime = null;
      target.mTvCourseFunction = null;
      target.mTvCourseTotal = null;
      view2131231127.setOnClickListener(null);
      target.mLlBarBack = null;
      target.mTvBarTitle = null;
      target.mIvBack = null;
      view2131231004.setOnClickListener(null);
      target.mIvBarRight = null;
      target.mLlBarRight = null;
      target.mLlCommonBar = null;
      target.mRlList = null;
      view2131231726.setOnClickListener(null);
      target.mTvSubscribe = null;
    }
  }
}
