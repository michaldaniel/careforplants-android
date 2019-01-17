package eu.morningbird.careforplants.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u00101\u001a\u0002022\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u00103\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u00104\u001a\u0004\u0018\u0001052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u00106\u001a\u0002022\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020;R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R&\u0010 \u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\fR&\u0010#\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\n\"\u0004\b%\u0010\fR\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010(\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R&\u0010+\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0011\"\u0004\b-\u0010\u0013R&\u0010.\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\n\"\u0004\b0\u0010\f\u00a8\u0006<"}, d2 = {"Leu/morningbird/careforplants/viewmodel/ItemPlantVM;", "Landroid/databinding/BaseObservable;", "()V", "TAG", "", "TAG$annotations", "value", "", "cardColorId", "getCardColorId", "()I", "setCardColorId", "(I)V", "context", "Landroid/content/Context;", "deadline", "getDeadline", "()Ljava/lang/String;", "setDeadline", "(Ljava/lang/String;)V", "imageDescription", "getImageDescription", "setImageDescription", "<set-?>", "", "isDataLoaded", "()Z", "setDataLoaded", "(Z)V", "location", "getLocation", "setLocation", "locationIconImageViewVisibility", "getLocationIconImageViewVisibility", "setLocationIconImageViewVisibility", "locationTextViewVisibility", "getLocationTextViewVisibility", "setLocationTextViewVisibility", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "name", "getName", "setName", "period", "getPeriod", "setPeriod", "waterDropletIconId", "getWaterDropletIconId", "setWaterDropletIconId", "attach", "", "getDeadlineTextColorId", "getImage", "Landroid/graphics/drawable/Drawable;", "loadData", "plant", "Leu/morningbird/careforplants/model/Plant;", "onItemClick", "view", "Landroid/view/View;", "app_debug"})
public final class ItemPlantVM extends android.databinding.BaseObservable {
    private final java.lang.String TAG = "ItemPlantVM";
    @org.jetbrains.annotations.NotNull()
    @android.databinding.Bindable(value = {"imageDescription"})
    private java.lang.String imageDescription;
    @org.jetbrains.annotations.NotNull()
    @android.databinding.Bindable(value = {"name"})
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @android.databinding.Bindable(value = {"location"})
    private java.lang.String location;
    @org.jetbrains.annotations.NotNull()
    @android.databinding.Bindable(value = {"deadline"})
    private java.lang.String deadline;
    @org.jetbrains.annotations.NotNull()
    @android.databinding.Bindable(value = {"period"})
    private java.lang.String period;
    @android.databinding.Bindable(value = {"waterDropletIconId"})
    private int waterDropletIconId;
    @android.databinding.Bindable(value = {"cardColorId"})
    private int cardColorId;
    @android.databinding.Bindable(value = {"locationTextViewVisibility"})
    private int locationTextViewVisibility;
    @android.databinding.Bindable(value = {"locationIconImageViewVisibility"})
    private int locationIconImageViewVisibility;
    private android.content.Context context;
    private final java.util.concurrent.locks.ReentrantLock lock = null;
    private volatile boolean isDataLoaded;
    
    @kotlin.Suppress(names = {"PrivatePropertyName", "unused"})
    private static void TAG$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageDescription() {
        return null;
    }
    
    private final void setImageDescription(java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    private final void setName(java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    private final void setLocation(java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeadline() {
        return null;
    }
    
    private final void setDeadline(java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPeriod() {
        return null;
    }
    
    private final void setPeriod(java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.drawable.Drawable getImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final int getWaterDropletIconId() {
        return 0;
    }
    
    private final void setWaterDropletIconId(int value) {
    }
    
    public final int getCardColorId() {
        return 0;
    }
    
    private final void setCardColorId(int value) {
    }
    
    public final int getDeadlineTextColorId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public final int getLocationTextViewVisibility() {
        return 0;
    }
    
    private final void setLocationTextViewVisibility(int value) {
    }
    
    public final int getLocationIconImageViewVisibility() {
        return 0;
    }
    
    private final void setLocationIconImageViewVisibility(int value) {
    }
    
    public final boolean isDataLoaded() {
        return false;
    }
    
    private final void setDataLoaded(boolean p0) {
    }
    
    public final void loadData(@org.jetbrains.annotations.NotNull()
    eu.morningbird.careforplants.model.Plant plant) {
    }
    
    public final void attach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void onItemClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public ItemPlantVM() {
        super();
    }
}