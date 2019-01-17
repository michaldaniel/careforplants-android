package eu.morningbird.careforplants.databinding;
import eu.morningbird.careforplants.R;
import eu.morningbird.careforplants.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddEditPlantBindingImpl extends ActivityAddEditPlantBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.addEditActivityToolbar, 1);
        sViewsWithIds.put(R.id.backgroundImageView, 2);
        sViewsWithIds.put(R.id.circleImageView, 3);
        sViewsWithIds.put(R.id.changeIconFab, 4);
        sViewsWithIds.put(R.id.addPhotoFab, 5);
        sViewsWithIds.put(R.id.removePhotoFab, 6);
        sViewsWithIds.put(R.id.nameLabelTextView, 7);
        sViewsWithIds.put(R.id.nameEditText, 8);
        sViewsWithIds.put(R.id.locationLabelTextView, 9);
        sViewsWithIds.put(R.id.locationEditText, 10);
        sViewsWithIds.put(R.id.notesLabelTextView, 11);
        sViewsWithIds.put(R.id.notesEditText, 12);
        sViewsWithIds.put(R.id.lastWateringLabelTextView, 13);
        sViewsWithIds.put(R.id.lastWateringNumberPicker, 14);
        sViewsWithIds.put(R.id.separatorView1, 15);
        sViewsWithIds.put(R.id.periodEveryDayLabelTextView, 16);
        sViewsWithIds.put(R.id.periodEveryDayCheckBox, 17);
        sViewsWithIds.put(R.id.periodEveryDayRelativeLayout, 18);
        sViewsWithIds.put(R.id.separatorView2, 19);
        sViewsWithIds.put(R.id.periodEveryFewDaysLabelTextView, 20);
        sViewsWithIds.put(R.id.periodEveryFewDaysCheckBox, 21);
        sViewsWithIds.put(R.id.periodEveryFewDaysRelativeLayout, 22);
        sViewsWithIds.put(R.id.separatorView3, 23);
        sViewsWithIds.put(R.id.periodSelectedDaysLabelTextView, 24);
        sViewsWithIds.put(R.id.periodSelectedDaysCheckBox, 25);
        sViewsWithIds.put(R.id.periodSelectedDaysRelativeLayout, 26);
        sViewsWithIds.put(R.id.separatorView4, 27);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAddEditPlantBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private ActivityAddEditPlantBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.v7.widget.Toolbar) bindings[1]
            , (android.support.design.widget.FloatingActionButton) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.support.design.widget.FloatingActionButton) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (android.widget.TextView) bindings[13]
            , (com.shawnlin.numberpicker.NumberPicker) bindings[14]
            , (android.widget.EditText) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.EditText) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.EditText) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.CheckBox) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.RelativeLayout) bindings[18]
            , (android.widget.CheckBox) bindings[21]
            , (android.widget.TextView) bindings[20]
            , (android.widget.RelativeLayout) bindings[22]
            , (android.widget.CheckBox) bindings[25]
            , (android.widget.TextView) bindings[24]
            , (android.widget.RelativeLayout) bindings[26]
            , (android.support.design.widget.FloatingActionButton) bindings[6]
            , (android.view.View) bindings[15]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[23]
            , (android.view.View) bindings[27]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.ViewModel == variableId) {
            setViewModel((eu.morningbird.careforplants.viewmodel.AddEditPlantActivityVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable eu.morningbird.careforplants.viewmodel.AddEditPlantActivityVM ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((eu.morningbird.careforplants.viewmodel.AddEditPlantActivityVM) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(eu.morningbird.careforplants.viewmodel.AddEditPlantActivityVM ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}