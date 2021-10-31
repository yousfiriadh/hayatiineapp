package com.yousfi.hayatiineApp.ui.login

import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiineApp.ui.signUp.SignUpActivity
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.ActivityLoginBinding
import com.yousfi.hayatiineApp.ui.base.BaseActivity
import com.yousfi.hayatiineApp.ui.main.MainActivity
import com.yousfi.hayatiineApp.utils.AllUtilsApp
import com.yousfi.hayatiineApp.utils.toast
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : BaseActivity<ActivityLoginBinding>() ,LoginNavigator{
    private lateinit var model: LoginViewModel

    override fun onStarted() {
        toast("login Started")
    }

    override fun onSuccess() {
        toast("login success")
        getDataBanding()!!.progressBar?.visibility= View.VISIBLE
        AllUtilsApp.toOtherActivity(this,this, MainActivity::class.java)
    }

    override fun onFailure(message: String) {
       toast(message)
    }

    override fun onLogout() {
        AllUtilsApp.navigateToActivity(
            this,
            this@LoginActivity,
            SignUpActivity::class.java
        )
    }


    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(LoginViewModel::class.java)
        }
    }

    override fun init() {
        model.setNavigator(this)
        getDataBanding()?.viewModel=model
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_login
    }

    override fun navigateToSignup() {
        AllUtilsApp.navigateToActivity(
            this,
            this@LoginActivity,
            SignUpActivity::class.java
        )
    }

    override fun navigateToHome() {
        AllUtilsApp.navigateToActivity(
            this,
            this@LoginActivity,
            MainActivity::class.java
        )
    }

    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }
}