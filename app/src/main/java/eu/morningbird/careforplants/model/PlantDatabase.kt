package eu.morningbird.careforplants.model

import android.arch.persistence.room.*
import android.content.Context

@Database(entities = [(Plant::class)], version = 1)
@TypeConverters(Converters::class)
abstract class PlantDatabase : RoomDatabase() {

    abstract fun plantDao(): PlantDao

    companion object {
        private var INSTANCE: PlantDatabase? = null

        fun getInstance(context: Context): PlantDatabase? {
            if (INSTANCE == null) {
                synchronized(PlantDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            PlantDatabase::class.java, "plant_database")
                            .build()
                }
            }
            return INSTANCE as PlantDatabase
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}
