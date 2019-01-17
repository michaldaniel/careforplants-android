package eu.morningbird.careforplants.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.shawnlin.numberpicker.NumberPicker;
import de.hdodenhof.circleimageview.CircleImageView;
import eu.morningbird.careforplants.viewmodel.AddEditPlantActivityVM;

public abstract class ActivityAddEditPlantBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar addEditActivityToolbar;

  @NonNull
  public final FloatingActionButton addPhotoFab;

  @NonNull
  public final ImageView backgroundImageView;

  @NonNull
  public final FloatingActionButton changeIconFab;

  @NonNull
  public final CircleImageView circleImageView;

  @NonNull
  public final TextView lastWateringLabelTextView;

  @NonNull
  public final NumberPicker lastWateringNumberPicker;

  @NonNull
  public final EditText locationEditText;

  @NonNull
  public final TextView locationLabelTextView;

  @NonNull
  public final EditText nameEditText;

  @NonNull
  public final TextView nameLabelTextView;

  @NonNull
  public final EditText notesEditText;

  @NonNull
  public final TextView notesLabelTextView;

  @NonNull
  public final CheckBox periodEveryDayCheckBox;

  @NonNull
  public final TextView periodEveryDayLabelTextView;

  @NonNull
  public final RelativeLayout periodEveryDayRelativeLayout;

  @NonNull
  public final CheckBox periodEveryFewDaysCheckBox;

  @NonNull
  public final TextView periodEveryFewDaysLabelTextView;

  @NonNull
  public final RelativeLayout periodEveryFewDaysRelativeLayout;

  @NonNull
  public final CheckBox periodSelectedDaysCheckBox;

  @NonNull
  public final TextView periodSelectedDaysLabelTextView;

  @NonNull
  public final RelativeLayout periodSelectedDaysRelativeLayout;

  @NonNull
  public final FloatingActionButton removePhotoFab;

  @NonNull
  public final View separatorView1;

  @NonNull
  public final View separatorView2;

  @NonNull
  public final View separatorView3;

  @NonNull
  public final View separatorView4;

  @Bindable
  protected AddEditPlantActivityVM mViewModel;

  protected ActivityAddEditPlantBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Toolbar addEditActivityToolbar, FloatingActionButton addPhotoFab,
      ImageView backgroundImageView, FloatingActionButton changeIconFab,
      CircleImageView circleImageView, TextView lastWateringLabelTextView,
      NumberPicker lastWateringNumberPicker, EditText locationEditText,
      TextView locationLabelTextView, EditText nameEditText, TextView nameLabelTextView,
      EditText notesEditText, TextView notesLabelTextView, CheckBox periodEveryDayCheckBox,
      TextView periodEveryDayLabelTextView, RelativeLayout periodEveryDayRelativeLayout,
      CheckBox periodEveryFewDaysCheckBox, TextView periodEveryFewDaysLabelTextView,
      RelativeLayout periodEveryFewDaysRelativeLayout, CheckBox periodSelectedDaysCheckBox,
      TextView periodSelectedDaysLabelTextView, RelativeLayout periodSelectedDaysRelativeLayout,
      FloatingActionButton removePhotoFab, View separatorView1, View separatorView2,
      View separatorView3, View separatorView4) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addEditActivityToolbar = addEditActivityToolbar;
    this.addPhotoFab = addPhotoFab;
    this.backgroundImageView = backgroundImageView;
    this.changeIconFab = changeIconFab;
    this.circleImageView = circleImageView;
    this.lastWateringLabelTextView = lastWateringLabelTextView;
    this.lastWateringNumberPicker = lastWateringNumberPicker;
    this.locationEditText = locationEditText;
    this.locationLabelTextView = locationLabelTextView;
    this.nameEditText = nameEditText;
    this.nameLabelTextView = nameLabelTextView;
    this.notesEditText = notesEditText;
    this.notesLabelTextView = notesLabelTextView;
    this.periodEveryDayCheckBox = periodEveryDayCheckBox;
    this.periodEveryDayLabelTextView = periodEveryDayLabelTextView;
    this.periodEveryDayRelativeLayout = periodEveryDayRelativeLayout;
    this.periodEveryFewDaysCheckBox = periodEveryFewDaysCheckBox;
    this.periodEveryFewDaysLabelTextView = periodEveryFewDaysLabelTextView;
    this.periodEveryFewDaysRelativeLayout = periodEveryFewDaysRelativeLayout;
    this.periodSelectedDaysCheckBox = periodSelectedDaysCheckBox;
    this.periodSelectedDaysLabelTextView = periodSelectedDaysLabelTextView;
    this.periodSelectedDaysRelativeLayout = periodSelectedDaysRelativeLayout;
    this.removePhotoFab = removePhotoFab;
    this.separatorView1 = separatorView1;
    this.separatorView2 = separatorView2;
    this.separatorView3 = separatorView3;
    this.separatorView4 = separatorView4;
  }

  public abstract void setViewModel(@Nullable AddEditPlantActivityVM ViewModel);

  @Nullable
  public AddEditPlantActivityVM getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityAddEditPlantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddEditPlantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddEditPlantBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_add_edit_plant, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAddEditPlantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityAddEditPlantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityAddEditPlantBinding>inflate(inflater, eu.morningbird.careforplants.R.layout.activity_add_edit_plant, null, false, component);
  }

  public static ActivityAddEditPlantBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityAddEditPlantBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityAddEditPlantBinding)bind(component, view, eu.morningbird.careforplants.R.layout.activity_add_edit_plant);
  }
}
