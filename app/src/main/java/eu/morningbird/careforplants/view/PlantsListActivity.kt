package eu.morningbird.careforplants.view

import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import eu.morningbird.careforplants.BR
import eu.morningbird.careforplants.CareForPlantsApplication
import eu.morningbird.careforplants.R
import eu.morningbird.careforplants.databinding.ActivityPlantsListBinding
import eu.morningbird.careforplants.model.PlantsTempAccess
import eu.morningbird.careforplants.viewmodel.PlantsListActivityVM
import kotlinx.android.synthetic.main.activity_plants_list.*


class PlantsListActivity : AppCompatActivity() {

    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "PlantsListActivity"

    private lateinit var application: CareForPlantsApplication
    private lateinit var plantsListActivityVM: PlantsListActivityVM
    private lateinit var plantsListActivityBinding: ActivityPlantsListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plants_list)
        initView()
    }

    override fun onResume() {
        plantsListActivityVM.addOnPropertyChangedCallback(onPropertyChanged)
        super.onResume()
    }

    override fun onPause() {
        plantsListActivityVM.removeOnPropertyChangedCallback(onPropertyChanged)
        super.onPause()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.plants_list_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.getItemId()


        if (id == R.id.action_settings) {
            plantsListActivityVM.toolbarActionSettings()
            return true
        } else if (id == R.id.action_about) {
            plantsListActivityVM.toolbarActionAbout()
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    private fun initView() {
        application = this.getApplication() as CareForPlantsApplication
        plantsListActivityVM = application.plantsListActivityVM
        plantsListActivityVM.attach(this)

        plantsListActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_plants_list)
        plantsListActivityBinding.setVariable(BR.ViewModel, plantsListActivityVM)

        plantsListActivityVM.addOnPropertyChangedCallback(onPropertyChanged)
        if (!plantsListActivityVM.isDataLoaded) {
            plantsListActivityVM.loadData()
        } else {
            updateView()
        }

        setSupportActionBar(mainActivityToolbar)

        modifyLooks()
    }

    private fun setupAdapter() {
        val recycler = plantsListActivityBinding.listPlantsRecyclerView
        recycler.itemAnimator = DefaultItemAnimator()
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = PlantsListAdapter()
    }

    private fun modifyLooks() {
        supportActionBar?.setIcon(R.drawable.ic_watering_can_mono)
    }

    private fun updateView() {
        if (plantsListActivityBinding.listPlantsRecyclerView.adapter == null) setupAdapter()
        val plantsAdapter = plantsListActivityBinding.listPlantsRecyclerView.adapter as PlantsListAdapter
        plantsAdapter.plantsList = plantsListActivityVM.plants
    }

    private val onPropertyChanged = object : Observable.OnPropertyChangedCallback() {
        override fun onPropertyChanged(p0: Observable?, p1: Int) {
            runOnUiThread {
                updateView()
            }
        }
    }


}
