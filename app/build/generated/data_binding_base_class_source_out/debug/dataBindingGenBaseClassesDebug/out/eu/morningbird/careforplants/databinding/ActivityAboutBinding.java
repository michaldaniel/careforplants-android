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
import eu.morningbird.careforplants.viewmodel.AboutActivityVM;

public abstract class ActivityAboutBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar aboutActivityToolbar;

  @Bindable
  protected AboutActivityVM mViewModel;

  protected ActivityAboutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Toolbar aboutActivityToolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.aboutActivityToolbar = aboutActivityToolbar;
  }

  public abstract void setViewModel(@Nullable AboutActivityVM ViewModel);

  @Nullable
  public AboutActivityVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAboutBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_about, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAboutBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_about, null, false, component);
  }

  public static ActivityAboutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityAboutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityAboutBinding)bind(component, view, eu.morningbird.careforplants.R.layout.activity_about);
  }
}
