package com.yousfi.hayatiineApp.ui.intro

import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.ActivityIntroBinding
import com.yousfi.hayatiineApp.ui.base.BaseActivity
import com.yousfi.hayatiineApp.ui.intro.adapter.SlideImageAdapter
import com.yousfi.hayatiineApp.ui.login.LoginActivity
import com.yousfi.hayatiineApp.utils.AllUtilsApp
import kotlinx.android.synthetic.main.activity_intro.*
import java.util.*
import kotlin.collections.ArrayList


class IntoActivity : BaseActivity<ActivityIntroBinding>(),
    IntoNavigator {
    private lateinit var model: IntoViewModel

    private val TAG = "IntroActivity"
    lateinit var adapter2: SlideImageAdapter
    var currentPage: Int = 0

    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(IntoViewModel::class.java)
        }
    }

    override fun init() {
        model.setNavigator(this)
        getDataBanding()?.viewModel = model
       // model.adsList
        askPermissionApp()
        adapter2 = SlideImageAdapter(applicationContext, model.adsList)
        getDataBanding()!!.viewPager.adapter = adapter2
        adapter2.notifyDataSetChanged()
        getDataBanding()!!.dotsIndicator.setViewPager(getDataBanding()!!.viewPager)
        //...
        val swipeTimer = Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                runOnUiThread {
                    if (getDataBanding()!!.viewPager.currentItem === model.adsList.size - 1) {
                        currentPage = 0
                    }
                    getDataBanding()!!.viewPager.setCurrentItem(currentPage++, true)
                }
            }
        }, 2000, 5000)




        getDataBanding()!!.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
            }
        })
    }
    fun scrollAdsTo(pos: Int) {
        getDataBanding()!!.viewPager.setCurrentItem(pos, true)
    }
    private fun askPermissionApp() {
        askPermission("android.permission.INTERNET", 0)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_intro
    }

    override fun navigateToMain() {
       AllUtilsApp.navigateToActivity(
            this,
            this@IntoActivity,
           LoginActivity::class.java
        )
    }

    override fun navigateToLogin() {
        AllUtilsApp.navigateToActivity(
            this,
            this@IntoActivity,
            LoginActivity::class.java
        )
    }




}
