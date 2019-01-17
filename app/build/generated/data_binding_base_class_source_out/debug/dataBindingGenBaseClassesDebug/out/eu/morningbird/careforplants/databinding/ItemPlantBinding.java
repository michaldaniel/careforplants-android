package eu.morningbird.careforplants.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import eu.morningbird.careforplants.viewmodel.ItemPlantVM;

public abstract class ItemPlantBinding extends ViewDataBinding {
  @NonNull
  public final ImageView calendarIconImageView;

  @NonNull
  public final TextView deadlineTextView;

  @NonNull
  public final CardView itemPlant;

  @NonNull
  public final ImageView locationIconImageView;

  @NonNull
  public final TextView locationTextView;

  @NonNull
  public final TextView nameTextView;

  @NonNull
  public final TextView periodTextView;

  @NonNull
  public final ImageView plantImageView;

  @NonNull
  public final ImageView waterDropletIconImageView;

  @Bindable
  protected ItemPlantVM mViewModel;

  protected ItemPlantBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView calendarIconImageView, TextView deadlineTextView,
      CardView itemPlant, ImageView locationIconImageView, TextView locationTextView,
      TextView nameTextView, TextView periodTextView, ImageView plantImageView,
      ImageView waterDropletIconImageView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.calendarIconImageView = calendarIconImageView;
    this.deadlineTextView = deadlineTextView;
    this.itemPlant = itemPlant;
    this.locationIconImageView = locationIconImageView;
    this.locationTextView = locationTextView;
    this.nameTextView = nameTextView;
    this.periodTextView = periodTextView;
    this.plantImageView = plantImageView;
    this.waterDropletIconImageView = waterDropletIconImageView;
  }

  public abstract void setViewModel(@Nullable ItemPlantVM ViewModel);

  @Nullable
  public ItemPlantVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemPlantBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemPlantBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemPlantBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.item_plant, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPlantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemPlantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemPlantBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.item_plant, null, false, component);
  }

  public static ItemPlantBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemPlantBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemPlantBinding)bind(component, view, eu.morningbird.careforplants.R.layout.item_plant);
  }
}
