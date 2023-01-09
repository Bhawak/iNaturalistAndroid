package org.inaturalist.android.databinding;
import org.inaturalist.android.R;
import org.inaturalist.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ObservationViewerBindingImpl extends ObservationViewerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.annotations_header, 4);
        sViewsWithIds.put(R.id.scroll_view, 5);
        sViewsWithIds.put(R.id.errors, 6);
        sViewsWithIds.put(R.id.observed_on, 7);
        sViewsWithIds.put(R.id.user_name, 8);
        sViewsWithIds.put(R.id.photos_container, 9);
        sViewsWithIds.put(R.id.photos, 10);
        sViewsWithIds.put(R.id.photos_indicator, 11);
        sViewsWithIds.put(R.id.share_photo, 12);
        sViewsWithIds.put(R.id.loading_photos, 13);
        sViewsWithIds.put(R.id.no_photos, 14);
        sViewsWithIds.put(R.id.id_row, 15);
        sViewsWithIds.put(R.id.id_icon, 16);
        sViewsWithIds.put(R.id.id_name, 17);
        sViewsWithIds.put(R.id.id_sub_name, 18);
        sViewsWithIds.put(R.id.taxon_inactive, 19);
        sViewsWithIds.put(R.id.id_arrow, 20);
        sViewsWithIds.put(android.R.id.tabhost, 21);
        sViewsWithIds.put(android.R.id.tabs, 22);
        sViewsWithIds.put(android.R.id.tabcontent, 23);
        sViewsWithIds.put(R.id.favorites_tab_content, 24);
        sViewsWithIds.put(R.id.sync_to_add_fave, 25);
        sViewsWithIds.put(R.id.login_to_add_fave, 26);
        sViewsWithIds.put(R.id.faves_login_signup, 27);
        sViewsWithIds.put(R.id.faves_sign_up, 28);
        sViewsWithIds.put(R.id.faves_login, 29);
        sViewsWithIds.put(R.id.favorites_list, 30);
        sViewsWithIds.put(R.id.loading_favorites, 31);
        sViewsWithIds.put(R.id.no_favs, 32);
        sViewsWithIds.put(R.id.remove_favorite, 33);
        sViewsWithIds.put(R.id.add_favorite, 34);
        sViewsWithIds.put(R.id.activity_tab_content, 35);
        sViewsWithIds.put(R.id.comment_id_list_background, 36);
        sViewsWithIds.put(R.id.comment_id_list, 37);
        sViewsWithIds.put(R.id.loading_activity, 38);
        sViewsWithIds.put(R.id.sync_to_add_comments_ids, 39);
        sViewsWithIds.put(R.id.login_to_add_comment_id, 40);
        sViewsWithIds.put(R.id.activity_login_signup, 41);
        sViewsWithIds.put(R.id.activity_sign_up, 42);
        sViewsWithIds.put(R.id.activity_login, 43);
        sViewsWithIds.put(R.id.activity_buttons, 44);
        sViewsWithIds.put(R.id.no_activity, 45);
        sViewsWithIds.put(R.id.add_comment, 46);
        sViewsWithIds.put(R.id.add_id, 47);
        sViewsWithIds.put(R.id.info_tab_content, 48);
        sViewsWithIds.put(R.id.notes_container, 49);
        sViewsWithIds.put(R.id.notes, 50);
        sViewsWithIds.put(R.id.unknown_location_container, 51);
        sViewsWithIds.put(R.id.unknown_location, 52);
        sViewsWithIds.put(R.id.location_map_container, 53);
        sViewsWithIds.put(R.id.loading_map, 54);
        sViewsWithIds.put(R.id.location_label_container, 55);
        sViewsWithIds.put(R.id.location_private, 56);
        sViewsWithIds.put(R.id.location_text, 57);
        sViewsWithIds.put(R.id.data_quality_graph, 58);
        sViewsWithIds.put(R.id.casual_grade_icon, 59);
        sViewsWithIds.put(R.id.needs_id_icon, 60);
        sViewsWithIds.put(R.id.research_grade_icon, 61);
        sViewsWithIds.put(R.id.needs_id_line, 62);
        sViewsWithIds.put(R.id.research_grade_line, 63);
        sViewsWithIds.put(R.id.casual_grade_text, 64);
        sViewsWithIds.put(R.id.needs_id_text, 65);
        sViewsWithIds.put(R.id.research_grade_text, 66);
        sViewsWithIds.put(R.id.data_quality_reason, 67);
        sViewsWithIds.put(R.id.tip_icon, 68);
        sViewsWithIds.put(R.id.tip_text, 69);
        sViewsWithIds.put(R.id.annotations_section, 70);
        sViewsWithIds.put(R.id.annotations_title, 71);
        sViewsWithIds.put(R.id.loading_annotations, 72);
        sViewsWithIds.put(R.id.annotations_list, 73);
        sViewsWithIds.put(R.id.included_in_projects_container, 74);
        sViewsWithIds.put(R.id.projects_icon, 75);
        sViewsWithIds.put(R.id.included_in_projects, 76);
        sViewsWithIds.put(R.id.metadata_section, 77);
        sViewsWithIds.put(R.id.metadata_id_row, 78);
        sViewsWithIds.put(R.id.observation_id, 79);
        sViewsWithIds.put(R.id.metadata_uuid_row, 80);
        sViewsWithIds.put(R.id.observation_uuid, 81);
        sViewsWithIds.put(R.id.metadata_url_row, 82);
        sViewsWithIds.put(R.id.observation_url, 83);
        sViewsWithIds.put(R.id.add_comment_background, 84);
        sViewsWithIds.put(R.id.add_comment_container, 85);
        sViewsWithIds.put(R.id.add_comment_done, 86);
        sViewsWithIds.put(R.id.add_comment_text, 87);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ObservationViewerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 88, sIncludes, sViewsWithIds));
    }
    private ObservationViewerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.Button) bindings[43]
            , (android.widget.LinearLayout) bindings[41]
            , (android.widget.Button) bindings[42]
            , (android.widget.RelativeLayout) bindings[35]
            , (com.google.android.material.button.MaterialButton) bindings[46]
            , (android.view.View) bindings[84]
            , (android.widget.RelativeLayout) bindings[85]
            , (android.widget.RelativeLayout) bindings[86]
            , (android.widget.EditText) bindings[87]
            , (android.widget.RelativeLayout) bindings[34]
            , (com.google.android.material.button.MaterialButton) bindings[47]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.view.View) bindings[4]
            , (android.widget.ListView) bindings[73]
            , (android.widget.RelativeLayout) bindings[70]
            , (android.widget.TextView) bindings[71]
            , (android.widget.ImageView) bindings[59]
            , (android.widget.TextView) bindings[64]
            , (android.widget.ListView) bindings[37]
            , (android.view.View) bindings[36]
            , (android.widget.RelativeLayout) bindings[58]
            , (android.widget.RelativeLayout) bindings[67]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[29]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.Button) bindings[28]
            , (android.widget.ListView) bindings[30]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[17]
            , (android.widget.RelativeLayout) bindings[15]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[76]
            , (android.widget.RelativeLayout) bindings[74]
            , (android.widget.LinearLayout) bindings[48]
            , (android.widget.ProgressBar) bindings[38]
            , (android.widget.ProgressBar) bindings[72]
            , (android.widget.ProgressBar) bindings[31]
            , (android.widget.ProgressBar) bindings[54]
            , (android.widget.ProgressBar) bindings[13]
            , (android.widget.RelativeLayout) bindings[55]
            , (android.widget.RelativeLayout) bindings[53]
            , (android.widget.ImageView) bindings[56]
            , (android.widget.TextView) bindings[57]
            , (android.widget.TextView) bindings[40]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TableRow) bindings[78]
            , (android.widget.TableLayout) bindings[77]
            , (android.widget.TableRow) bindings[82]
            , (android.widget.TableRow) bindings[80]
            , (android.widget.ImageView) bindings[60]
            , (android.view.View) bindings[62]
            , (android.widget.TextView) bindings[65]
            , (android.widget.TextView) bindings[45]
            , (android.widget.TextView) bindings[32]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.TextView) bindings[50]
            , (android.widget.LinearLayout) bindings[49]
            , (android.widget.TextView) bindings[79]
            , (android.widget.TextView) bindings[83]
            , (android.widget.TextView) bindings[81]
            , (android.widget.TextView) bindings[7]
            , (androidx.viewpager.widget.ViewPager) bindings[10]
            , (android.widget.RelativeLayout) bindings[9]
            , (com.viewpagerindicator.CirclePageIndicator) bindings[11]
            , (android.widget.ImageView) bindings[75]
            , (android.widget.RelativeLayout) bindings[33]
            , (android.widget.ImageView) bindings[61]
            , (android.view.View) bindings[63]
            , (android.widget.TextView) bindings[66]
            , (android.widget.ScrollView) bindings[5]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.TextView) bindings[39]
            , (android.widget.TextView) bindings[25]
            , (android.widget.FrameLayout) bindings[23]
            , (android.widget.TabHost) bindings[21]
            , (android.widget.TabWidget) bindings[22]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.ImageView) bindings[68]
            , (android.widget.TextView) bindings[69]
            , (android.widget.ImageView) bindings[52]
            , (android.widget.RelativeLayout) bindings[51]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[1]
            );
        this.annotationsContent.setTag(null);
        this.idIconBig.setTag(null);
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

            org.inaturalist.android.BindingAdapterUtils.increaseTouch(this.idIconBig, 80);
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