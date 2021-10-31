package com.yousfi.hayatiineApp.ui.main

import androidx.lifecycle.ViewModel
import com.yousfi.hayatiine.ui.base.BaseViewModel

class MainViewModel : BaseViewModel<NavigatorMainActivity>() {
    fun navigateToHome(){
        getNavigator()!!.navigateToHome()
    }
    fun navigateToSearch(){
        getNavigator()!!.navigateToSearch()
    }
    fun navigateToFavoris(){
        getNavigator()!!.navigateToFavoris()
    }
    fun navigateToAdd(){
        getNavigator()!!.navigateToAdd()
    }
    fun navigateToPanier(){
        getNavigator()!!.navigateToPanier()
    }
    fun navigateToNotification() {
            getNavigator()!!.navigateToNotification()
    }

    fun navigateToSetting(){
        getNavigator()!!.navigateToSetting()
    }
}