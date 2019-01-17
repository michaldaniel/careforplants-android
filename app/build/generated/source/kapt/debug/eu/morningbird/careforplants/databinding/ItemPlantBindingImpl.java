package eu.morningbird.careforplants.databinding;
import eu.morningbird.careforplants.R;
import eu.morningbird.careforplants.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPlantBindingImpl extends ItemPlantBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.calendarIconImageView, 8);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnItemClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemPlantBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemPlantBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.support.v7.widget.CardView) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            );
        this.deadlineTextView.setTag(null);
        this.itemPlant.setTag(null);
        this.locationIconImageView.setTag(null);
        this.locationTextView.setTag(null);
        this.nameTextView.setTag(null);
        this.periodTextView.setTag(null);
        this.plantImageView.setTag(null);
        this.waterDropletIconImageView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setViewModel((eu.morningbird.careforplants.viewmodel.ItemPlantVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable eu.morningbird.careforplants.viewmodel.ItemPlantVM ViewModel) {
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
                return onChangeViewModel((eu.morningbird.careforplants.viewmodel.ItemPlantVM) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(eu.morningbird.careforplants.viewmodel.ItemPlantVM ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.cardColorId) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.locationIconImageViewVisibility) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.waterDropletIconId) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.location) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.locationTextViewVisibility) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.period) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.deadline) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        eu.morningbird.careforplants.viewmodel.ItemPlantVM viewModel = mViewModel;
        android.view.View.OnClickListener viewModelOnItemClickAndroidViewViewOnClickListener = null;
        int viewModelCardColorId = 0;
        java.lang.String viewModelDeadline = null;
        int viewModelLocationTextViewVisibility = 0;
        int androidDatabindingViewDataBindingSafeUnboxViewModelGetDeadlineTextColorIdContext = 0;
        java.lang.String viewModelLocation = null;
        java.lang.String viewModelPeriod = null;
        android.graphics.drawable.Drawable viewModelGetImageContext = null;
        int viewModelLocationIconImageViewVisibility = 0;
        int contextGetColorAndroidDatabindingViewDataBindingSafeUnboxViewModelGetDeadlineTextColorIdContext = 0;
        int contextGetColorViewModelCardColorId = 0;
        int viewModelWaterDropletIconId = 0;
        java.lang.String viewModelName = null;
        int viewModelGetDeadlineTextColorIdContext = 0;
        android.graphics.drawable.Drawable contextGetDrawableViewModelWaterDropletIconId = null;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x201L) != 0) {

                    if (viewModel != null) {
                        // read ViewModel::onItemClick
                        viewModelOnItemClickAndroidViewViewOnClickListener = (((mViewModelOnItemClickAndroidViewViewOnClickListener == null) ? (mViewModelOnItemClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnItemClickAndroidViewViewOnClickListener).setValue(viewModel));
                        // read ViewModel.getImage(context)
                        viewModelGetImageContext = viewModel.getImage(getRoot().getContext());
                        // read ViewModel.getDeadlineTextColorId(context)
                        viewModelGetDeadlineTextColorIdContext = viewModel.getDeadlineTextColorId(getRoot().getContext());
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(ViewModel.getDeadlineTextColorId(context))
                    androidDatabindingViewDataBindingSafeUnboxViewModelGetDeadlineTextColorIdContext = android.databinding.ViewDataBinding.safeUnbox(viewModelGetDeadlineTextColorIdContext);


                    // read context.getColor(android.databinding.ViewDataBinding.safeUnbox(ViewModel.getDeadlineTextColorId(context)))
                    contextGetColorAndroidDatabindingViewDataBindingSafeUnboxViewModelGetDeadlineTextColorIdContext = getRoot().getContext().getColor(androidDatabindingViewDataBindingSafeUnboxViewModelGetDeadlineTextColorIdContext);
            }
            if ((dirtyFlags & 0x203L) != 0) {

                    if (viewModel != null) {
                        // read ViewModel.cardColorId
                        viewModelCardColorId = viewModel.getCardColorId();
                    }


                    // read context.getColor(ViewModel.cardColorId)
                    contextGetColorViewModelCardColorId = getRoot().getContext().getColor(viewModelCardColorId);
            }
            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewModel != null) {
                        // read ViewModel.deadline
                        viewModelDeadline = viewModel.getDeadline();
                    }
            }
            if ((dirtyFlags & 0x241L) != 0) {

                    if (viewModel != null) {
                        // read ViewModel.locationTextViewVisibility
                        viewModelLocationTextViewVisibility = viewModel.getLocationTextViewVisibility();
                    }
            }
            if ((dirtyFlags & 0x221L) != 0) {

                    if (viewModel != null) {
                        // read ViewModel.location
                        viewModelLocation = viewModel.getLocation();
                    }
            }
            if ((dirtyFlags & 0x281L) != 0) {

                    if (viewModel != null) {
                        // read ViewModel.period
                        viewModelPeriod = viewModel.getPeriod();
                    }
            }
            if ((dirtyFlags & 0x205L) != 0) {

                    if (viewModel != null) {
                        // read ViewModel.locationIconImageViewVisibility
                        viewModelLocationIconImageViewVisibility = viewModel.getLocationIconImageViewVisibility();
                    }
            }
            if ((dirtyFlags & 0x209L) != 0) {

                    if (viewModel != null) {
                        // read ViewModel.waterDropletIconId
                        viewModelWaterDropletIconId = viewModel.getWaterDropletIconId();
                    }


                    // read context.getDrawable(ViewModel.waterDropletIconId)
                    contextGetDrawableViewModelWaterDropletIconId = getRoot().getContext().getDrawable(viewModelWaterDropletIconId);
            }
            if ((dirtyFlags & 0x211L) != 0) {

                    if (viewModel != null) {
                        // read ViewModel.name
                        viewModelName = viewModel.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.deadlineTextView, viewModelDeadline);
        }
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            this.deadlineTextView.setTextColor(contextGetColorAndroidDatabindingViewDataBindingSafeUnboxViewModelGetDeadlineTextColorIdContext);
            this.itemPlant.setOnClickListener(viewModelOnItemClickAndroidViewViewOnClickListener);
            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.plantImageView, viewModelGetImageContext);
        }
        if ((dirtyFlags & 0x203L) != 0) {
            // api target 1

            this.itemPlant.setCardBackgroundColor(contextGetColorViewModelCardColorId);
        }
        if ((dirtyFlags & 0x205L) != 0) {
            // api target 1

            this.locationIconImageView.setVisibility(viewModelLocationIconImageViewVisibility);
        }
        if ((dirtyFlags & 0x221L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.locationTextView, viewModelLocation);
        }
        if ((dirtyFlags & 0x241L) != 0) {
            // api target 1

            this.locationTextView.setVisibility(viewModelLocationTextViewVisibility);
        }
        if ((dirtyFlags & 0x211L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.nameTextView, viewModelName);
        }
        if ((dirtyFlags & 0x281L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.periodTextView, viewModelPeriod);
        }
        if ((dirtyFlags & 0x209L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.waterDropletIconImageView, contextGetDrawableViewModelWaterDropletIconId);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private eu.morningbird.careforplants.viewmodel.ItemPlantVM value;
        public OnClickListenerImpl setValue(eu.morningbird.careforplants.viewmodel.ItemPlantVM value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onItemClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ViewModel
        flag 1 (0x2L): ViewModel.cardColorId
        flag 2 (0x3L): ViewModel.locationIconImageViewVisibility
        flag 3 (0x4L): ViewModel.waterDropletIconId
        flag 4 (0x5L): ViewModel.name
        flag 5 (0x6L): ViewModel.location
        flag 6 (0x7L): ViewModel.locationTextViewVisibility
        flag 7 (0x8L): ViewModel.period
        flag 8 (0x9L): ViewModel.deadline
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}