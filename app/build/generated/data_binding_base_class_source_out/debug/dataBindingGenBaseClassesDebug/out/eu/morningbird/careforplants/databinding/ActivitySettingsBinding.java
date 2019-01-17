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
import eu.morningbird.careforplants.viewmodel.SettingsActivityVM;

public abstract class ActivitySettingsBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar settingsActivityToolbar;

  @Bindable
  protected SettingsActivityVM mViewModel;

  protected ActivitySettingsBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Toolbar settingsActivityToolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.settingsActivityToolbar = settingsActivityToolbar;
  }

  public abstract void setViewModel(@Nullable SettingsActivityVM ViewModel);

  @Nullable
  public SettingsActivityVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySettingsBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_settings, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySettingsBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_settings, null, false, component);
  }

  public static ActivitySettingsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivitySettingsBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivitySettingsBinding)bind(component, view, eu.morningbird.careforplants.R.layout.activity_settings);
  }
}
