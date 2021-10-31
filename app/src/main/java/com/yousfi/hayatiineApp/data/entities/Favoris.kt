package com.yousfi.hayatiineApp.data.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Favoris (
    // Databinding need getters to get the fields we declared in xml layout.
    // Kotlin data class creates those for us.
    val favorisName: String,
    val favorisPrice: String,
    val favorisImage: Int) : Parcelable