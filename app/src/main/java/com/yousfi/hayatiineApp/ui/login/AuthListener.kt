package com.yousfi.hayatiineApp.ui.login

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message:String)
    fun onLogout()
}