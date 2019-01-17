package eu.morningbird.careforplants;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import eu.morningbird.careforplants.databinding.ActivityAboutBindingImpl;
import eu.morningbird.careforplants.databinding.ActivityAddEditPlantBindingImpl;
import eu.morningbird.careforplants.databinding.ActivityPlantDetailsBindingImpl;
import eu.morningbird.careforplants.databinding.ActivityPlantsListBindingImpl;
import eu.morningbird.careforplants.databinding.ActivitySettingsBindingImpl;
import eu.morningbird.careforplants.databinding.ItemPlantBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYABOUT = 1;

  private static final int LAYOUT_ACTIVITYADDEDITPLANT = 2;

  private static final int LAYOUT_ACTIVITYPLANTDETAILS = 3;

  private static final int LAYOUT_ACTIVITYPLANTSLIST = 4;

  private static final int LAYOUT_ACTIVITYSETTINGS = 5;

  private static final int LAYOUT_ITEMPLANT = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.morningbird.careforplants.R.layout.activity_about, LAYOUT_ACTIVITYABOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.morningbird.careforplants.R.layout.activity_add_edit_plant, LAYOUT_ACTIVITYADDEDITPLANT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.morningbird.careforplants.R.layout.activity_plant_details, LAYOUT_ACTIVITYPLANTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.morningbird.careforplants.R.layout.activity_plants_list, LAYOUT_ACTIVITYPLANTSLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.morningbird.careforplants.R.layout.activity_settings, LAYOUT_ACTIVITYSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(eu.morningbird.careforplants.R.layout.item_plant, LAYOUT_ITEMPLANT);
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
        case  LAYOUT_ACTIVITYABOUT: {
          if ("layout/activity_about_0".equals(tag)) {
            return new ActivityAboutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_about is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYADDEDITPLANT: {
          if ("layout/activity_add_edit_plant_0".equals(tag)) {
            return new ActivityAddEditPlantBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add_edit_plant is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPLANTDETAILS: {
          if ("layout/activity_plant_details_0".equals(tag)) {
            return new ActivityPlantDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_plant_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPLANTSLIST: {
          if ("layout/activity_plants_list_0".equals(tag)) {
            return new ActivityPlantsListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_plants_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSETTINGS: {
          if ("layout/activity_settings_0".equals(tag)) {
            return new ActivitySettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPLANT: {
          if ("layout/item_plant_0".equals(tag)) {
            return new ItemPlantBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_plant is invalid. Received: " + tag);
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
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(13);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "locationTextViewVisibility");
      sKeys.put(2, "period");
      sKeys.put(3, "imageDescription");
      sKeys.put(4, "name");
      sKeys.put(5, "viewModel");
      sKeys.put(6, "waterDropletIconId");
      sKeys.put(7, "location");
      sKeys.put(8, "locationIconImageViewVisibility");
      sKeys.put(9, "cardColorId");
      sKeys.put(10, "ViewModel");
      sKeys.put(11, "deadline");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_about_0", eu.morningbird.careforplants.R.layout.activity_about);
      sKeys.put("layout/activity_add_edit_plant_0", eu.morningbird.careforplants.R.layout.activity_add_edit_plant);
      sKeys.put("layout/activity_plant_details_0", eu.morningbird.careforplants.R.layout.activity_plant_details);
      sKeys.put("layout/activity_plants_list_0", eu.morningbird.careforplants.R.layout.activity_plants_list);
      sKeys.put("layout/activity_settings_0", eu.morningbird.careforplants.R.layout.activity_settings);
      sKeys.put("layout/item_plant_0", eu.morningbird.careforplants.R.layout.item_plant);
    }
  }
}
