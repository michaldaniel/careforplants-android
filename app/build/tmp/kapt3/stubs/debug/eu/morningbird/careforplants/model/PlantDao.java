package eu.morningbird.careforplants.model;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Leu/morningbird/careforplants/model/PlantDao;", "", "deleteAll", "", "getAll", "", "Leu/morningbird/careforplants/model/Plant;", "insert", "plant", "loadSingle", "id", "", "app_debug"})
public abstract interface PlantDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from plant")
    public abstract java.util.List<eu.morningbird.careforplants.model.Plant> getAll();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    eu.morningbird.careforplants.model.Plant plant);
    
    @android.arch.persistence.room.Query(value = "DELETE from plant")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from plant WHERE id = :id")
    public abstract java.util.List<eu.morningbird.careforplants.model.Plant> loadSingle(long id);
}