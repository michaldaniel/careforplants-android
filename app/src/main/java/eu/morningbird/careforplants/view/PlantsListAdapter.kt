package eu.morningbird.careforplants.view

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import eu.morningbird.careforplants.R
import eu.morningbird.careforplants.databinding.ItemPlantBinding
import eu.morningbird.careforplants.model.Plant
import eu.morningbird.careforplants.viewmodel.ItemPlantVM

class PlantsListAdapter : RecyclerView.Adapter<PlantsListAdapter.PlantsListAdapterViewHolder>() {

    var plantsList: List<Plant>? = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantsListAdapterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemPlantBinding: ItemPlantBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_plant, parent, false)
        return PlantsListAdapterViewHolder(itemPlantBinding)
    }

    override fun onBindViewHolder(holder: PlantsListAdapterViewHolder, position: Int) {
        holder.bindPlants(plantsList!![position])
    }

    override fun getItemCount(): Int {
        return plantsList!!.size
    }


    class PlantsListAdapterViewHolder(var mItemPlantBinding: ItemPlantBinding) : RecyclerView.ViewHolder(mItemPlantBinding.itemPlant) {


        internal fun bindPlants(plant: Plant) {
            if (mItemPlantBinding.viewModel == null) {
                mItemPlantBinding.viewModel = ItemPlantVM()
                mItemPlantBinding.viewModel!!.attach(itemView.context)
                if (!mItemPlantBinding.viewModel!!.isDataLoaded) {
                    mItemPlantBinding.viewModel!!.loadData(plant)
                }
            } else {
                mItemPlantBinding.viewModel!!.loadData(plant)
            }
        }
    }
}
