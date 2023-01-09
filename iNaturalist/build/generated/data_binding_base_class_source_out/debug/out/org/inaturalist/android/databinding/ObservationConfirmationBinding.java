// Generated by data binding compiler. Do not edit!
package org.inaturalist.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;
import org.inaturalist.android.R;
import org.inaturalist.android.SwipeableLinearLayout;

public abstract class ObservationConfirmationBinding extends ViewDataBinding {
  @NonNull
  public final TextView accuracy;

  @NonNull
  public final TextView accuracyPrefix;

  @NonNull
  public final BottomAppBar bottomBar;

  @NonNull
  public final ImageView clearSpeciesGuess;

  @NonNull
  public final FlexboxLayout coordinates;

  @NonNull
  public final ImageView deleteObservation;

  @NonNull
  public final EditText description;

  @NonNull
  public final View dummyFocus;

  @NonNull
  public final TextView errors;

  @NonNull
  public final TextView findingCurrentLocation;

  @NonNull
  public final RecyclerView gallery;

  @NonNull
  public final Spinner geoprivacy;

  @NonNull
  public final ImageView infoIcon;

  @NonNull
  public final ImageView infoIcon2;

  @NonNull
  public final RelativeLayout isCaptive;

  @NonNull
  public final CheckBox isCaptiveCheckbox;

  @NonNull
  public final ImageView isCaptiveIcon;

  @NonNull
  public final TextView latitude;

  @NonNull
  public final TextView locationGuess;

  @NonNull
  public final ImageView locationIcon;

  @NonNull
  public final RelativeLayout locationLeftSide;

  @NonNull
  public final ProgressBar locationProgress;

  @NonNull
  public final RelativeLayout locationRefreshButton;

  @NonNull
  public final RelativeLayout locationVisibility;

  @NonNull
  public final TextView locationVisibilityDescription;

  @NonNull
  public final ImageView locationVisibilityIcon;

  @NonNull
  public final TextView longitude;

  @NonNull
  public final ScrollView mainContent;

  @NonNull
  public final ImageView notesIcon;

  @NonNull
  public final TextView observedOn;

  @NonNull
  public final TextView observedOnString;

  @NonNull
  public final RelativeLayout onboardingSpeciesName;

  @NonNull
  public final TextView onboardingSpeciesNameClose;

  @NonNull
  public final TextView onboardingSpeciesNameDescription;

  @NonNull
  public final TextView projectCount;

  @NonNull
  public final ImageView projectsIcon;

  @NonNull
  public final ImageView recordSound;

  @NonNull
  public final FloatingActionButton saveObservation;

  @NonNull
  public final TextView selectProjects;

  @NonNull
  public final EditText speciesGuess;

  @NonNull
  public final RelativeLayout speciesGuessContainer;

  @NonNull
  public final ImageView speciesGuessIcon;

  @NonNull
  public final TextView speciesGuessSub;

  @NonNull
  public final SwipeableLinearLayout swipeableLayout;

  @NonNull
  public final ImageButton takePhoto;

  @NonNull
  public final ImageView takePhotoBottom;

  @NonNull
  public final ImageView timeIcon;

  @NonNull
  public final TextView timeObservedAt;

  @NonNull
  public final RelativeLayout warningMultiplePhotos;

  @NonNull
  public final TextView warningMultiplePhotosClose;

  @NonNull
  public final TextView warningMultiplePhotosText;

  protected ObservationConfirmationBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView accuracy, TextView accuracyPrefix, BottomAppBar bottomBar,
      ImageView clearSpeciesGuess, FlexboxLayout coordinates, ImageView deleteObservation,
      EditText description, View dummyFocus, TextView errors, TextView findingCurrentLocation,
      RecyclerView gallery, Spinner geoprivacy, ImageView infoIcon, ImageView infoIcon2,
      RelativeLayout isCaptive, CheckBox isCaptiveCheckbox, ImageView isCaptiveIcon,
      TextView latitude, TextView locationGuess, ImageView locationIcon,
      RelativeLayout locationLeftSide, ProgressBar locationProgress,
      RelativeLayout locationRefreshButton, RelativeLayout locationVisibility,
      TextView locationVisibilityDescription, ImageView locationVisibilityIcon, TextView longitude,
      ScrollView mainContent, ImageView notesIcon, TextView observedOn, TextView observedOnString,
      RelativeLayout onboardingSpeciesName, TextView onboardingSpeciesNameClose,
      TextView onboardingSpeciesNameDescription, TextView projectCount, ImageView projectsIcon,
      ImageView recordSound, FloatingActionButton saveObservation, TextView selectProjects,
      EditText speciesGuess, RelativeLayout speciesGuessContainer, ImageView speciesGuessIcon,
      TextView speciesGuessSub, SwipeableLinearLayout swipeableLayout, ImageButton takePhoto,
      ImageView takePhotoBottom, ImageView timeIcon, TextView timeObservedAt,
      RelativeLayout warningMultiplePhotos, TextView warningMultiplePhotosClose,
      TextView warningMultiplePhotosText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accuracy = accuracy;
    this.accuracyPrefix = accuracyPrefix;
    this.bottomBar = bottomBar;
    this.clearSpeciesGuess = clearSpeciesGuess;
    this.coordinates = coordinates;
    this.deleteObservation = deleteObservation;
    this.description = description;
    this.dummyFocus = dummyFocus;
    this.errors = errors;
    this.findingCurrentLocation = findingCurrentLocation;
    this.gallery = gallery;
    this.geoprivacy = geoprivacy;
    this.infoIcon = infoIcon;
    this.infoIcon2 = infoIcon2;
    this.isCaptive = isCaptive;
    this.isCaptiveCheckbox = isCaptiveCheckbox;
    this.isCaptiveIcon = isCaptiveIcon;
    this.latitude = latitude;
    this.locationGuess = locationGuess;
    this.locationIcon = locationIcon;
    this.locationLeftSide = locationLeftSide;
    this.locationProgress = locationProgress;
    this.locationRefreshButton = locationRefreshButton;
    this.locationVisibility = locationVisibility;
    this.locationVisibilityDescription = locationVisibilityDescription;
    this.locationVisibilityIcon = locationVisibilityIcon;
    this.longitude = longitude;
    this.mainContent = mainContent;
    this.notesIcon = notesIcon;
    this.observedOn = observedOn;
    this.observedOnString = observedOnString;
    this.onboardingSpeciesName = onboardingSpeciesName;
    this.onboardingSpeciesNameClose = onboardingSpeciesNameClose;
    this.onboardingSpeciesNameDescription = onboardingSpeciesNameDescription;
    this.projectCount = projectCount;
    this.projectsIcon = projectsIcon;
    this.recordSound = recordSound;
    this.saveObservation = saveObservation;
    this.selectProjects = selectProjects;
    this.speciesGuess = speciesGuess;
    this.speciesGuessContainer = speciesGuessContainer;
    this.speciesGuessIcon = speciesGuessIcon;
    this.speciesGuessSub = speciesGuessSub;
    this.swipeableLayout = swipeableLayout;
    this.takePhoto = takePhoto;
    this.takePhotoBottom = takePhotoBottom;
    this.timeIcon = timeIcon;
    this.timeObservedAt = timeObservedAt;
    this.warningMultiplePhotos = warningMultiplePhotos;
    this.warningMultiplePhotosClose = warningMultiplePhotosClose;
    this.warningMultiplePhotosText = warningMultiplePhotosText;
  }

  @NonNull
  public static ObservationConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.observation_confirmation, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ObservationConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ObservationConfirmationBinding>inflateInternal(inflater, R.layout.observation_confirmation, root, attachToRoot, component);
  }

  @NonNull
  public static ObservationConfirmationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.observation_confirmation, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ObservationConfirmationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ObservationConfirmationBinding>inflateInternal(inflater, R.layout.observation_confirmation, null, false, component);
  }

  public static ObservationConfirmationBinding bind(@NonNull View view) {
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
  public static ObservationConfirmationBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ObservationConfirmationBinding)bind(component, view, R.layout.observation_confirmation);
  }
}
