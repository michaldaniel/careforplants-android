package eu.morningbird.careforplants.viewmodel

import android.content.Context
import android.content.Intent
import android.databinding.BaseObservable
import android.databinding.Bindable
import android.graphics.drawable.Drawable
import android.util.TypedValue
import android.view.View
import com.android.databinding.library.baseAdapters.BR
import eu.morningbird.careforplants.R
import eu.morningbird.careforplants.model.Plant
import eu.morningbird.careforplants.view.PlantDetailsActivity
import eu.morningbird.careforplants.view.PlantsListActivity
import java.util.concurrent.locks.ReentrantLock

class ItemPlantVM : BaseObservable() {
    @Suppress("PrivatePropertyName", "unused")
    private val TAG: String = "ItemPlantVM"

    @Bindable("imageDescription")
    var imageDescription: String = "It's an image, lol"
        private set(value) {
            field = value
            notifyPropertyChanged(BR.imageDescription)
        }

    @Bindable("name")
    var name: String = "Nice plant"
        private set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @Bindable("location")
    var location: String = "Office (brown pot)"
        private set(value) {
            field = value
            notifyPropertyChanged(BR.location)
        }

    @Bindable("deadline")
    var deadline: String = "Water tomorrow"
        private set(value) {
            field = value
            notifyPropertyChanged(BR.deadline)
        }

    @Bindable("period")
    var period: String = "Every 3 days"
        private set(value) {
            field = value
            notifyPropertyChanged(BR.period)
        }

    fun getImage(context: Context) : Drawable? {
            return context.getDrawable(R.drawable.ic_plant_1)
            //TODO: Replace placeholder with logic
    }

    @Bindable("waterDropletIconId")
    var waterDropletIconId: Int = R.drawable.ic_water_droplet
        private set(value) {
            field = value
            notifyPropertyChanged(BR.waterDropletIconId)
        }

    @Bindable("cardColorId")
    var cardColorId: Int = android.R.color.white
        private set(value) {
            field = value
            notifyPropertyChanged(BR.cardColorId)
        }


    fun getDeadlineTextColorId(context: Context) : Int {
        val colorTypedValue = TypedValue()
        context.theme?.resolveAttribute(android.R.attr.textColorSecondary, colorTypedValue, false) // Do not resolve references, this will make data carry ID not color value
        if (colorTypedValue.type >= TypedValue.TYPE_FIRST_COLOR_INT && colorTypedValue.type <= TypedValue.TYPE_LAST_COLOR_INT) {
            return colorTypedValue.data
        }
        return android.R.color.black
    }

    @Bindable("locationTextViewVisibility")
    var locationTextViewVisibility: Int = View.VISIBLE
        private set(value) {
            field = value
            notifyPropertyChanged(BR.locationTextViewVisibility)
        }

    @Bindable("locationIconImageViewVisibility")
    var locationIconImageViewVisibility: Int = View.VISIBLE
        private set(value) {
            field = value
            notifyPropertyChanged(BR.locationIconImageViewVisibility)
        }

    private var context: Context? = null

    private val lock = ReentrantLock()

    @Volatile
    var isDataLoaded: Boolean = false
        private set

    fun loadData(plant: Plant) {
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
        if (context is PlantsListActivity) {
            this.context = context
        } else {
            throw TypeCastException("Invalid context type for this view model")
        }
    }

    @Suppress("UNUSED_PARAMETER")
    fun onItemClick(view: View) {
        val intent = Intent(context, PlantDetailsActivity::class.java)
        context?.startActivity(intent)
    }

}