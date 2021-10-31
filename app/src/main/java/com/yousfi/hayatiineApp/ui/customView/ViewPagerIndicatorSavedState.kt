package com.yousfi.hayatiineApp.ui.customView


import android.os.Parcel
import android.os.Parcelable
import android.view.View


internal class ViewPagerIndicatorSavedState(superState: Parcelable) : View.BaseSavedState(superState) {

    //Use for keep selected item
    var currentPagerItemSelected = 0

    override fun writeToParcel(out: Parcel?, flags: Int) {
        super.writeToParcel(out, flags)
        out?.writeInt(currentPagerItemSelected)
    }
}