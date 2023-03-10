package org.inaturalist.android.databinding;
import org.inaturalist.android.R;
import org.inaturalist.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ExploreSearchBindingImpl extends ExploreSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_icon_area, 3);
        sViewsWithIds.put(R.id.search_button, 4);
        sViewsWithIds.put(R.id.taxon_icon, 5);
        sViewsWithIds.put(R.id.taxon_edit_text, 6);
        sViewsWithIds.put(R.id.location_container, 7);
        sViewsWithIds.put(R.id.location_icon, 8);
        sViewsWithIds.put(R.id.location_edit_text, 9);
        sViewsWithIds.put(R.id.search_results, 10);
        sViewsWithIds.put(R.id.loading_results, 11);
        sViewsWithIds.put(R.id.no_results_found, 12);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ExploreSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ExploreSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.ImageButton) bindings[1]
            , (android.widget.ProgressBar) bindings[11]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.EditText) bindings[9]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.ListView) bindings[10]
            , (android.widget.EditText) bindings[6]
            , (android.widget.ImageView) bindings[5]
            );
        this.clearLocation.setTag(null);
        this.clearTaxon.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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

            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.clearLocation, 100);
            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.clearTaxon, 100);
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