package eu.morningbird.careforplants.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u001a\u001a\u00020\u00192\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u0019J\u0006\u0010!\u001a\u00020\u0019R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000RD\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Leu/morningbird/careforplants/viewmodel/PlantsListActivityVM;", "Landroid/databinding/BaseObservable;", "()V", "TAG", "", "TAG$annotations", "context", "Landroid/content/Context;", "<set-?>", "", "isDataLoaded", "()Z", "setDataLoaded", "(Z)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/ArrayList;", "Leu/morningbird/careforplants/model/Plant;", "Lkotlin/collections/ArrayList;", "plants", "getPlants", "()Ljava/util/ArrayList;", "setPlants", "(Ljava/util/ArrayList;)V", "attach", "", "changePlantsDataSet", "", "loadData", "onAddPlantFabClicked", "view", "Landroid/view/View;", "toolbarActionAbout", "toolbarActionSettings", "app_debug"})
public final class PlantsListActivityVM extends android.databinding.BaseObservable {
    private final java.lang.String TAG = "PlantsListActivityVM";
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<eu.morningbird.careforplants.model.Plant> plants;
    private android.content.Context context;
    private final java.util.concurrent.locks.ReentrantLock lock = null;
    private volatile boolean isDataLoaded;
    
    @kotlin.Suppress(names = {"PrivatePropertyName", "unused"})
    private static void TAG$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<eu.morningbird.careforplants.model.Plant> getPlants() {
        return null;
    }
    
    private final void setPlants(java.util.ArrayList<eu.morningbird.careforplants.model.Plant> p0) {
    }
    
    public final boolean isDataLoaded() {
        return false;
    }
    
    private final void setDataLoaded(boolean p0) {
    }
    
    public final void loadData() {
    }
    
    public final void attach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void onAddPlantFabClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void toolbarActionSettings() {
    }
    
    public final void toolbarActionAbout() {
    }
    
    private final void changePlantsDataSet(java.util.List<eu.morningbird.careforplants.model.Plant> plants) {
    }
    
    public PlantsListActivityVM() {
        super();
    }
}