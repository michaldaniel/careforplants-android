package eu.morningbird.careforplants.view

import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import eu.morningbird.careforplants.BR
import eu.morningbird.careforplants.CareForPlantsApplication
import eu.morningbird.careforplants.R
import eu.morningbird.careforplants.databinding.ActivityAboutBinding
import eu.morningbird.careforplants.databinding.ActivityPlantsListBinding
import eu.morningbird.careforplants.model.PlantsTempAccess
import eu.morningbird.careforplants.viewmodel.AboutActivityVM
import eu.morningbird.careforplants.viewmodel.PlantsListActivityVM
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_plants_list.*

class AboutActivity : AppCompatActivity() {

    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "AboutActivity"

    private lateinit var application: CareForPlantsApplication
    private lateinit var aboutActivityVM: AboutActivityVM
    private lateinit var aboutActivityBinding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        initView()
    }

    override fun onResume() {
        aboutActivityVM.addOnPropertyChangedCallback(onPropertyChanged)
        super.onResume()
    }

    override fun onPause() {
        aboutActivityVM.removeOnPropertyChangedCallback(onPropertyChanged)
        super.onPause()
    }

    private fun initView() {
        application = this.getApplication() as CareForPlantsApplication
        aboutActivityVM = application.aboutActivityVM
        aboutActivityVM.addOnPropertyChangedCallback(onPropertyChanged)

        aboutActivityVM.attach(this)
        aboutActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_about)
        aboutActivityBinding.setVariable(BR.ViewModel, aboutActivityVM)

        if (!aboutActivityVM.isDataLoaded) {
            aboutActivityVM.loadData()
        } else {
            updateView()
        }

        setSupportActionBar(aboutActivityToolbar)
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
