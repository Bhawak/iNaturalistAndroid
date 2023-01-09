// Generated by data binding compiler. Do not edit!
package org.inaturalist.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import org.inaturalist.android.R;

public abstract class ExploreFiltersBinding extends ViewDataBinding {
  @NonNull
  public final TextView annotationEqual;

  @NonNull
  public final Spinner annotationName;

  @NonNull
  public final Spinner annotationValue;

  @NonNull
  public final Button applyFilters;

  @NonNull
  public final LinearLayout applyFiltersContainer;

  @NonNull
  public final RelativeLayout casualGrade;

  @NonNull
  public final CheckBox casualGradeCheckbox;

  @NonNull
  public final TextView casualGradeLabel;

  @NonNull
  public final ImageButton clearProject;

  @NonNull
  public final ImageButton clearUser;

  @NonNull
  public final TextView dateAny;

  @NonNull
  public final Spinner dateExact;

  @NonNull
  public final Spinner dateMax;

  @NonNull
  public final Spinner dateMin;

  @NonNull
  public final Spinner dateMonths;

  @NonNull
  public final RadioGroup dates;

  @NonNull
  public final RelativeLayout hasPhotos;

  @NonNull
  public final CheckBox hasPhotosCheckbox;

  @NonNull
  public final TextView hasPhotosLabel;

  @NonNull
  public final RelativeLayout hasSounds;

  @NonNull
  public final CheckBox hasSoundsCheckbox;

  @NonNull
  public final TextView hasSoundsLabel;

  @NonNull
  public final RelativeLayout hideMyObservations;

  @NonNull
  public final CheckBox hideMyObservationsCheckbox;

  @NonNull
  public final TextView hideMyObservationsLabel;

  @NonNull
  public final RelativeLayout needsId;

  @NonNull
  public final CheckBox needsIdCheckbox;

  @NonNull
  public final TextView needsIdLabel;

  @NonNull
  public final RadioButton optionDateAny;

  @NonNull
  public final RadioButton optionDateExact;

  @NonNull
  public final RadioButton optionDateMinMax;

  @NonNull
  public final RadioButton optionDateMonths;

  @NonNull
  public final TextView projectName;

  @NonNull
  public final ImageView projectPic;

  @NonNull
  public final RelativeLayout researchGrade;

  @NonNull
  public final CheckBox researchGradeCheckbox;

  @NonNull
  public final TextView researchGradeLabel;

  @NonNull
  public final RelativeLayout showMyObservations;

  @NonNull
  public final CheckBox showMyObservationsCheckbox;

  @NonNull
  public final TextView showMyObservationsLabel;

  @NonNull
  public final Spinner sortByOrder;

  @NonNull
  public final Spinner sortByProperty;

  @NonNull
  public final RecyclerView taxonicIcons;

  @NonNull
  public final TextView userName;

  @NonNull
  public final ImageView userPic;

  protected ExploreFiltersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView annotationEqual, Spinner annotationName, Spinner annotationValue,
      Button applyFilters, LinearLayout applyFiltersContainer, RelativeLayout casualGrade,
      CheckBox casualGradeCheckbox, TextView casualGradeLabel, ImageButton clearProject,
      ImageButton clearUser, TextView dateAny, Spinner dateExact, Spinner dateMax, Spinner dateMin,
      Spinner dateMonths, RadioGroup dates, RelativeLayout hasPhotos, CheckBox hasPhotosCheckbox,
      TextView hasPhotosLabel, RelativeLayout hasSounds, CheckBox hasSoundsCheckbox,
      TextView hasSoundsLabel, RelativeLayout hideMyObservations,
      CheckBox hideMyObservationsCheckbox, TextView hideMyObservationsLabel, RelativeLayout needsId,
      CheckBox needsIdCheckbox, TextView needsIdLabel, RadioButton optionDateAny,
      RadioButton optionDateExact, RadioButton optionDateMinMax, RadioButton optionDateMonths,
      TextView projectName, ImageView projectPic, RelativeLayout researchGrade,
      CheckBox researchGradeCheckbox, TextView researchGradeLabel,
      RelativeLayout showMyObservations, CheckBox showMyObservationsCheckbox,
      TextView showMyObservationsLabel, Spinner sortByOrder, Spinner sortByProperty,
      RecyclerView taxonicIcons, TextView userName, ImageView userPic) {
    super(_bindingComponent, _root, _localFieldCount);
    this.annotationEqual = annotationEqual;
    this.annotationName = annotationName;
    this.annotationValue = annotationValue;
    this.applyFilters = applyFilters;
    this.applyFiltersContainer = applyFiltersContainer;
    this.casualGrade = casualGrade;
    this.casualGradeCheckbox = casualGradeCheckbox;
    this.casualGradeLabel = casualGradeLabel;
    this.clearProject = clearProject;
    this.clearUser = clearUser;
    this.dateAny = dateAny;
    this.dateExact = dateExact;
    this.dateMax = dateMax;
    this.dateMin = dateMin;
    this.dateMonths = dateMonths;
    this.dates = dates;
    this.hasPhotos = hasPhotos;
    this.hasPhotosCheckbox = hasPhotosCheckbox;
    this.hasPhotosLabel = hasPhotosLabel;
    this.hasSounds = hasSounds;
    this.hasSoundsCheckbox = hasSoundsCheckbox;
    this.hasSoundsLabel = hasSoundsLabel;
    this.hideMyObservations = hideMyObservations;
    this.hideMyObservationsCheckbox = hideMyObservationsCheckbox;
    this.hideMyObservationsLabel = hideMyObservationsLabel;
    this.needsId = needsId;
    this.needsIdCheckbox = needsIdCheckbox;
    this.needsIdLabel = needsIdLabel;
    this.optionDateAny = optionDateAny;
    this.optionDateExact = optionDateExact;
    this.optionDateMinMax = optionDateMinMax;
    this.optionDateMonths = optionDateMonths;
    this.projectName = projectName;
    this.projectPic = projectPic;
    this.researchGrade = researchGrade;
    this.researchGradeCheckbox = researchGradeCheckbox;
    this.researchGradeLabel = researchGradeLabel;
    this.showMyObservations = showMyObservations;
    this.showMyObservationsCheckbox = showMyObservationsCheckbox;
    this.showMyObservationsLabel = showMyObservationsLabel;
    this.sortByOrder = sortByOrder;
    this.sortByProperty = sortByProperty;
    this.taxonicIcons = taxonicIcons;
    this.userName = userName;
    this.userPic = userPic;
  }

  @NonNull
  public static ExploreFiltersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.explore_filters, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ExploreFiltersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ExploreFiltersBinding>inflateInternal(inflater, R.layout.explore_filters, root, attachToRoot, component);
  }

  @NonNull
  public static ExploreFiltersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.explore_filters, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ExploreFiltersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ExploreFiltersBinding>inflateInternal(inflater, R.layout.explore_filters, null, false, component);
  }

  public static ExploreFiltersBinding bind(@NonNull View view) {
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
  public static ExploreFiltersBinding bind(@NonNull View view, @Nullable Object component) {
    return (ExploreFiltersBinding)bind(component, view, R.layout.explore_filters);
  }
}