package com.yousfi.hayatiineApp.ui.login

interface LoginNavigator {
    fun navigateToSignup()
    fun navigateToHome()
    fun showLoading()
    fun hideLoading()

    fun onStarted()
    fun onSuccess()
    fun onFailure(message:String)
    fun onLogout()
}