package com.yousfi.hayatiineApp.ui.fragment.mesCommandes.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.yousfi.hayatiineApp.ui.materialVerticalStepper.StepperFragment

import com.yousfi.hayatiineApp.R
import kotlinx.android.synthetic.main.fragment2.*


class Fragment2 : StepperFragment() {
    override fun checkFieldsValidation(): Boolean {
        return if (et_address.text.isNotEmpty()){
            true
        }else{
            Toast.makeText(context,"please enter address", Toast.LENGTH_SHORT).show()
            false
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment2, container, false)
    }

}
