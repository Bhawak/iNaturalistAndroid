package org.inaturalist.android.databinding;
import org.inaturalist.android.R;
import org.inaturalist.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CommentIdItemObsViewerBindingImpl extends CommentIdItemObsViewerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.user_details, 3);
        sViewsWithIds.put(R.id.posted_on, 4);
        sViewsWithIds.put(R.id.content_hidden, 5);
        sViewsWithIds.put(R.id.id_layout, 6);
        sViewsWithIds.put(R.id.id_pic, 7);
        sViewsWithIds.put(R.id.id_name, 8);
        sViewsWithIds.put(R.id.id_taxon_name, 9);
        sViewsWithIds.put(R.id.taxon_inactive, 10);
        sViewsWithIds.put(R.id.bottom_part, 11);
        sViewsWithIds.put(R.id.show_hidden_content, 12);
        sViewsWithIds.put(R.id.comment, 13);
        sViewsWithIds.put(R.id.id_agree_container, 14);
        sViewsWithIds.put(R.id.id_agree, 15);
        sViewsWithIds.put(R.id.id_agree_text, 16);
        sViewsWithIds.put(R.id.loading, 17);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CommentIdItemObsViewerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private CommentIdItemObsViewerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.TextView) bindings[13]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RelativeLayout) bindings[17]
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[12]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.ImageView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.moreMenu.setTag(null);
        this.userPic.setTag(null);
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

            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.moreMenu, 80);
            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.userPic, 80);
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