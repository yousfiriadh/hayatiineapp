package com.yousfi.hayatiine.ui.base

import android.annotation.TargetApi
import android.app.AlertDialog
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment


abstract class BaseFragment<T : ViewDataBinding> : Fragment() {
    private var mRootView: View? = null
    private lateinit var mViewDataBinding: T
    private lateinit var alertDialog: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setViewModel()

    }

    abstract fun setViewModel()
    abstract fun init()
    fun getViewDataBinding(): T {
        return mViewDataBinding
    }

    @TargetApi(Build.VERSION_CODES.M)
    fun hasPermission(permission: String): Boolean {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M || ContextCompat.checkSelfPermission(
            requireActivity().baseContext, permission
        ) == PackageManager.PERMISSION_GRANTED
    }

    @TargetApi(Build.VERSION_CODES.M)
    fun askPermission(permission: String, requestCode: Int) {
        if (!hasPermission(permission)) {

            requestPermissions(

                arrayOf(permission), requestCode
            );
        }

    }

    private fun performDataBinding() {}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        mViewDataBinding = DataBindingUtil.inflate<T>(inflater, getLayoutId(), container, false)
        mRootView = mViewDataBinding.root
        init()
        return mRootView
    }

    @LayoutRes
    abstract fun getLayoutId(): Int


//    @SuppressLint("InflateParams")
//    fun showLogoutDialog(context: Context) {
//        val view = LayoutInflater.from(context).inflate(R.layout.logout_dialog, null, false)
//        val alertDialogBuilder =
//            AlertDialog.Builder(context)
//        alertDialogBuilder.setView(view)
//        alertDialog = alertDialogBuilder.create()
//        alertDialog.show()
//        alertDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
////        alertDialog.window!!.setLayout(
////            WindowManager.LayoutParams.WRAP_CONTENT,
////            WindowManager.LayoutParams.WRAP_CONTENT
////        )
//    }

    private fun hideLogoutDialog() {
        alertDialog.dismiss()
    }
}