package eu.morningbird.careforplants.model

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import android.arch.persistence.room.OnConflictStrategy.REPLACE

@Dao
interface PlantDao {

    @Query("SELECT * from plant")
    fun getAll(): List<Plant>

    @Insert(onConflict = REPLACE)
    fun insert(plant: Plant)

    @Query("DELETE from plant")
    fun deleteAll()

    @Query("SELECT * from plant WHERE id = :id")
    fun loadSingle(id: Long): List<Plant>
}