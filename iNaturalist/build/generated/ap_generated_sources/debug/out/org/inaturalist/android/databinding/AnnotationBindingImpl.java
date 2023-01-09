package org.inaturalist.android.databinding;
import org.inaturalist.android.R;
import org.inaturalist.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AnnotationBindingImpl extends AnnotationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_view, 4);
        sViewsWithIds.put(R.id.attribute_name, 5);
        sViewsWithIds.put(R.id.select_attribute_value, 6);
        sViewsWithIds.put(R.id.attribute_value, 7);
        sViewsWithIds.put(R.id.expanded_section, 8);
        sViewsWithIds.put(R.id.agree_container, 9);
        sViewsWithIds.put(R.id.agree_prefix, 10);
        sViewsWithIds.put(R.id.agree_icon, 11);
        sViewsWithIds.put(R.id.agree_text, 12);
        sViewsWithIds.put(R.id.disagree_container, 13);
        sViewsWithIds.put(R.id.disagree_prefix, 14);
        sViewsWithIds.put(R.id.disagree_icon, 15);
        sViewsWithIds.put(R.id.disagree_text, 16);
        sViewsWithIds.put(R.id.loading, 17);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AnnotationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private AnnotationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[2]
            );
        this.deleteAttributeValue.setTag(null);
        this.expand.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
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

            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.deleteAttributeValue, 80);
            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.expand, 40);
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