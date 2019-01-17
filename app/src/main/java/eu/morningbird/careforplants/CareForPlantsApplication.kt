package eu.morningbird.careforplants

import android.app.Application
import eu.morningbird.careforplants.viewmodel.AboutActivityVM
import eu.morningbird.careforplants.viewmodel.PlantDetailsActivityVM
import eu.morningbird.careforplants.viewmodel.PlantsListActivityVM
import eu.morningbird.careforplants.viewmodel.SettingsActivityVM

class CareForPlantsApplication : Application() {

    var plantsListActivityVM: PlantsListActivityVM = PlantsListActivityVM()
        private set

    var aboutActivityVM: AboutActivityVM = AboutActivityVM()
        private set

    var settingsActivityVM: SettingsActivityVM = SettingsActivityVM()
        private set


}