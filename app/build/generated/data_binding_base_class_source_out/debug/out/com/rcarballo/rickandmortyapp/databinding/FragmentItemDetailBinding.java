// Generated by data binding compiler. Do not edit!
package com.rcarballo.rickandmortyapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rcarballo.rickandmortyapp.R;
import com.rcarballo.rickandmortyapp.ui.DetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentItemDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView accountEpisodeTextView;

  @NonNull
  public final CardView cardViewList;

  @NonNull
  public final TextView firstSeenTextView;

  @NonNull
  public final TextView genderTextView;

  @NonNull
  public final ConstraintLayout itemDetailNavContainer;

  @NonNull
  public final NestedScrollView itemDetailScrollView;

  @NonNull
  public final TextView lastLocationTextView;

  @NonNull
  public final TextView locationTextView;

  @NonNull
  public final TextView maleTextView;

  @NonNull
  public final TextView nameTextView;

  @NonNull
  public final TextView numberEpisodeTextView;

  @NonNull
  public final TextView originTextView;

  @NonNull
  public final ImageView roundedImage;

  @NonNull
  public final TextView separatorTextView;

  @NonNull
  public final RelativeLayout shapeLayout;

  @NonNull
  public final TextView speciesTextView;

  @NonNull
  public final ImageView statusImage;

  @NonNull
  public final TextView statusTextView;

  @NonNull
  public final TextView typeRickTextView;

  @NonNull
  public final TextView typeTextView;

  @Bindable
  protected DetailViewModel mViewModel;

  protected FragmentItemDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView accountEpisodeTextView, CardView cardViewList, TextView firstSeenTextView,
      TextView genderTextView, ConstraintLayout itemDetailNavContainer,
      NestedScrollView itemDetailScrollView, TextView lastLocationTextView,
      TextView locationTextView, TextView maleTextView, TextView nameTextView,
      TextView numberEpisodeTextView, TextView originTextView, ImageView roundedImage,
      TextView separatorTextView, RelativeLayout shapeLayout, TextView speciesTextView,
      ImageView statusImage, TextView statusTextView, TextView typeRickTextView,
      TextView typeTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accountEpisodeTextView = accountEpisodeTextView;
    this.cardViewList = cardViewList;
    this.firstSeenTextView = firstSeenTextView;
    this.genderTextView = genderTextView;
    this.itemDetailNavContainer = itemDetailNavContainer;
    this.itemDetailScrollView = itemDetailScrollView;
    this.lastLocationTextView = lastLocationTextView;
    this.locationTextView = locationTextView;
    this.maleTextView = maleTextView;
    this.nameTextView = nameTextView;
    this.numberEpisodeTextView = numberEpisodeTextView;
    this.originTextView = originTextView;
    this.roundedImage = roundedImage;
    this.separatorTextView = separatorTextView;
    this.shapeLayout = shapeLayout;
    this.speciesTextView = speciesTextView;
    this.statusImage = statusImage;
    this.statusTextView = statusTextView;
    this.typeRickTextView = typeRickTextView;
    this.typeTextView = typeTextView;
  }

  public abstract void setViewModel(@Nullable DetailViewModel viewModel);

  @Nullable
  public DetailViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentItemDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_item_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentItemDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentItemDetailBinding>inflateInternal(inflater, R.layout.fragment_item_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentItemDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_item_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentItemDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentItemDetailBinding>inflateInternal(inflater, R.layout.fragment_item_detail, null, false, component);
  }

  public static FragmentItemDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentItemDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentItemDetailBinding)bind(component, view, R.layout.fragment_item_detail);
  }
}
