package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new org.inaturalist.android.DataBinderMapperImpl());
  }
}
