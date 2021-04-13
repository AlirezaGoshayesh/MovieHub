// Generated by data binding compiler. Do not edit!
package com.test.moviehub.databinding;

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
import com.test.moviehub.R;
import com.test.moviehub.data.model.MovieResult;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMoviewBinding extends ViewDataBinding {
  @NonNull
  public final ImageView img;

  @NonNull
  public final TextView text;

  @Bindable
  protected MovieResult mMovie;

  protected ItemMoviewBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView img, TextView text) {
    super(_bindingComponent, _root, _localFieldCount);
    this.img = img;
    this.text = text;
  }

  public abstract void setMovie(@Nullable MovieResult movie);

  @Nullable
  public MovieResult getMovie() {
    return mMovie;
  }

  @NonNull
  public static ItemMoviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_moview, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMoviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMoviewBinding>inflateInternal(inflater, R.layout.item_moview, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMoviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_moview, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMoviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMoviewBinding>inflateInternal(inflater, R.layout.item_moview, null, false, component);
  }

  public static ItemMoviewBinding bind(@NonNull View view) {
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
  public static ItemMoviewBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMoviewBinding)bind(component, view, R.layout.item_moview);
  }
}
