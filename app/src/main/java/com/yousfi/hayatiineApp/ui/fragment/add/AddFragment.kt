package com.yousfi.hayatiineApp.ui.fragment.add

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiine.ui.base.BaseFragment
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.AddFragmentBinding
import com.yousfi.hayatiineApp.ui.fragment.home.HomeViewModel

class AddFragment : BaseFragment<AddFragmentBinding> (){
    lateinit var model: AddViewModel
    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(AddViewModel::class.java)
        }
    }

    override fun init() {
        getViewDataBinding()?.viewModel = model
    }

    override fun getLayoutId(): Int {
        return R.layout.add_fragment
    }


}