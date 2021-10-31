package com.yousfi.hayatiineApp.ui.signUp

import com.yousfi.hayatiine.ui.base.BaseViewModel

class SignUpActivityViewModel :BaseViewModel<SignUpNavigator>() {

    fun navigateToHome(){
        getNavigator()!!.navigateToHome()
    }
}