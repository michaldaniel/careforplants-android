package eu.morningbird.careforplants.model;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "plant")
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\u0010\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u00107\u001a\u00020\tH\u00c6\u0003J\t\u00108\u001a\u00020\tH\u00c6\u0003J\t\u00109\u001a\u00020\u0012H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\tH\u00c6\u0003J\t\u0010>\u001a\u00020\u000bH\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\tH\u00c6\u0003J\t\u0010A\u001a\u00020\u000bH\u00c6\u0003J\u0088\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\tH\u00d6\u0001J\t\u0010G\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0019\"\u0004\b\'\u0010\u001bR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\u001e\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0015\"\u0004\b5\u0010\u0017\u00a8\u0006H"}, d2 = {"Leu/morningbird/careforplants/model/Plant;", "", "id", "", "name", "", "location", "note", "color", "", "hasPhoto", "", "imagePath", "icon", "isTimePeriodic", "timePeriod", "wateringPeriod", "periodStartDate", "Ljava/util/Date;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZIILjava/util/Date;)V", "getColor", "()I", "setColor", "(I)V", "getHasPhoto", "()Z", "setHasPhoto", "(Z)V", "getIcon", "setIcon", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "setTimePeriodic", "getLocation", "setLocation", "getName", "setName", "getNote", "setNote", "getPeriodStartDate", "()Ljava/util/Date;", "setPeriodStartDate", "(Ljava/util/Date;)V", "getTimePeriod", "setTimePeriod", "getWateringPeriod", "setWateringPeriod", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;IZIILjava/util/Date;)Leu/morningbird/careforplants/model/Plant;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Plant {
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "location")
    private java.lang.String location;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "note")
    private java.lang.String note;
    @android.arch.persistence.room.ColumnInfo(name = "color")
    private int color;
    @android.arch.persistence.room.ColumnInfo(name = "has_photo")
    private boolean hasPhoto;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "image_path")
    private java.lang.String imagePath;
    @android.arch.persistence.room.ColumnInfo(name = "icon")
    private int icon;
    @android.arch.persistence.room.ColumnInfo(name = "is_time_periodic")
    private boolean isTimePeriodic;
    @android.arch.persistence.room.ColumnInfo(name = "time_period")
    private int timePeriod;
    @android.arch.persistence.room.ColumnInfo(name = "watering_period")
    private int wateringPeriod;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "period_start_date")
    private java.util.Date periodStartDate;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getColor() {
        return 0;
    }
    
    public final void setColor(int p0) {
    }
    
    public final boolean getHasPhoto() {
        return false;
    }
    
    public final void setHasPhoto(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImagePath() {
        return null;
    }
    
    public final void setImagePath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final void setIcon(int p0) {
    }
    
    public final boolean isTimePeriodic() {
        return false;
    }
    
    public final void setTimePeriodic(boolean p0) {
    }
    
    public final int getTimePeriod() {
        return 0;
    }
    
    public final void setTimePeriod(int p0) {
    }
    
    public final int getWateringPeriod() {
        return 0;
    }
    
    public final void setWateringPeriod(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getPeriodStartDate() {
        return null;
    }
    
    public final void setPeriodStartDate(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public Plant(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String note, int color, boolean hasPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.String imagePath, int icon, boolean isTimePeriodic, int timePeriod, int wateringPeriod, @org.jetbrains.annotations.NotNull()
    java.util.Date periodStartDate) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final eu.morningbird.careforplants.model.Plant copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    java.lang.String note, int color, boolean hasPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.String imagePath, int icon, boolean isTimePeriodic, int timePeriod, int wateringPeriod, @org.jetbrains.annotations.NotNull()
    java.util.Date periodStartDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}