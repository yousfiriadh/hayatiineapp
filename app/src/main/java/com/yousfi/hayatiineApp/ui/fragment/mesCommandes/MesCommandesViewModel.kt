package com.yousfi.hayatiineApp.ui.fragment.mesCommandes

import androidx.lifecycle.ViewModel
import com.yousfi.hayatiine.ui.base.BaseViewModel

class MesCommandesViewModel : BaseViewModel<MesComandesNavigator>() {
    fun onMenuClick() {
        getNavigator()!!.onMenuClick()
    }
    fun onHideMenuClick(){
        getNavigator()!!.onHideMenuClick()
    }
}