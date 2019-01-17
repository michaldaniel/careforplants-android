package eu.morningbird.careforplants.model

import android.arch.persistence.room.*
import java.util.*

@Entity(tableName = "plant")
data class Plant (
        @PrimaryKey(autoGenerate = true) var id: Long?,
        @ColumnInfo(name = "name") var name: String,
        @ColumnInfo(name = "location") var location: String,
        @ColumnInfo(name = "note") var note: String,
        @ColumnInfo(name = "color") var color: Int,
        @ColumnInfo(name = "has_photo") var hasPhoto: Boolean,
        @ColumnInfo(name = "image_path") var imagePath: String,
        @ColumnInfo(name = "icon") var icon: Int,
        @ColumnInfo(name = "is_time_periodic") var isTimePeriodic: Boolean,
        @ColumnInfo(name = "time_period") var timePeriod: Int,
        @ColumnInfo(name = "watering_period") var wateringPeriod: Int,
        @ColumnInfo(name = "period_start_date") var periodStartDate: Date
)

