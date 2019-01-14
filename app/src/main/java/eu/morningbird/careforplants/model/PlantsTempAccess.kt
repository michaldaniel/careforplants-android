package eu.morningbird.careforplants.model

import java.util.*

object PlantsTempAccess {
    //TODO: Make it into repository someday

    fun populatePlants(): List<Plant> {
        val plants = ArrayList<Plant>()
        plants.add(Plant(null, "Nice plant", "Office", "", 0, false, "", 0, false, 0, 0, Date()))
        plants.add(Plant(null, "Nice plant", "Office", "", 0, false, "", 0, false, 0, 0, Date()))
        plants.add(Plant(null, "Nice plant", "Office", "", 0, false, "", 0, false, 0, 0, Date()))
        plants.add(Plant(null, "Nice plant", "Office", "", 0, false, "", 0, false, 0, 0, Date()))
        plants.add(Plant(null, "Nice plant", "Office", "", 0, false, "", 0, false, 0, 0, Date()))
        plants.add(Plant(null, "Nice plant", "Office", "", 0, false, "", 0, false, 0, 0, Date()))
        plants.add(Plant(null, "Nice plant", "Office", "", 0, false, "", 0, false, 0, 0, Date()))
        return plants
    }
}