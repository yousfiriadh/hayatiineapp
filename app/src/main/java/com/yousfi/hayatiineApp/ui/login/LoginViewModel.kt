package com.yousfi.hayatiineApp.ui.login

import android.view.View
import com.yousfi.hayatiine.ui.base.BaseViewModel
import com.yousfi.hayatiineApp.ui.main.MainActivity
import com.yousfi.hayatiineApp.utils.AllUtilsApp
import com.yousfi.hayatiineApp.utils.toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginViewModel:BaseViewModel<LoginNavigator> (){

    var email:String?=null
    var password:String?=null



   /* fun onLogin(view: View){


        getNavigator()!!.onStarted()
        if(email.isNullOrEmpty()||password.isNullOrEmpty()){
            getNavigator()!!.onFailure("invalid email or password")
            return

        }

        getNavigator()!!.onSuccess()
    }*/
    fun onLogout(view: View){
        getNavigator()!!.onLogout()
    }
    fun navigateToSignup() {
        getNavigator()!!.navigateToSignup()
    }

    fun navigateToHome() {
        getNavigator()!!.navigateToHome()
    }

}