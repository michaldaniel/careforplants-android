package eu.morningbird.careforplants.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import eu.morningbird.careforplants.viewmodel.PlantsListActivityVM;

public abstract class ActivityPlantsListBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton addPlantFab;

  @NonNull
  public final RecyclerView listPlantsRecyclerView;

  @NonNull
  public final Toolbar mainActivityToolbar;

  @Bindable
  protected PlantsListActivityVM mViewModel;

  protected ActivityPlantsListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FloatingActionButton addPlantFab, RecyclerView listPlantsRecyclerView,
      Toolbar mainActivityToolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addPlantFab = addPlantFab;
    this.listPlantsRecyclerView = listPlantsRecyclerView;
    this.mainActivityToolbar = mainActivityToolbar;
  }

  public abstract void setViewModel(@Nullable PlantsListActivityVM ViewModel);

  @Nullable
  public PlantsListActivityVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityPlantsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityPlantsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityPlantsListBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_plants_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPlantsListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityPlantsListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityPlantsListBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_plants_list, null, false, component);
  }

  public static ActivityPlantsListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityPlantsListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityPlantsListBinding)bind(component, view, eu.morningbird.careforplants.R.layout.activity_plants_list);
  }
}
