// Generated by data binding compiler. Do not edit!
package com.rcarballo.rickandmortyapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.card.MaterialCardView;
import com.rcarballo.rickandmortyapp.Personaje;
import com.rcarballo.rickandmortyapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemListContentBinding extends ViewDataBinding {
  @NonNull
  public final MaterialCardView cardViewList;

  @NonNull
  public final TextView lastLocationTextView;

  @NonNull
  public final TextView locationTextView;

  @NonNull
  public final TextView nameTextView;

  @NonNull
  public final ImageView rickAndMortyImage;

  @NonNull
  public final TextView separatorTextView;

  @NonNull
  public final TextView speciesTextView;

  @NonNull
  public final ImageView statusImage;

  @NonNull
  public final TextView statusTextView;

  @Bindable
  protected Personaje mProperty;

  protected ItemListContentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialCardView cardViewList, TextView lastLocationTextView, TextView locationTextView,
      TextView nameTextView, ImageView rickAndMortyImage, TextView separatorTextView,
      TextView speciesTextView, ImageView statusImage, TextView statusTextView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardViewList = cardViewList;
    this.lastLocationTextView = lastLocationTextView;
    this.locationTextView = locationTextView;
    this.nameTextView = nameTextView;
    this.rickAndMortyImage = rickAndMortyImage;
    this.separatorTextView = separatorTextView;
    this.speciesTextView = speciesTextView;
    this.statusImage = statusImage;
    this.statusTextView = statusTextView;
  }

  public abstract void setProperty(@Nullable Personaje property);

  @Nullable
  public Personaje getProperty() {
    return mProperty;
  }

  @NonNull
  public static ItemListContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list_content, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemListContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemListContentBinding>inflateInternal(inflater, R.layout.item_list_content, root, attachToRoot, component);
  }

  @NonNull
  public static ItemListContentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_list_content, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemListContentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemListContentBinding>inflateInternal(inflater, R.layout.item_list_content, null, false, component);
  }

  public static ItemListContentBinding bind(@NonNull View view) {
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
  public static ItemListContentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemListContentBinding)bind(component, view, R.layout.item_list_content);
  }
}
