package eu.morningbird.careforplants.viewmodel

import android.content.Context
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.opengl.Visibility
import android.util.Log
import android.view.View
import android.widget.AdapterView
import com.android.databinding.library.baseAdapters.BR
import com.dpro.widgets.OnWeekdaysChangeListener
import com.warkiz.widget.IndicatorSeekBar
import com.warkiz.widget.OnSeekChangeListener
import com.warkiz.widget.SeekParams
import eu.morningbird.careforplants.view.AddEditPlantActivity
import java.util.concurrent.locks.ReentrantLock

class AddEditPlantActivityVM : BaseObservable() {
    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "AddEditPlantActivityVM"

    private var context: Context? = null

    private val lock = ReentrantLock()

    enum class PhotoState {
        SET, UNSET;
    }

    enum class WateringPeriod {
        DAILY, PERIODIC, SELECTED_DAYS;
    }

    private var photoState : PhotoState = PhotoState.UNSET
        set(value) {
            field = value
            when(value){
                PhotoState.UNSET -> {
                    addPhotoVisibility = View.VISIBLE
                    removePhotoVisibility = View.GONE
                }
                PhotoState.SET -> {
                    addPhotoVisibility = View.GONE
                    removePhotoVisibility = View.VISIBLE
                }
            }
        }

    private var wateringPeriod : WateringPeriod = WateringPeriod.DAILY
        set(value) {
            field = value
            when(value){
                WateringPeriod.DAILY -> {
                    wateringDaysVisibility = View.GONE
                    wateringPeriodVisibility = View.GONE
                }
                WateringPeriod.PERIODIC -> {
                    wateringDaysVisibility = View.GONE
                    wateringPeriodVisibility = View.VISIBLE
                }
                WateringPeriod.SELECTED_DAYS -> {
                    wateringDaysVisibility = View.VISIBLE
                    wateringPeriodVisibility = View.GONE
                }
            }
        }

    private var fertilization : Boolean = false
        set(value) {
            field = value
            if(value){
                fertilizationVisibility = View.VISIBLE
            } else {
                fertilizationVisibility = View.GONE
            }
        }

    @Bindable("addPhotoVisibility")
    var addPhotoVisibility: Int = View.VISIBLE
        private set(value) {
            field = value
            notifyPropertyChanged(BR.addPhotoVisibility)
        }

    @Bindable("removePhotoVisibility")
    var removePhotoVisibility: Int = View.VISIBLE
        private set(value) {
            field = value
            notifyPropertyChanged(BR.removePhotoVisibility)
        }

    @Bindable("fertilizationVisibility")
    var fertilizationVisibility: Int = View.VISIBLE
        private set(value) {
            field = value
            notifyPropertyChanged(BR.fertilizationVisibility)
        }


    @Bindable("wateringDaysVisibility")
    var wateringDaysVisibility: Int = View.VISIBLE
        private set(value) {
            field = value
            notifyPropertyChanged(BR.wateringDaysVisibility)
        }

    @Bindable("wateringPeriodVisibility")
    var wateringPeriodVisibility: Int = View.VISIBLE
        private set(value) {
            field = value
            notifyPropertyChanged(BR.wateringPeriodVisibility)
        }

    val lastWateringIndicatorSeekBarOnSeekChanged = object : OnSeekChangeListener {
        override fun onSeeking(seekParams: SeekParams) {}

        override fun onStartTrackingTouch(seekBar: IndicatorSeekBar) {}

        override fun onStopTrackingTouch(seekBar: IndicatorSeekBar) {
            Log.d(TAG, "Stopped tracking lastWateringIndicatorSeekBarOnSeekChanged")
            Log.d(TAG, "progress: " + seekBar.progress)
        }
    }

    val wateringPeriodIndicatorSeekBarOnSeekChanged = object : OnSeekChangeListener {
        override fun onSeeking(seekParams: SeekParams) {}

        override fun onStartTrackingTouch(seekBar: IndicatorSeekBar) {}

        override fun onStopTrackingTouch(seekBar: IndicatorSeekBar) {
            Log.d(TAG, "Stopped tracking wateringPeriodIndicatorSeekBarOnSeekChanged")
            Log.d(TAG, "progress: " + seekBar.progress)
        }
    }

    val fertilizationPeriodIndicatorSeekBarOnSeekChanged = object : OnSeekChangeListener {
        override fun onSeeking(seekParams: SeekParams) {}

        override fun onStartTrackingTouch(seekBar: IndicatorSeekBar) {}

        override fun onStopTrackingTouch(seekBar: IndicatorSeekBar) {
            Log.d(TAG, "Stopped tracking fertilizationPeriodIndicatorSeekBarOnSeekChanged")
            Log.d(TAG, "progress: " + seekBar.progress)
        }
    }


    val wateringDaysPickerOnWeekdaysChangeListener = OnWeekdaysChangeListener { view, clickedDayOfWeek, selectedDays ->
        /* Sunday = 1, Monday = 2 etc. */
        Log.d(TAG, "wateringDaysPicker selection changed")
        Log.d(TAG, "Selection: " + selectedDays.joinToString(" "))
    }

    @Suppress("UNUSED_PARAMETER")
    fun onSavePlantFabClicked(view: View) {
        Log.d(TAG, "onSavePlantFabClicked")
    }

    @Suppress("UNUSED_PARAMETER")
    fun onChangeIconFabClicked(view: View) {
        Log.d(TAG, "onChangeIconClicked")
    }

    @Suppress("UNUSED_PARAMETER")
    fun onAddPhotoFabClicked(view: View) {
        Log.d(TAG, "onAddPhotoFabClicked")
    }

    @Suppress("UNUSED_PARAMETER")
    fun onRemovePhotoFabClicked(view: View) {
        Log.d(TAG, "onRemovePhotoFabClicked")
    }

    @Suppress("UNUSED_PARAMETER")
    fun onWateringPeriodSpinnerItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        when(position) {
            0 -> {
                //Every day
                wateringPeriod = WateringPeriod.DAILY
            }
            1 -> {
                //Periodic
                wateringPeriod = WateringPeriod.PERIODIC
            }
            2 -> {
                //Selected days
                wateringPeriod = WateringPeriod.SELECTED_DAYS
            }
        }
    }

    @Suppress("UNUSED_PARAMETER")
    fun onFertilizationSwitchCheckedChanged(view: View, isChecked: Boolean) {
        fertilization = isChecked
    }

    @Volatile
    var isDataLoaded: Boolean = false
        private set

    fun loadData() {
        val runnable = Runnable {
            lock.lock()
            try {
                photoState = PhotoState.UNSET
                wateringPeriod = WateringPeriod.DAILY
                fertilization = false
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