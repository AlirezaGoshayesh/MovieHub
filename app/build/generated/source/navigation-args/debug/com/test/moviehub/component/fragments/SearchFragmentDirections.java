package com.test.moviehub.component.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.test.moviehub.R;
import com.test.moviehub.data.model.GetDetailsResponse;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SearchFragmentDirections {
  private SearchFragmentDirections() {
  }

  @NonNull
  public static ActionFragmentMainToFragmentDetail actionFragmentMainToFragmentDetail(
      @NonNull GetDetailsResponse movie, @NonNull String title) {
    return new ActionFragmentMainToFragmentDetail(movie, title);
  }

  public static class ActionFragmentMainToFragmentDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFragmentMainToFragmentDetail(@NonNull GetDetailsResponse movie,
        @NonNull String title) {
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
    public ActionFragmentMainToFragmentDetail setMovie(@NonNull GetDetailsResponse movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
      return this;
    }

    @NonNull
    public ActionFragmentMainToFragmentDetail setTitle(@NonNull String title) {
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("title", title);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_fragment_main_to_fragment_detail;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFragmentMainToFragmentDetail that = (ActionFragmentMainToFragmentDetail) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getMovie() != null ? getMovie().hashCode() : 0);
      result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFragmentMainToFragmentDetail(actionId=" + getActionId() + "){"
          + "movie=" + getMovie()
          + ", title=" + getTitle()
          + "}";
    }
  }
}
