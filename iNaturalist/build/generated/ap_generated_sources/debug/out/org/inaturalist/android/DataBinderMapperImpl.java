package org.inaturalist.android;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.inaturalist.android.databinding.AnnotationBindingImpl;
import org.inaturalist.android.databinding.CommentIdItemObsViewerBindingImpl;
import org.inaturalist.android.databinding.ExploreFiltersBindingImpl;
import org.inaturalist.android.databinding.ExploreSearchBindingImpl;
import org.inaturalist.android.databinding.ObservationConfirmationBindingImpl;
import org.inaturalist.android.databinding.ObservationViewerBindingImpl;
import org.inaturalist.android.databinding.TaxonPageBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ANNOTATION = 1;

  private static final int LAYOUT_COMMENTIDITEMOBSVIEWER = 2;

  private static final int LAYOUT_EXPLOREFILTERS = 3;

  private static final int LAYOUT_EXPLORESEARCH = 4;

  private static final int LAYOUT_OBSERVATIONCONFIRMATION = 5;

  private static final int LAYOUT_OBSERVATIONVIEWER = 6;

  private static final int LAYOUT_TAXONPAGE = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.inaturalist.android.R.layout.annotation, LAYOUT_ANNOTATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.inaturalist.android.R.layout.comment_id_item_obs_viewer, LAYOUT_COMMENTIDITEMOBSVIEWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.inaturalist.android.R.layout.explore_filters, LAYOUT_EXPLOREFILTERS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.inaturalist.android.R.layout.explore_search, LAYOUT_EXPLORESEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.inaturalist.android.R.layout.observation_confirmation, LAYOUT_OBSERVATIONCONFIRMATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.inaturalist.android.R.layout.observation_viewer, LAYOUT_OBSERVATIONVIEWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.inaturalist.android.R.layout.taxon_page, LAYOUT_TAXONPAGE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ANNOTATION: {
          if ("layout/annotation_0".equals(tag)) {
            return new AnnotationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for annotation is invalid. Received: " + tag);
        }
        case  LAYOUT_COMMENTIDITEMOBSVIEWER: {
          if ("layout/comment_id_item_obs_viewer_0".equals(tag)) {
            return new CommentIdItemObsViewerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for comment_id_item_obs_viewer is invalid. Received: " + tag);
        }
        case  LAYOUT_EXPLOREFILTERS: {
          if ("layout/explore_filters_0".equals(tag)) {
            return new ExploreFiltersBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for explore_filters is invalid. Received: " + tag);
        }
        case  LAYOUT_EXPLORESEARCH: {
          if ("layout/explore_search_0".equals(tag)) {
            return new ExploreSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for explore_search is invalid. Received: " + tag);
        }
        case  LAYOUT_OBSERVATIONCONFIRMATION: {
          if ("layout/observation_confirmation_0".equals(tag)) {
            return new ObservationConfirmationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for observation_confirmation is invalid. Received: " + tag);
        }
        case  LAYOUT_OBSERVATIONVIEWER: {
          if ("layout/observation_viewer_0".equals(tag)) {
            return new ObservationViewerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for observation_viewer is invalid. Received: " + tag);
        }
        case  LAYOUT_TAXONPAGE: {
          if ("layout/taxon_page_0".equals(tag)) {
            return new TaxonPageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for taxon_page is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/annotation_0", org.inaturalist.android.R.layout.annotation);
      sKeys.put("layout/comment_id_item_obs_viewer_0", org.inaturalist.android.R.layout.comment_id_item_obs_viewer);
      sKeys.put("layout/explore_filters_0", org.inaturalist.android.R.layout.explore_filters);
      sKeys.put("layout/explore_search_0", org.inaturalist.android.R.layout.explore_search);
      sKeys.put("layout/observation_confirmation_0", org.inaturalist.android.R.layout.observation_confirmation);
      sKeys.put("layout/observation_viewer_0", org.inaturalist.android.R.layout.observation_viewer);
      sKeys.put("layout/taxon_page_0", org.inaturalist.android.R.layout.taxon_page);
    }
  }
}
