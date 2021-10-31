package com.yousfi.hayatiineApp.data.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Article (
    // Databinding need getters to get the fields we declared in xml layout.
    // Kotlin data class creates those for us.
    val articleName: String,
    val articlePrice: String,
    val articleImage: Int) : Parcelable