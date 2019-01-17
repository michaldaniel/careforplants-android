package eu.morningbird.careforplants.view

import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import eu.morningbird.careforplants.BR
import eu.morningbird.careforplants.CareForPlantsApplication
import eu.morningbird.careforplants.R
import eu.morningbird.careforplants.databinding.ActivityPlantDetailsBinding
import eu.morningbird.careforplants.viewmodel.AddEditPlantActivityVM
import eu.morningbird.careforplants.viewmodel.PlantDetailsActivityVM
import kotlinx.android.synthetic.main.activity_plant_details.*
import kotlinx.android.synthetic.main.activity_plants_list.*

class PlantDetailsActivity : AppCompatActivity() {

    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "PlantDetailsActivity"

    private lateinit var application: CareForPlantsApplication
    private lateinit var plantDetailsActivityVM: PlantDetailsActivityVM
    private lateinit var plantDetailsActivityBinding: ActivityPlantDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_details)
        initView()
    }

    override fun onResume() {
        plantDetailsActivityVM.addOnPropertyChangedCallback(onPropertyChanged)
        super.onResume()
    }

    override fun onPause() {
        plantDetailsActivityVM.removeOnPropertyChangedCallback(onPropertyChanged)
        super.onPause()
    }

    private fun initView() {
        application = this.getApplication() as CareForPlantsApplication
        plantDetailsActivityVM = PlantDetailsActivityVM()
        plantDetailsActivityVM.addOnPropertyChangedCallback(onPropertyChanged)

        plantDetailsActivityVM.attach(this)
        plantDetailsActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_plant_details)
        plantDetailsActivityBinding.setVariable(BR.ViewModel, plantDetailsActivityVM)

        if (!plantDetailsActivityVM.isDataLoaded) {
            plantDetailsActivityVM.loadData()
        } else {
            updateView()
        }

        setSupportActionBar(plantDetailsActivityToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        modifyLooks()
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