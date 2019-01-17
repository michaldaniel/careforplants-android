package eu.morningbird.careforplants.viewmodel

import android.content.Context
import android.content.Intent
import android.databinding.BaseObservable
import android.view.View
import eu.morningbird.careforplants.model.Plant
import eu.morningbird.careforplants.model.PlantsTempAccess
import eu.morningbird.careforplants.view.AboutActivity
import eu.morningbird.careforplants.view.AddEditPlantActivity
import eu.morningbird.careforplants.view.PlantsListActivity
import eu.morningbird.careforplants.view.SettingsActivity
import java.util.concurrent.locks.ReentrantLock

class PlantsListActivityVM : BaseObservable() {
    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "PlantsListActivityVM"


    var plants: ArrayList<Plant> = ArrayList()
        private set

    private var context: Context? = null

    private val lock = ReentrantLock()

    @Volatile
    var isDataLoaded: Boolean = false
        private set

    fun loadData() {
        val runnable = Runnable {
            lock.lock()
            try {
                changePlantsDataSet(PlantsTempAccess.populatePlants())
                isDataLoaded = true
                notifyChange()
            } finally {
                lock.unlock()
            }
        }
        Thread(runnable).start()
    }

    fun attach(context: Context) {
        if (context is PlantsListActivity) {
            this.context = context
        } else {
            throw TypeCastException("Invalid context type for this view model")
        }
    }

    @Suppress("UNUSED_PARAMETER")
    fun onAddPlantFabClicked(view: View) {
        val intent = Intent(context, AddEditPlantActivity::class.java)
        context?.startActivity(intent)
    }

    fun toolbarActionSettings() {
        val intent = Intent(context, SettingsActivity::class.java)
        context?.startActivity(intent)
    }

    fun toolbarActionAbout() {
        val intent = Intent(context, AboutActivity::class.java)
        context?.startActivity(intent)
    }

    private fun changePlantsDataSet(plants: List<Plant>) {
        this.plants.addAll(plants)
        notifyChange()
    }


}