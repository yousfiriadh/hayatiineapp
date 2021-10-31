package com.yousfi.hayatiineApp.data.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Notification (
    // Databinding need getters to get the fields we declared in xml layout.
    // Kotlin data class creates those for us.
    val membre: String,
    val membreImage: Int,
    val status: String,
    val dateCreation:String) : Parcelable