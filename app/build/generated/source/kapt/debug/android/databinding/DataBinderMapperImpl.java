package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new eu.morningbird.careforplants.DataBinderMapperImpl());
  }
}
