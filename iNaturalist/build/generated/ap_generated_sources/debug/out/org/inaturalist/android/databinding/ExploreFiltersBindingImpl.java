package org.inaturalist.android.databinding;
import org.inaturalist.android.R;
import org.inaturalist.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ExploreFiltersBindingImpl extends ExploreFiltersBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.apply_filters_container, 3);
        sViewsWithIds.put(R.id.apply_filters, 4);
        sViewsWithIds.put(R.id.taxonic_icons, 5);
        sViewsWithIds.put(R.id.show_my_observations, 6);
        sViewsWithIds.put(R.id.show_my_observations_checkbox, 7);
        sViewsWithIds.put(R.id.show_my_observations_label, 8);
        sViewsWithIds.put(R.id.hide_my_observations, 9);
        sViewsWithIds.put(R.id.hide_my_observations_checkbox, 10);
        sViewsWithIds.put(R.id.hide_my_observations_label, 11);
        sViewsWithIds.put(R.id.project_pic, 12);
        sViewsWithIds.put(R.id.project_name, 13);
        sViewsWithIds.put(R.id.user_pic, 14);
        sViewsWithIds.put(R.id.user_name, 15);
        sViewsWithIds.put(R.id.research_grade, 16);
        sViewsWithIds.put(R.id.research_grade_checkbox, 17);
        sViewsWithIds.put(R.id.research_grade_label, 18);
        sViewsWithIds.put(R.id.needs_id, 19);
        sViewsWithIds.put(R.id.needs_id_checkbox, 20);
        sViewsWithIds.put(R.id.needs_id_label, 21);
        sViewsWithIds.put(R.id.casual_grade, 22);
        sViewsWithIds.put(R.id.casual_grade_checkbox, 23);
        sViewsWithIds.put(R.id.casual_grade_label, 24);
        sViewsWithIds.put(R.id.has_photos, 25);
        sViewsWithIds.put(R.id.has_photos_checkbox, 26);
        sViewsWithIds.put(R.id.has_photos_label, 27);
        sViewsWithIds.put(R.id.has_sounds, 28);
        sViewsWithIds.put(R.id.has_sounds_checkbox, 29);
        sViewsWithIds.put(R.id.has_sounds_label, 30);
        sViewsWithIds.put(R.id.dates, 31);
        sViewsWithIds.put(R.id.option_date_any, 32);
        sViewsWithIds.put(R.id.date_any, 33);
        sViewsWithIds.put(R.id.option_date_exact, 34);
        sViewsWithIds.put(R.id.date_exact, 35);
        sViewsWithIds.put(R.id.option_date_min_max, 36);
        sViewsWithIds.put(R.id.date_min, 37);
        sViewsWithIds.put(R.id.date_max, 38);
        sViewsWithIds.put(R.id.option_date_months, 39);
        sViewsWithIds.put(R.id.date_months, 40);
        sViewsWithIds.put(R.id.sort_by_property, 41);
        sViewsWithIds.put(R.id.sort_by_order, 42);
        sViewsWithIds.put(R.id.annotation_name, 43);
        sViewsWithIds.put(R.id.annotation_equal, 44);
        sViewsWithIds.put(R.id.annotation_value, 45);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ExploreFiltersBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 46, sIncludes, sViewsWithIds));
    }
    private ExploreFiltersBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[44]
            , (android.widget.Spinner) bindings[43]
            , (android.widget.Spinner) bindings[45]
            , (android.widget.Button) bindings[4]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.RelativeLayout) bindings[22]
            , (android.widget.CheckBox) bindings[23]
            , (android.widget.TextView) bindings[24]
            , (android.widget.ImageButton) bindings[1]
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.TextView) bindings[33]
            , (android.widget.Spinner) bindings[35]
            , (android.widget.Spinner) bindings[38]
            , (android.widget.Spinner) bindings[37]
            , (android.widget.Spinner) bindings[40]
            , (android.widget.RadioGroup) bindings[31]
            , (android.widget.RelativeLayout) bindings[25]
            , (android.widget.CheckBox) bindings[26]
            , (android.widget.TextView) bindings[27]
            , (android.widget.RelativeLayout) bindings[28]
            , (android.widget.CheckBox) bindings[29]
            , (android.widget.TextView) bindings[30]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.CheckBox) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.RelativeLayout) bindings[19]
            , (android.widget.CheckBox) bindings[20]
            , (android.widget.TextView) bindings[21]
            , (android.widget.RadioButton) bindings[32]
            , (android.widget.RadioButton) bindings[34]
            , (android.widget.RadioButton) bindings[36]
            , (android.widget.RadioButton) bindings[39]
            , (android.widget.TextView) bindings[13]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.CheckBox) bindings[17]
            , (android.widget.TextView) bindings[18]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.Spinner) bindings[42]
            , (android.widget.Spinner) bindings[41]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageView) bindings[14]
            );
        this.clearProject.setTag(null);
        this.clearUser.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
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

            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.clearProject, 80);
            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.clearUser, 80);
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