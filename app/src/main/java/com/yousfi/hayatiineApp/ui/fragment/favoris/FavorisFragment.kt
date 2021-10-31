package com.yousfi.hayatiineApp.ui.fragment.favoris

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiine.ui.base.BaseFragment
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.FavorisFragmentBinding
import com.yousfi.hayatiineApp.ui.fragment.add.AddViewModel

class FavorisFragment : BaseFragment<FavorisFragmentBinding>() {
    lateinit var model: FavorisViewModel





    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(FavorisViewModel::class.java)
        }
    }

    override fun init() {
        getViewDataBinding()?.viewModel = model
    }

    override fun getLayoutId(): Int {
        return R.layout.favoris_fragment
    }


}