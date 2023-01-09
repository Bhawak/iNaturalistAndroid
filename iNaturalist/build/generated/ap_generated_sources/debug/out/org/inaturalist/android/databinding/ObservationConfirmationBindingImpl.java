package org.inaturalist.android.databinding;
import org.inaturalist.android.R;
import org.inaturalist.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ObservationConfirmationBindingImpl extends ObservationConfirmationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_content, 4);
        sViewsWithIds.put(R.id.swipeable_layout, 5);
        sViewsWithIds.put(R.id.errors, 6);
        sViewsWithIds.put(R.id.take_photo, 7);
        sViewsWithIds.put(R.id.gallery, 8);
        sViewsWithIds.put(R.id.dummy_focus, 9);
        sViewsWithIds.put(R.id.warning_multiple_photos, 10);
        sViewsWithIds.put(R.id.info_icon2, 11);
        sViewsWithIds.put(R.id.warning_multiple_photos_text, 12);
        sViewsWithIds.put(R.id.warning_multiple_photos_close, 13);
        sViewsWithIds.put(R.id.species_guess_container, 14);
        sViewsWithIds.put(R.id.species_guess_icon, 15);
        sViewsWithIds.put(R.id.clear_species_guess, 16);
        sViewsWithIds.put(R.id.speciesGuess, 17);
        sViewsWithIds.put(R.id.speciesGuessSub, 18);
        sViewsWithIds.put(R.id.onboarding_species_name, 19);
        sViewsWithIds.put(R.id.info_icon, 20);
        sViewsWithIds.put(R.id.onboarding_species_name_description, 21);
        sViewsWithIds.put(R.id.onboarding_species_name_close, 22);
        sViewsWithIds.put(R.id.notes_icon, 23);
        sViewsWithIds.put(R.id.description, 24);
        sViewsWithIds.put(R.id.time_icon, 25);
        sViewsWithIds.put(R.id.observed_on_string, 26);
        sViewsWithIds.put(R.id.time_observed_at, 27);
        sViewsWithIds.put(R.id.observed_on, 28);
        sViewsWithIds.put(R.id.location_left_side, 29);
        sViewsWithIds.put(R.id.location_icon, 30);
        sViewsWithIds.put(R.id.locationProgress, 31);
        sViewsWithIds.put(R.id.finding_current_location, 32);
        sViewsWithIds.put(R.id.locationRefreshButton, 33);
        sViewsWithIds.put(R.id.location_guess, 34);
        sViewsWithIds.put(R.id.coordinates, 35);
        sViewsWithIds.put(R.id.latitude, 36);
        sViewsWithIds.put(R.id.longitude, 37);
        sViewsWithIds.put(R.id.accuracy_prefix, 38);
        sViewsWithIds.put(R.id.accuracy, 39);
        sViewsWithIds.put(R.id.location_visibility_icon, 40);
        sViewsWithIds.put(R.id.locationVisibility, 41);
        sViewsWithIds.put(R.id.location_visibility_description, 42);
        sViewsWithIds.put(R.id.geoprivacy, 43);
        sViewsWithIds.put(R.id.is_captive, 44);
        sViewsWithIds.put(R.id.is_captive_icon, 45);
        sViewsWithIds.put(R.id.is_captive_checkbox, 46);
        sViewsWithIds.put(R.id.projects_icon, 47);
        sViewsWithIds.put(R.id.project_count, 48);
        sViewsWithIds.put(R.id.select_projects, 49);
        sViewsWithIds.put(R.id.bottom_bar, 50);
        sViewsWithIds.put(R.id.save_observation, 51);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ObservationConfirmationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 52, sIncludes, sViewsWithIds));
    }
    private ObservationConfirmationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[39]
            , (android.widget.TextView) bindings[38]
            , (com.google.android.material.bottomappbar.BottomAppBar) bindings[50]
            , (android.widget.ImageView) bindings[16]
            , (com.google.android.flexbox.FlexboxLayout) bindings[35]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.EditText) bindings[24]
            , (android.view.View) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[32]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.Spinner) bindings[43]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.RelativeLayout) bindings[44]
            , (android.widget.CheckBox) bindings[46]
            , (android.widget.ImageView) bindings[45]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[34]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.RelativeLayout) bindings[29]
            , (android.widget.ProgressBar) bindings[31]
            , (android.widget.RelativeLayout) bindings[33]
            , (android.widget.RelativeLayout) bindings[41]
            , (android.widget.TextView) bindings[42]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.TextView) bindings[37]
            , (android.widget.ScrollView) bindings[4]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[26]
            , (android.widget.RelativeLayout) bindings[19]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[48]
            , (android.widget.ImageView) bindings[47]
            , (android.widget.ImageView) bindings[2]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[51]
            , (android.widget.TextView) bindings[49]
            , (android.widget.EditText) bindings[17]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.TextView) bindings[18]
            , (org.inaturalist.android.SwipeableLinearLayout) bindings[5]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.TextView) bindings[27]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            );
        this.deleteObservation.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recordSound.setTag(null);
        this.takePhotoBottom.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        if ((dirtyFlags & 0x1L) != 0) {
            // api target 1

            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.deleteObservation, 80);
            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.recordSound, 80);
            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.takePhotoBottom, 80);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}