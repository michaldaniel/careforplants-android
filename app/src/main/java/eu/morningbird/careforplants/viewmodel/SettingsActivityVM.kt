package eu.morningbird.careforplants.viewmodel

import android.content.Context
import android.databinding.BaseObservable
import eu.morningbird.careforplants.view.SettingsActivity
import java.util.concurrent.locks.ReentrantLock

class SettingsActivityVM : BaseObservable() {
    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "SettingsActivityVM"

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
        if (context is SettingsActivity) {
            this.context = context
        } else {
            throw TypeCastException("Invalid context type for this view model")
        }
    }
}