package com.yousfi.hayatiineApp.ui.intro.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.media.AudioManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.ObservableArrayList
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.data.entities.Screen


class SlideImageAdapter(
    private val context: Context,
    private var screenList: ArrayList<Screen>
) :
    PagerAdapter() {
    private var layoutInflater: LayoutInflater? = null
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return screenList.size
    }

    lateinit var videoURL: String
    lateinit var mAudioManager: AudioManager
    var current_volume = 0
    lateinit var soundManage: ImageView
    lateinit var videoConst: ConstraintLayout
    private val TAG = "SlideImageAdapter"

    @SuppressLint("InflateParams")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.custom_layout, null)
        val image = v.findViewById<View>(R.id.imageView) as ImageView
        val title = v.findViewById<View>(R.id.title) as TextView
      //  val desc = v.findViewById<View>(R.id.desc) as TextView
     //   Glide.with(v).load(Const.BASE_IMAGE_URL + adsList[position].imageUrl).into(image)
        image.setBackgroundResource(screenList[position].img!!)
        title.text = screenList[position].title
     //   desc.text = adsList[position].desc
        val vp = container as ViewPager
        vp.addView(v, 0)
        return v

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }



    fun setList(list: ObservableArrayList<Screen>) {

        list.add(Screen(R.drawable.cameraicon2x," Prenez une Photo Ajouter-La ", "Prenez une Photo Ajouter-La"))
        list.add(Screen(R.drawable.vente,"Vends sans frais","Vends sans frais"))
        screenList = list
        notifyDataSetChanged()
    }
}