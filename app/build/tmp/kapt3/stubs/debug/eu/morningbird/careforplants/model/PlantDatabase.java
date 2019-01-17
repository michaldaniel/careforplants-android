package eu.morningbird.careforplants.model;

import java.lang.System;

@android.arch.persistence.room.TypeConverters(value = {eu.morningbird.careforplants.model.Converters.class})
@android.arch.persistence.room.Database(entities = {eu.morningbird.careforplants.model.Plant.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Leu/morningbird/careforplants/model/PlantDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "plantDao", "Leu/morningbird/careforplants/model/PlantDao;", "Companion", "app_debug"})
public abstract class PlantDatabase extends android.arch.persistence.room.RoomDatabase {
    private static eu.morningbird.careforplants.model.PlantDatabase INSTANCE;
    public static final eu.morningbird.careforplants.model.PlantDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract eu.morningbird.careforplants.model.PlantDao plantDao();
    
    public PlantDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Leu/morningbird/careforplants/model/PlantDatabase$Companion;", "", "()V", "INSTANCE", "Leu/morningbird/careforplants/model/PlantDatabase;", "destroyInstance", "", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final eu.morningbird.careforplants.model.PlantDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}