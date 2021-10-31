package com.yousfi.hayatiineApp.ui.intro.fragment.firstFragment

import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.yousfi.hayatiine.ui.base.BaseFragment
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.FragmentFirstScreenBinding
import com.yousfi.hayatiineApp.ui.intro.IntoViewModel
import kotlinx.android.synthetic.main.fragment_first__screen.view.*


class FirstScreenFragment : BaseFragment<FragmentFirstScreenBinding>() {
    private lateinit var model: FirstScreenViewModel
/*
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_first__screen, container, false)

        val viewPager = activity?.findViewById<ViewPager>(R.id.viewpager)


        view.textView2.setOnClickListener {
            viewPager?.currentItem=1
            (context as IntroActivity).toLogin()
        }
        return view
    }*/

    override fun setViewModel() {
        model = activity.run {
            ViewModelProviders.of(this!!).get(FirstScreenViewModel::class.java)
        }
    }

    override fun init() {
       // val viewPager = activity?.findViewById<ViewPager>(R.id.viewpager)
       /* getViewDataBinding().textView2.setOnClickListener {
            viewPager?.currentItem=1
            (context as IntroActivity).toLogin()
        }*/
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_first__screen
    }


}
