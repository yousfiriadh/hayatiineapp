package com.yousfi.hayatiineApp.ui.intro


import androidx.databinding.ObservableArrayList
import com.yousfi.hayatiine.ui.base.BaseViewModel
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.data.entities.Screen


class IntoViewModel : BaseViewModel<IntoNavigator>() {
    private val TAG = "IntoClientViewModel"

    var adsList = ObservableArrayList<Screen>()





    init {
        adsList.add(Screen(R.drawable.cameraicon2x,"Prenez une Photo Ajouter-La","Prenez une Photo Ajouter-La"))
        adsList.add(Screen(R.drawable.vente,"Vends sans frais","Vends sans frais"))
    }

    fun navigateToMain() {
        getNavigator()!!.navigateToMain()
    }








}