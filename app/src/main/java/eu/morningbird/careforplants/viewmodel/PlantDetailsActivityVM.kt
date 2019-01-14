package eu.morningbird.careforplants.viewmodel

import android.content.Context
import android.databinding.BaseObservable
import eu.morningbird.careforplants.view.PlantDetailsActivity
import java.util.concurrent.locks.ReentrantLock

class PlantDetailsActivityVM : BaseObservable() {
    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "PlantDetailsActivityVM"

    private var context: Context? = null

    private val lock = ReentrantLock()

    @Volatile
    var isDataLoaded: Boolean = false
        private set

    fun loadData() {
        val runnable = Runnable {
            lock.lock()
            try {
                isDataLoaded = true
                notifyChange()
            } finally {
                lock.unlock()
            }
        }
        Thread(runnable).start()
    }

    fun attach(context: Context) {
        if (context is PlantDetailsActivity) {
            this.context = context
        } else {
            throw TypeCastException("Invalid context type for this view model")
        }
    }
}