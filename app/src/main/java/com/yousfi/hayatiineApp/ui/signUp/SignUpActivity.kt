package com.yousfi.hayatiineApp.ui.signUp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.ActivitySignUpBinding
import com.yousfi.hayatiineApp.ui.base.BaseActivity
import com.yousfi.hayatiineApp.ui.login.LoginViewModel
import com.yousfi.hayatiineApp.ui.main.MainActivity
import com.yousfi.hayatiineApp.utils.AllUtilsApp

import kotlinx.android.synthetic.main.activity_login.*

class SignUpActivity :BaseActivity<ActivitySignUpBinding>(),SignUpNavigator {
    private lateinit var model:SignUpActivityViewModel

    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(SignUpActivityViewModel::class.java)
        }
    }

    override fun init() {
        model.setNavigator(this)
        getDataBanding()?.viewModel=model
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_sign_up
    }

    override fun navigateToHome() {
        AllUtilsApp.navigateToActivity(
            this,
            this@SignUpActivity,
            MainActivity::class.java
        )
    }

    override fun navigateToForgotPassword() {
        TODO("Not yet implemented")
    }

}