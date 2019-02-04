package eu.morningbird.careforplants.view

import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import eu.morningbird.careforplants.BR
import eu.morningbird.careforplants.CareForPlantsApplication
import eu.morningbird.careforplants.R
import eu.morningbird.careforplants.databinding.ActivityAddEditPlantBinding
import eu.morningbird.careforplants.viewmodel.AddEditPlantActivityVM
import kotlinx.android.synthetic.main.activity_add_edit_plant.*

class AddEditPlantActivity : AppCompatActivity() {

    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "AddEditPlantActivity"

    private lateinit var application: CareForPlantsApplication
    private lateinit var addEditPlantActivityVM: AddEditPlantActivityVM
    private lateinit var addEditPlantActivityBinding: ActivityAddEditPlantBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edit_plant)
        initView()
    }

    override fun onResume() {
        addEditPlantActivityVM.addOnPropertyChangedCallback(onPropertyChanged)
        super.onResume()
    }

    override fun onPause() {
        addEditPlantActivityVM.removeOnPropertyChangedCallback(onPropertyChanged)
        super.onPause()
    }

    private fun initView() {
        application = this.getApplication() as CareForPlantsApplication
        addEditPlantActivityVM = AddEditPlantActivityVM()
        addEditPlantActivityVM.addOnPropertyChangedCallback(onPropertyChanged)

        addEditPlantActivityVM.attach(this)
        addEditPlantActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_add_edit_plant)
        addEditPlantActivityBinding.setVariable(BR.ViewModel, addEditPlantActivityVM)

        if (!addEditPlantActivityVM.isDataLoaded) {
            addEditPlantActivityVM.loadData()
        } else  {
            updateView()
        }

        setSupportActionBar(addEditActivityToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        modifyLooks()
        connectSignals()
    }

    private fun connectSignals() {
        lastWateringIndicatorSeekBar.onSeekChangeListener = addEditPlantActivityVM.lastWateringIndicatorSeekBarOnSeekChanged
        wateringPeriodIndicatorSeekBar.onSeekChangeListener = addEditPlantActivityVM.wateringPeriodIndicatorSeekBarOnSeekChanged
        fertilizationPeriodIndicatorSeekBar.onSeekChangeListener = addEditPlantActivityVM.fertilizationPeriodIndicatorSeekBarOnSeekChanged
        wateringWeekdaysPicker.setOnWeekdaysChangeListener(addEditPlantActivityVM.wateringDaysPickerOnWeekdaysChangeListener)
    }

    private fun modifyLooks() {
        supportActionBar?.setIcon(R.drawable.ic_watering_can_mono)
    }

    private fun updateView() {

    }

    private val onPropertyChanged = object : Observable.OnPropertyChangedCallback() {
        override fun onPropertyChanged(p0: Observable?, p1: Int) {
            runOnUiThread {
                updateView()
            }
        }
    }
}
