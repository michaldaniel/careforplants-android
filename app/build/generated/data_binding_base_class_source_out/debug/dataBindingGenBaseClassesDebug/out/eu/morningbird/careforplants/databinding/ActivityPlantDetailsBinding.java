package eu.morningbird.careforplants.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import eu.morningbird.careforplants.viewmodel.PlantDetailsActivityVM;

public abstract class ActivityPlantDetailsBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar plantDetailsActivityToolbar;

  @Bindable
  protected PlantDetailsActivityVM mViewModel;

  protected ActivityPlantDetailsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Toolbar plantDetailsActivityToolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.plantDetailsActivityToolbar = plantDetailsActivityToolbar;
  }

  public abstract void setViewModel(@Nullable PlantDetailsActivityVM ViewModel);

  @Nullable
  public PlantDetailsActivityVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityPlantDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityPlantDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityPlantDetailsBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_plant_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPlantDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityPlantDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityPlantDetailsBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_plant_details, null, false, component);
  }

  public static ActivityPlantDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityPlantDetailsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityPlantDetailsBinding)bind(component, view, eu.morningbird.careforplants.R.layout.activity_plant_details);
  }
}
