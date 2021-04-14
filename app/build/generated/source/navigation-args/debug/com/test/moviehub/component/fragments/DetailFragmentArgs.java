package com.test.moviehub.component.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.test.moviehub.data.model.GetDetailsResponse;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("movie")) {
      GetDetailsResponse movie;
      if (Parcelable.class.isAssignableFrom(GetDetailsResponse.class) || Serializable.class.isAssignableFrom(GetDetailsResponse.class)) {
        movie = (GetDetailsResponse) bundle.get("movie");
      } else {
        throw new UnsupportedOperationException(GetDetailsResponse.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("movie", movie);
    } else {
      throw new IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("title")) {
      String title;
      title = bundle.getString("title");
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("title", title);
    } else {
      throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public GetDetailsResponse getMovie() {
    return (GetDetailsResponse) arguments.get("movie");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTitle() {
    return (String) arguments.get("title");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("movie")) {
      GetDetailsResponse movie = (GetDetailsResponse) arguments.get("movie");
      if (Parcelable.class.isAssignableFrom(GetDetailsResponse.class) || movie == null) {
        __result.putParcelable("movie", Parcelable.class.cast(movie));
      } else if (Serializable.class.isAssignableFrom(GetDetailsResponse.class)) {
        __result.putSerializable("movie", Serializable.class.cast(movie));
      } else {
        throw new UnsupportedOperationException(GetDetailsResponse.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    if (arguments.containsKey("title")) {
      String title = (String) arguments.get("title");
      __result.putString("title", title);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("movie") != that.arguments.containsKey("movie")) {
      return false;
    }
    if (getMovie() != null ? !getMovie().equals(that.getMovie()) : that.getMovie() != null) {
      return false;
    }
    if (arguments.containsKey("title") != that.arguments.containsKey("title")) {
      return false;
    }
    if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getMovie() != null ? getMovie().hashCode() : 0);
    result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "movie=" + getMovie()
        + ", title=" + getTitle()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull GetDetailsResponse movie, @NonNull String title) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("title", title);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMovie(@NonNull GetDetailsResponse movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
      return this;
    }

    @NonNull
    public Builder setTitle(@NonNull String title) {
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("title", title);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public GetDetailsResponse getMovie() {
      return (GetDetailsResponse) arguments.get("movie");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTitle() {
      return (String) arguments.get("title");
    }
  }
}
