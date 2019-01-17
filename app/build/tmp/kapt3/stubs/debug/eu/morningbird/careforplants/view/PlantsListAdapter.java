package eu.morningbird.careforplants.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R4\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Leu/morningbird/careforplants/view/PlantsListAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Leu/morningbird/careforplants/view/PlantsListAdapter$PlantsListAdapterViewHolder;", "()V", "value", "", "Leu/morningbird/careforplants/model/Plant;", "plantsList", "getPlantsList", "()Ljava/util/List;", "setPlantsList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PlantsListAdapterViewHolder", "app_debug"})
public final class PlantsListAdapter extends android.support.v7.widget.RecyclerView.Adapter<eu.morningbird.careforplants.view.PlantsListAdapter.PlantsListAdapterViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<eu.morningbird.careforplants.model.Plant> plantsList;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<eu.morningbird.careforplants.model.Plant> getPlantsList() {
        return null;
    }
    
    public final void setPlantsList(@org.jetbrains.annotations.Nullable()
    java.util.List<eu.morningbird.careforplants.model.Plant> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public eu.morningbird.careforplants.view.PlantsListAdapter.PlantsListAdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    eu.morningbird.careforplants.view.PlantsListAdapter.PlantsListAdapterViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public PlantsListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\b\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\r"}, d2 = {"Leu/morningbird/careforplants/view/PlantsListAdapter$PlantsListAdapterViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "mItemPlantBinding", "Leu/morningbird/careforplants/databinding/ItemPlantBinding;", "(Leu/morningbird/careforplants/databinding/ItemPlantBinding;)V", "getMItemPlantBinding", "()Leu/morningbird/careforplants/databinding/ItemPlantBinding;", "setMItemPlantBinding", "bindPlants", "", "plant", "Leu/morningbird/careforplants/model/Plant;", "bindPlants$app_debug", "app_debug"})
    public static final class PlantsListAdapterViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private eu.morningbird.careforplants.databinding.ItemPlantBinding mItemPlantBinding;
        
        public final void bindPlants$app_debug(@org.jetbrains.annotations.NotNull()
        eu.morningbird.careforplants.model.Plant plant) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final eu.morningbird.careforplants.databinding.ItemPlantBinding getMItemPlantBinding() {
            return null;
        }
        
        public final void setMItemPlantBinding(@org.jetbrains.annotations.NotNull()
        eu.morningbird.careforplants.databinding.ItemPlantBinding p0) {
        }
        
        public PlantsListAdapterViewHolder(@org.jetbrains.annotations.NotNull()
        eu.morningbird.careforplants.databinding.ItemPlantBinding mItemPlantBinding) {
            super(null);
        }
    }
}