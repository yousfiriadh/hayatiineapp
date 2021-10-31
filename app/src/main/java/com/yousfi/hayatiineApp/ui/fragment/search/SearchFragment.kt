package com.yousfi.hayatiineApp.ui.fragment.search

import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiine.ui.base.BaseFragment
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.SearchFragmentBinding
import com.yousfi.hayatiineApp.ui.fragment.add.AddViewModel

class SearchFragment : BaseFragment<SearchFragmentBinding>(){
    lateinit var model: SearchViewModel
    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(SearchViewModel::class.java)
        }
    }

    override fun init() {
        getViewDataBinding()?.viewModel = model
    }

    override fun getLayoutId(): Int {
       return R.layout.search_fragment
    }


}