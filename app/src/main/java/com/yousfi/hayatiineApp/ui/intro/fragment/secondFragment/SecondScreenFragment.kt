package com.yousfi.hayatiineApp.ui.intro.fragment.secondFragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiine.ui.base.BaseFragment
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.FragmentSecondScreenBinding
import kotlinx.android.synthetic.main.fragment_second_screen.view.*


class SecondScreenFragment : BaseFragment<FragmentSecondScreenBinding>() {
    private lateinit var model: SecondScreenViewModel
 /*   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      *//*  Handler().postDelayed({
            findNavController().navigate(R.id.action_viewPagerFragment_to_loginFragment)
        },1000)*//*
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_second_screen, container, false)

        view.passer_tv.setOnClickListener {
            (context as IntroActivity).toLogin()
            onBoardingFinished()
        }
        return view
    }*/

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

    override fun setViewModel() {
        model = activity.run {
            ViewModelProviders.of(this!!).get(SecondScreenViewModel::class.java)
        }
    }

    override fun init() {
       /* view.passer_tv.setOnClickListener {
            (context as IntroActivity).toLogin()
            onBoardingFinished()
        }*/
    }

    override fun getLayoutId(): Int {
      return  R.layout.fragment_second_screen
    }

}
