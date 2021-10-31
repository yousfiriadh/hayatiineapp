package com.yousfi.hayatiineApp.ui.fragment.setting

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiine.ui.base.BaseFragment
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.SettingFragmentBinding
import com.yousfi.hayatiineApp.ui.fragment.add.AddViewModel

class SettingFragment : BaseFragment<SettingFragmentBinding>() {
    lateinit var model: SettingViewModel
    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(SettingViewModel::class.java)
        }
    }

    override fun init() {
        getViewDataBinding()?.viewModel = model
    }

    override fun getLayoutId(): Int {
        return R.layout.setting_fragment
    }


}