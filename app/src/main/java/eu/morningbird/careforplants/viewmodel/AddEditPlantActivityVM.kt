package eu.morningbird.careforplants.viewmodel

import android.content.Context
import android.databinding.BaseObservable
import eu.morningbird.careforplants.view.AddEditPlantActivity
import java.util.concurrent.locks.ReentrantLock

class AddEditPlantActivityVM : BaseObservable() {
    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "AddEditPlantActivityVM"

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
        if (context is AddEditPlantActivity) {
            this.context = context
        } else {
            throw TypeCastException("Invalid context type for this view model")
        }
    }
}