package com.yousfi.hayatiineApp.ui.fragment.notification

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiine.ui.base.BaseFragment
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.NotificationFragmentBinding
import com.yousfi.hayatiineApp.ui.fragment.add.AddViewModel

class NotificationFragment :BaseFragment<NotificationFragmentBinding>() {
    lateinit var model: NotificationViewModel
    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(NotificationViewModel::class.java)
        }
    }

    override fun init() {
        getViewDataBinding()?.viewModel = model
    }

    override fun getLayoutId(): Int {
      return R.layout.notification_fragment
    }


}