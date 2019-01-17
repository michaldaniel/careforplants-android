package eu.morningbird.careforplants.databinding;
import eu.morningbird.careforplants.R;
import eu.morningbird.careforplants.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPlantsListBindingImpl extends ActivityPlantsListBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mainActivityToolbar, 2);
        sViewsWithIds.put(R.id.listPlantsRecyclerView, 3);
    }
    // views
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnAddPlantFabClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityPlantsListBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityPlantsListBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.design.widget.FloatingActionButton) bindings[1]
            , (android.support.v7.widget.RecyclerView) bindings[3]
            , (android.support.v7.widget.Toolbar) bindings[2]
            );
        this.addPlantFab.setTag(null);
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
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
            setViewModel((eu.morningbird.careforplants.viewmodel.PlantsListActivityVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable eu.morningbird.careforplants.viewmodel.PlantsListActivityVM ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.ViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((eu.morningbird.careforplants.viewmodel.PlantsListActivityVM) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(eu.morningbird.careforplants.viewmodel.PlantsListActivityVM ViewModel, int fieldId) {
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
        eu.morningbird.careforplants.viewmodel.PlantsListActivityVM viewModel = mViewModel;
        android.view.View.OnClickListener viewModelOnAddPlantFabClickedAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read ViewModel::onAddPlantFabClicked
                    viewModelOnAddPlantFabClickedAndroidViewViewOnClickListener = (((mViewModelOnAddPlantFabClickedAndroidViewViewOnClickListener == null) ? (mViewModelOnAddPlantFabClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnAddPlantFabClickedAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.addPlantFab.setOnClickListener(viewModelOnAddPlantFabClickedAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private eu.morningbird.careforplants.viewmodel.PlantsListActivityVM value;
        public OnClickListenerImpl setValue(eu.morningbird.careforplants.viewmodel.PlantsListActivityVM value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAddPlantFabClicked(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}