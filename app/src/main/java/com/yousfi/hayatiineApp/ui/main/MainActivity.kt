package com.yousfi.hayatiineApp.ui.main


import android.widget.ImageButton
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.MainActivityBinding
import com.yousfi.hayatiineApp.ui.base.BaseActivity
import com.yousfi.hayatiineApp.ui.main.adapter.FragmentAdapter


class MainActivity : BaseActivity<MainActivityBinding>() ,NavigatorMainActivity{

    lateinit var model: MainViewModel
    private lateinit var adapter2: FragmentAdapter


    private fun changeTabs(position: Int) {


        if (position == 0) {
            getDataBanding()!!.homeBtn.setImageResource(R.drawable.home_pink)
            getDataBanding()!!. searchBtn.setImageResource(R.drawable.search)
            getDataBanding()!!.unionBtn.setImageResource(R.drawable.union)
            getDataBanding()!!.shopingBtn.setImageResource(R.drawable.shoping)
            getDataBanding()!!.notifBtn.setImageResource(R.drawable.notif)
            getDataBanding()!!.settingBtn.setImageResource(R.drawable.settings)
            getDataBanding()!!.addBtn.setImageResource(R.drawable.add)
        }
        if (position == 1) {
            getDataBanding()!!.homeBtn.setImageResource(R.drawable.home)
            getDataBanding()!!.searchBtn.setImageResource(R.drawable.search_pink)
            getDataBanding()!!.unionBtn.setImageResource(R.drawable.union)
            getDataBanding()!!.shopingBtn.setImageResource(R.drawable.shoping)
            getDataBanding()!!.notifBtn.setImageResource(R.drawable.notif)
            getDataBanding()!!.settingBtn.setImageResource(R.drawable.settings)
            getDataBanding()!!.addBtn.setImageResource(R.drawable.add)
        }
        if (position == 2) {
            getDataBanding()!!.homeBtn.setImageResource(R.drawable.home)
            getDataBanding()!!.searchBtn.setImageResource(R.drawable.search)
            getDataBanding()!!.unionBtn.setImageResource(R.drawable.heart_xl_pink)
            getDataBanding()!!.shopingBtn.setImageResource(R.drawable.shoping)
            getDataBanding()!!.notifBtn.setImageResource(R.drawable.notif)
            getDataBanding()!!.settingBtn.setImageResource(R.drawable.settings)
            getDataBanding()!!.addBtn.setImageResource(R.drawable.add)

        }
        if (position == 4) {
            getDataBanding()!!.homeBtn.setImageResource(R.drawable.home)
            getDataBanding()!!.searchBtn.setImageResource(R.drawable.search)
            getDataBanding()!!.unionBtn.setImageResource(R.drawable.union)
            getDataBanding()!!.shopingBtn.setImageResource(R.drawable.panier)
            getDataBanding()!!.notifBtn.setImageResource(R.drawable.notif)
            getDataBanding()!!.settingBtn.setImageResource(R.drawable.settings)
            getDataBanding()!!.addBtn.setImageResource(R.drawable.add)

        }
        if (position == 5) {
            getDataBanding()!!.homeBtn.setImageResource(R.drawable.home)
            getDataBanding()!!.searchBtn.setImageResource(R.drawable.search)
            getDataBanding()!!.unionBtn.setImageResource(R.drawable.union)
            getDataBanding()!!.shopingBtn.setImageResource(R.drawable.shoping)
            getDataBanding()!!.notifBtn.setImageResource(R.drawable.notif_pink)
            getDataBanding()!!.settingBtn.setImageResource(R.drawable.settings)
            getDataBanding()!!.addBtn.setImageResource(R.drawable.add)

        }
        if (position == 6) {
            getDataBanding()!!.homeBtn.setImageResource(R.drawable.home)
            getDataBanding()!!.searchBtn.setImageResource(R.drawable.search)
            getDataBanding()!!.unionBtn.setImageResource(R.drawable.union)
            getDataBanding()!!.shopingBtn.setImageResource(R.drawable.shoping)
            getDataBanding()!!.notifBtn.setImageResource(R.drawable.notif)
            getDataBanding()!!.settingBtn.setImageResource(R.drawable.settings_pink)
            getDataBanding()!!.addBtn.setImageResource(R.drawable.add)

        }
        if (position == 3) {
            getDataBanding()!!.homeBtn.setImageResource(R.drawable.home)
            getDataBanding()!!.searchBtn.setImageResource(R.drawable.search)
            getDataBanding()!!.unionBtn.setImageResource(R.drawable.union)
            getDataBanding()!!.shopingBtn.setImageResource(R.drawable.shoping)
            getDataBanding()!!.notifBtn.setImageResource(R.drawable.notif)
            getDataBanding()!!.settingBtn.setImageResource(R.drawable.settings)
            getDataBanding()!!.addBtn.setImageResource(R.drawable.add)

        }
    }

    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(MainViewModel::class.java)
        }
    }

    override fun init() {
        model.setNavigator(this)
        getDataBanding()?.viewModel = model
        adapter2 = FragmentAdapter(supportFragmentManager)
        getDataBanding()!!. viewPager.adapter = adapter2
        adapter2.notifyDataSetChanged()
        getDataBanding()!!. viewPager.offscreenPageLimit = 7

        getDataBanding()!!.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                changeTabs(position)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })


        getDataBanding()!!.viewPager.currentItem = 0
        getDataBanding()!!.homeBtn.setImageResource(R.drawable.home_pink)

    }

    override fun getLayoutId(): Int {
        return R.layout.main_activity
    }

    override fun navigateToHome() {
        getDataBanding()!!.viewPager.currentItem = 0
    }

    override fun navigateToSearch() {
        getDataBanding()!!.viewPager.currentItem = 1
    }

    override fun navigateToFavoris() {
        getDataBanding()!!.viewPager.currentItem = 2
    }

    override fun navigateToAdd() {
        getDataBanding()!!.viewPager.currentItem = 3
    }

    override fun navigateToPanier() {
        getDataBanding()!!.viewPager.currentItem = 4
    }

    override fun navigateToNotification() {
        getDataBanding()!!.viewPager.currentItem = 5

    }

    override fun navigateToSetting() {
        getDataBanding()!!.viewPager.currentItem = 6
    }


}