package com.yousfi.hayatiineApp.ui.fragment.home

import android.graphics.Color
import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiine.ui.base.BaseFragment
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.HomeFragmentBinding
import com.yousfi.hayatiineApp.ui.customView.constants.PagerItemType
import com.yousfi.hayatiineApp.ui.fragment.home.adapter.SlideImageAdapter
import org.jetbrains.anko.backgroundColor

class HomeFragment : BaseFragment<HomeFragmentBinding>(),HomeNavigator{
    lateinit var model: HomeViewModel
    private val imageList: ArrayList<Int> = arrayListOf()


    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        }
    }

    override fun init() {
        model.setNavigator(this)
        getViewDataBinding()?.viewModel = model
        imageList.add(R.drawable.images4)
        imageList.add(R.drawable.images3)
        imageList.add(R.drawable.images4)
        imageList.add(R.drawable.images3)
        imageList.add(R.drawable.images6)

        val pageAdapter = SlideImageAdapter(this.requireContext(), imageList)

        getViewDataBinding().mainViewPager.adapter = pageAdapter
        getViewDataBinding(). mainViewPager.setClipToPadding(false)
        // set padding manually, the more you set the padding the more you see of prev & next page
        getViewDataBinding().mainViewPager.setPadding(0, 0, 50, 0)
        // sets a margin b/w individual pages to ensure that there is a gap b/w them
        getViewDataBinding().mainViewPager.setPageMargin(20)
        getViewDataBinding().dotsIndicator.itemsCount = imageList.size
        getViewDataBinding().dotsIndicator.visibility = View.VISIBLE


        getViewDataBinding().dotsIndicator.itemType = PagerItemType.RECTANGLE
        getViewDataBinding(). dotsIndicator.itemSelectedColors = arrayListOf(
            Color.parseColor("#31908c"), Color.parseColor("#31908c")
        )
        getViewDataBinding().dotsIndicator.itemsUnselectedColors = arrayListOf(
            Color.parseColor("#F3F4F4"), Color.parseColor("#F3F4F4")
        )
        getViewDataBinding().dotsIndicator.itemElevation = 2
        getViewDataBinding().dotsIndicator.itemWidth = 30
        getViewDataBinding().dotsIndicator.itemHeight = 8
        getViewDataBinding().dotsIndicator.itemMargin = 4
        getViewDataBinding().dotsIndicator.backgroundColor = Color.TRANSPARENT



    }

    override fun getLayoutId(): Int {
        return R.layout.home_fragment
    }


}