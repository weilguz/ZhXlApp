// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment.child.course;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class FragmentExperienceCourseAppointment$$ViewBinder<T extends FragmentExperienceCourseAppointment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131231382, "field 'mLvCourseList'");
    target.mLvCourseList = finder.castView(view, 2131231382, "field 'mLvCourseList'");
    view = finder.findRequiredView(source, 2131231468, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131231468, "field 'mRefreshLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends FragmentExperienceCourseAppointment> implements Unbinder {
    private T target;

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
      target.mLvCourseList = null;
      target.mRefreshLayout = null;
    }
  }
}