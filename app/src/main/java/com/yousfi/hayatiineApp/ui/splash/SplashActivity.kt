package com.yousfi.hayatiineApp.ui.splash

import android.os.Handler
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide

import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.MainActivityBinding
import com.yousfi.hayatiineApp.ui.Const
import com.yousfi.hayatiineApp.ui.base.BaseActivity
import com.yousfi.hayatiineApp.ui.intro.IntoActivity
import com.yousfi.hayatiineApp.ui.main.MainActivity
import com.yousfi.hayatiineApp.utils.AllUtilsApp

import io.paperdb.Paper

class SplashActivity : BaseActivity<MainActivityBinding>(), SplashNavigator {


    private val TAG = "SplashActivity"
    private lateinit var model: SplashViewModel
    var mHandler = Handler()

    companion object {
        private const val SPLASH_TIME_OUT: Long = 1000
    }

    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(SplashViewModel::class.java)
        }
    }

    override fun init() {
        model.setNavigator(this)
    //    getDataBinding()?.viewmodel = model
     //  if (!Paper.book().contains(Const.APP_FIRST_OPEN)) {
           Handler().postDelayed({
               // AllUtilsApp.toOtherActivity(this, this@SplashActivity, IntoActivity::class.java)
               AllUtilsApp.navigateToActivity(this, this@SplashActivity, IntoActivity::class.java)
               finish()
           }, SPLASH_TIME_OUT)

     //       Paper.book().write(Const.APP_FIRST_OPEN, true)
    //    } else {
    //        Handler().postDelayed({
    //           AllUtilsApp.navigateToActivity(this, this@SplashActivity,MainActivity::class.java)
    //            finish()
     //      }, SPLASH_TIME_OUT)
    //    }

    }


    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun navigateToMain() {
        Log.e(TAG, "navigateToMain: ")
    }

    override fun navigateToBriefing() {
        Log.e(TAG, "navigateToBriefing: ")
    }

    override fun navigateToLogin() {
        Handler().postDelayed({
          // AllUtilsApp.toOtherActivity(this, this@SplashActivity, LoginActivity::class.java)
            AllUtilsApp.navigateToActivity(this, this@SplashActivity, MainActivity::class.java)
            finish()
        }, SPLASH_TIME_OUT)
    }
}
