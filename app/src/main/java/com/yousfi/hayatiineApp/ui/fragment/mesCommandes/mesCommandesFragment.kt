package com.yousfi.hayatiineApp.ui.fragment.mesCommandes

import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.yousfi.hayatiineApp.ui.materialVerticalStepper.VerticalItem
import com.yousfi.hayatiine.ui.base.BaseFragment
import com.yousfi.hayatiineApp.R
import com.yousfi.hayatiineApp.databinding.MesCommandesFragmentBinding
import com.yousfi.hayatiineApp.ui.fragment.mesCommandes.fragment.Fragment1
import com.yousfi.hayatiineApp.ui.fragment.mesCommandes.fragment.Fragment2
import com.yousfi.hayatiineApp.ui.fragment.mesCommandes.fragment.Fragment3
import kotlinx.android.synthetic.main.mes_commandes_fragment.*


class mesCommandesFragment : BaseFragment<MesCommandesFragmentBinding>(),MesComandesNavigator {
    lateinit var model: MesCommandesViewModel


    override fun setViewModel() {
        model = run {
            ViewModelProviders.of(this).get(MesCommandesViewModel::class.java)
        }
    }

    override fun init() {
        model.setNavigator(this)
        getViewDataBinding()?.viewModel = model

        val stepList = mutableListOf<VerticalItem>()

        stepList.add(0, VerticalItem("En anttente de confirmation ", "1", Fragment1()) )
        stepList.add(1, VerticalItem("Confirmé", "2", Fragment2()) )
        stepList.add(2, VerticalItem("Envoyé", "3", Fragment3()) )

        getViewDataBinding().stepper.setStepperStepList(stepList,getChildFragmentManager() )
        getViewDataBinding().stepper.setButtonText("next", "prev", "finish")
        getViewDataBinding().stepper.setButtonColor(R.color.colorPrimary, R.color.colorAccent)

    }

    override fun getLayoutId(): Int {
       return R.layout.mes_commandes_fragment
    }

    override fun onMenuClick() {
            //getViewDataBinding()!!.tvInfo.setBackgroundResource(R.drawable.custom_plus_info)
        getViewDataBinding()!!.tvInfo.visibility=View.GONE
        getViewDataBinding()!!.tvInfo1.visibility=View.VISIBLE
        getViewDataBinding()!!.layoutDetail.visibility=View.VISIBLE
        Toast.makeText(context, "Expanded!", Toast.LENGTH_SHORT).show()

    }

    override fun onHideMenuClick() {
        getViewDataBinding()!!.tvInfo.visibility=View.VISIBLE
        getViewDataBinding()!!.tvInfo1.visibility=View.GONE
        getViewDataBinding()!!.layoutDetail.visibility=View.GONE
        Toast.makeText(context, "Expanded!", Toast.LENGTH_SHORT).show()
    }

}