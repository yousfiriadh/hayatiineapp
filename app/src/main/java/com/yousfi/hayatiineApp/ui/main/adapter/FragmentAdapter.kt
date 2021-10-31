package com.yousfi.hayatiineApp.ui.main.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.yousfi.hayatiineApp.ui.fragment.search.SearchFragment
import com.yousfi.hayatiineApp.ui.fragment.add.AddFragment
import com.yousfi.hayatiineApp.ui.fragment.favoris.FavorisFragment
import com.yousfi.hayatiineApp.ui.fragment.home.HomeFragment
import com.yousfi.hayatiineApp.ui.fragment.mesCommandes.mesCommandesFragment
import com.yousfi.hayatiineApp.ui.fragment.notification.NotificationFragment
import com.yousfi.hayatiineApp.ui.fragment.setting.SettingFragment


internal class FragmentAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                SearchFragment()
            }
            2 -> {
                FavorisFragment()

            }
            3 -> {
                AddFragment()
            }
            4 -> {
                mesCommandesFragment()
            }
            5 -> {
                NotificationFragment()
            }
            6 -> {
                SettingFragment()
            }
            else ->  HomeFragment()
        }
    }

    override fun getCount(): Int {

        return 7
    }

}