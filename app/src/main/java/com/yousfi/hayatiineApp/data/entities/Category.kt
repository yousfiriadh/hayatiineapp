package com.yousfi.hayatiineApp.data.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Category(
    val CategorytName: String,
    val isChecked:Boolean
    ) : Parcelable
