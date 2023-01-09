package org.inaturalist.android.databinding;
import org.inaturalist.android.R;
import org.inaturalist.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TaxonPageBindingImpl extends TaxonPageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.no_taxon_photos_container, 2);
        sViewsWithIds.put(R.id.taxon_iconic_taxon, 3);
        sViewsWithIds.put(R.id.taxon_photos_container, 4);
        sViewsWithIds.put(R.id.loading_photos, 5);
        sViewsWithIds.put(R.id.taxon_photos, 6);
        sViewsWithIds.put(R.id.photos_indicator, 7);
        sViewsWithIds.put(R.id.taxon_buttons, 8);
        sViewsWithIds.put(R.id.compare_taxon, 9);
        sViewsWithIds.put(R.id.select_taxon, 10);
        sViewsWithIds.put(R.id.taxon_name, 11);
        sViewsWithIds.put(R.id.taxon_scientific_name, 12);
        sViewsWithIds.put(R.id.taxon_inactive, 13);
        sViewsWithIds.put(R.id.wikipedia_summary, 14);
        sViewsWithIds.put(R.id.conservation_status_container, 15);
        sViewsWithIds.put(R.id.conservation_status, 16);
        sViewsWithIds.put(R.id.conservation_source, 17);
        sViewsWithIds.put(R.id.loading_seasonability, 18);
        sViewsWithIds.put(R.id.seasonability_tabs, 19);
        sViewsWithIds.put(R.id.seasonability_view_pager, 20);
        sViewsWithIds.put(R.id.taxonomy_list, 21);
        sViewsWithIds.put(R.id.view_observations, 22);
        sViewsWithIds.put(R.id.view_on_inat, 23);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TaxonPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private TaxonPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.ProgressBar) bindings[5]
            , (android.widget.ProgressBar) bindings[18]
            , (android.widget.RelativeLayout) bindings[2]
            , (com.viewpagerindicator.CirclePageIndicator) bindings[7]
            , (android.widget.ScrollView) bindings[0]
            , (com.google.android.material.tabs.TabLayout) bindings[19]
            , (androidx.viewpager.widget.ViewPager) bindings[20]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (uk.co.senab.photoview.HackyViewPager) bindings[6]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ListView) bindings[21]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.TextView) bindings[14]
            );
        this.scrollView.setTag(null);
        this.taxonomyInfo.setTag(null);
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

            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.taxonomyInfo, 80);
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