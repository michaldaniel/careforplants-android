package eu.morningbird.careforplants.view

import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import eu.morningbird.careforplants.BR
import eu.morningbird.careforplants.CareForPlantsApplication
import eu.morningbird.careforplants.R
import eu.morningbird.careforplants.databinding.ActivitySettingsBinding
import eu.morningbird.careforplants.viewmodel.PlantDetailsActivityVM
import eu.morningbird.careforplants.viewmodel.SettingsActivityVM
import kotlinx.android.synthetic.main.activity_plants_list.*
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "SettingsActivity"

    private lateinit var application: CareForPlantsApplication
    private lateinit var settingsActivityVM: SettingsActivityVM
    private lateinit var settingsActivityBinding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        initView()
    }

    override fun onResume() {
        settingsActivityVM.addOnPropertyChangedCallback(onPropertyChanged)
        super.onResume()
    }

    override fun onPause() {
        settingsActivityVM.removeOnPropertyChangedCallback(onPropertyChanged)
        super.onPause()
    }

    private fun initView() {
        application = this.getApplication() as CareForPlantsApplication
        settingsActivityVM = application.settingsActivityVM
        settingsActivityVM.addOnPropertyChangedCallback(onPropertyChanged)

        settingsActivityVM.attach(this)
        settingsActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_settings)
        settingsActivityBinding.setVariable(BR.ViewModel, settingsActivityVM)

        if (!settingsActivityVM.isDataLoaded) {
            settingsActivityVM.loadData()
        } else {
            updateView()
        }

        setSupportActionBar(settingsActivityToolbar)
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