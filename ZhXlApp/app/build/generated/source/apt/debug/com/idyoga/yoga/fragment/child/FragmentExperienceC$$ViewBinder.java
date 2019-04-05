// Generated code from Butter Knife. Do not modify!
package com.idyoga.yoga.fragment.child;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class FragmentExperienceC$$ViewBinder<T extends FragmentExperienceC> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131230970, "field 'mGvList'");
    target.mGvList = finder.castView(view, 2131230970, "field 'mGvList'");
    view = finder.findRequiredView(source, 2131231759, "field 'mTvType'");
    target.mTvType = finder.castView(view, 2131231759, "field 'mTvType'");
    view = finder.findRequiredView(source, 2131231712, "field 'mTvSort'");
    target.mTvSort = finder.castView(view, 2131231712, "field 'mTvSort'");
    view = finder.findRequiredView(source, 2131231616, "field 'mTvFilter'");
    target.mTvFilter = finder.castView(view, 2131231616, "field 'mTvFilter'");
    view = finder.findRequiredView(source, 2131231173, "field 'mLlMsg'");
    target.mLlMsg = finder.castView(view, 2131231173, "field 'mLlMsg'");
    view = finder.findRequiredView(source, 2131230730, "field 'mAblLayout'");
    target.mAblLayout = finder.castView(view, 2131230730, "field 'mAblLayout'");
    view = finder.findRequiredView(source, 2131231407, "field 'mRvList'");
    target.mRvList = finder.castView(view, 2131231407, "field 'mRvList'");
    view = finder.findRequiredView(source, 2131230862, "field 'mClLayout'");
    target.mClLayout = finder.castView(view, 2131230862, "field 'mClLayout'");
    view = finder.findRequiredView(source, 2131230836, "field 'mBvView'");
    target.mBvView = finder.castView(view, 2131230836, "field 'mBvView'");
    view = finder.findRequiredView(source, 2131231467, "field 'mSrlRefresh'");
    target.mSrlRefresh = finder.castView(view, 2131231467, "field 'mSrlRefresh'");
    view = finder.findRequiredView(source, 2131231084, "field 'mIvType'");
    target.mIvType = finder.castView(view, 2131231084, "field 'mIvType'");
    view = finder.findRequiredView(source, 2131231202, "field 'mLlTypeLayout' and method 'onViewClicked'");
    target.mLlTypeLayout = finder.castView(view, 2131231202, "field 'mLlTypeLayout'");
    unbinder.view2131231202 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231064, "field 'mIvSort'");
    target.mIvSort = finder.castView(view, 2131231064, "field 'mIvSort'");
    view = finder.findRequiredView(source, 2131231188, "field 'mLlSortLayout' and method 'onViewClicked'");
    target.mLlSortLayout = finder.castView(view, 2131231188, "field 'mLlSortLayout'");
    unbinder.view2131231188 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231020, "field 'mIvFilter'");
    target.mIvFilter = finder.castView(view, 2131231020, "field 'mIvFilter'");
    view = finder.findRequiredView(source, 2131231141, "field 'mLlFilterLayout' and method 'onViewClicked'");
    target.mLlFilterLayout = finder.castView(view, 2131231141, "field 'mLlFilterLayout'");
    unbinder.view2131231141 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231523, "field 'mTvAddress'");
    target.mTvAddress = finder.castView(view, 2131231523, "field 'mTvAddress'");
    view = finder.findRequiredView(source, 2131231125, "field 'mLlAddress' and method 'onViewClicked'");
    target.mLlAddress = finder.castView(view, 2131231125, "field 'mLlAddress'");
    unbinder.view2131231125 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131230940, "field 'mEtSearch' and method 'onViewClicked'");
    target.mEtSearch = finder.castView(view, 2131230940, "field 'mEtSearch'");
    unbinder.view2131230940 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231055, "field 'mIvSearch' and method 'onViewClicked'");
    target.mIvSearch = finder.castView(view, 2131231055, "field 'mIvSearch'");
    unbinder.view2131231055 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231180, "field 'mLlSearchTitle'");
    target.mLlSearchTitle = finder.castView(view, 2131231180, "field 'mLlSearchTitle'");
    view = finder.findRequiredView(source, 2131230998, "field 'mIvAddressSelect'");
    target.mIvAddressSelect = finder.castView(view, 2131230998, "field 'mIvAddressSelect'");
    view = finder.findRequiredView(source, 2131231524, "field 'mTvAddressSelect'");
    target.mTvAddressSelect = finder.castView(view, 2131231524, "field 'mTvAddressSelect'");
    view = finder.findRequiredView(source, 2131231126, "field 'mLlAddressLayout' and method 'onViewClicked'");
    target.mLlAddressLayout = finder.castView(view, 2131231126, "field 'mLlAddressLayout'");
    unbinder.view2131231126 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = finder.findRequiredView(source, 2131231392, "field 'mRlvSpecial'");
    target.mRlvSpecial = finder.castView(view, 2131231392, "field 'mRlvSpecial'");
    view = finder.findRequiredView(source, 2131231144, "field 'mLlHeadBanner'");
    target.mLlHeadBanner = finder.castView(view, 2131231144, "field 'mLlHeadBanner'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends FragmentExperienceC> implements Unbinder {
    private T target;

    View view2131231202;

    View view2131231188;

    View view2131231141;

    View view2131231125;

    View view2131230940;

    View view2131231055;

    View view2131231126;

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
      target.mGvList = null;
      target.mTvType = null;
      target.mTvSort = null;
      target.mTvFilter = null;
      target.mLlMsg = null;
      target.mAblLayout = null;
      target.mRvList = null;
      target.mClLayout = null;
      target.mBvView = null;
      target.mSrlRefresh = null;
      target.mIvType = null;
      view2131231202.setOnClickListener(null);
      target.mLlTypeLayout = null;
      target.mIvSort = null;
      view2131231188.setOnClickListener(null);
      target.mLlSortLayout = null;
      target.mIvFilter = null;
      view2131231141.setOnClickListener(null);
      target.mLlFilterLayout = null;
      target.mTvAddress = null;
      view2131231125.setOnClickListener(null);
      target.mLlAddress = null;
      view2131230940.setOnClickListener(null);
      target.mEtSearch = null;
      view2131231055.setOnClickListener(null);
      target.mIvSearch = null;
      target.mLlSearchTitle = null;
      target.mIvAddressSelect = null;
      target.mTvAddressSelect = null;
      view2131231126.setOnClickListener(null);
      target.mLlAddressLayout = null;
      target.mRlvSpecial = null;
      target.mLlHeadBanner = null;
    }
  }
}
