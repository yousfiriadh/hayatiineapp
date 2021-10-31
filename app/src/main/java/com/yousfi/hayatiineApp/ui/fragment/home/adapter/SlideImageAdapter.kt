package com.yousfi.hayatiineApp.ui.fragment.home.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.ObservableArrayList
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.data.entities.ListImage
import kotlinx.android.synthetic.main.item_slider.view.*


class SlideImageAdapter(
    private val context: Context, private val imageList: ArrayList<Int>
) :
    PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_slider, container, false)
        view.itemSlide.setImageResource(imageList[position])
        container.addView(view)
        return view
    }

    override fun getCount(): Int {
        return imageList.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        (container as ViewPager).removeView(`object` as View)
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

}