package com.yousfi.hayatiineApp.ui.base

import android.annotation.TargetApi
import android.app.AlertDialog
import android.app.Dialog
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.*
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.yousfi.hayatiineApp.R
import io.paperdb.Paper


abstract class BaseActivity<D : ViewDataBinding> : AppCompatActivity() {
    private var dataBinding: D? = null
    private val TAG = "BaseActivity"
    var mInternetDialog: AlertDialog? = null
    private var WIFI_ENABLE_REQUEST = 0x1006
    var dialogLoadingProgress: Dialog? = null
    var dialogRateDilevery: Dialog? = null

    var isConnected: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        LanguageSettings.setLanguage(this, LanguageSettings.getLanguage())
        registerReceiver(
            mNetworkDetectReceiver,
            IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        )
//        dialogLoadingProgress = Dialog(this)
//        dialogLoadingProgress!!.setCancelable(false)
//        dialogLoadingProgress!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        dialogLoadingProgress!!.setContentView(R.layout.dialog_progress)
 //       Paper.init(this)
        performDataBinding()
        setViewModel()
        init()

    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(mNetworkDetectReceiver)

    }

    fun disableUserInteraction() {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE
        )
    }

    fun enableUserInteraction() {
        window.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }

    abstract fun setViewModel()

    abstract fun init()

    private fun performDataBinding() {
        dataBinding = DataBindingUtil.setContentView(this, getLayoutId());
    }


    @LayoutRes
    abstract fun getLayoutId(): Int


    @TargetApi(Build.VERSION_CODES.M)
    fun hasPermission(permission: String): Boolean {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M || ContextCompat.checkSelfPermission(
            baseContext,
            permission
        ) == PackageManager.PERMISSION_GRANTED
    }

    @TargetApi(Build.VERSION_CODES.M)
    fun askPermission(permission: String, requestCode: Int) {
        if (!hasPermission(permission)) {
            ActivityCompat
                .requestPermissions(
                    this,
                    arrayOf(permission),
                    requestCode
                )
        }

    }


    fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(
                view.windowToken,
                0
            )
        }
    }

    fun setFragmentWithBack(id: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction().addToBackStack(null).replace(id, fragment)
            .commit()
    }

    fun setFragment(id: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(id, fragment).commit()
    }


    fun getDataBanding(): D? = dataBinding
    fun restart() {
        finish()
        startActivity(intent)
    }


    private fun checkInternetConnection() {
        val manager: ConnectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = manager.activeNetworkInfo

        if (networkInfo != null && networkInfo.state === NetworkInfo.State.CONNECTED) {
            isConnected = true

//            startActivity(Intent.makeRestartActivityTask(this.intent.component))

            Log.e(TAG, "checkInternetConnection: $isConnected")
//            showNoConnectionSnackBar("Connected", isConnected, 1500)
        } else {
            Log.e(TAG, "checkInternetConnection: $isConnected")
            isConnected = false
//            showNoInternetDialog()
//            showNoConnectionSnackBar(
//                "No active Internet connection found.",
//                isConnected,
//                5000
//            )
        }
    }

    private val mNetworkDetectReceiver: BroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            checkInternetConnection()
            Log.e(TAG, "onReceive: 1")

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == WIFI_ENABLE_REQUEST) {
            Log.e(TAG, "INTERNET: wv wdvadsv dsav adsds adsa a")
        }
    }


//    private fun showNoConnectionSnackBar(message: String, isConnected: Boolean, duration: Int) {
//        var snackbar = Snackbar.make(
//            findViewById(android.R.id.content),
//            message, duration
//        )
//        val sbView: View = snackbar.view
//        val textView: TextView = sbView
//            .findViewById(R.id.snackbar_text) as TextView
//        textView.setTextColor(ContextCompat.getColor(this, android.R.color.white))
//        if (!isConnected) {
////            sbView.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
//
//            sbView.setBackgroundColor(resources.getColor(R.color.red_clair))
//            snackbar.setAction(getString(R.string.try_again)) {
//                val internetOptionsIntent =
//                    Intent(Settings.ACTION_WIFI_SETTINGS)
//                startActivityForResult(
//                    internetOptionsIntent,
//                    WIFI_ENABLE_REQUEST
//                )
//            }
//            snackbar.setActionTextColor(resources.getColor(R.color.white))
//        }
//        snackbar.show()
//    }
//    fun showProgressLoadingDialog() {
//        val view = LayoutInflater.from(this)
//            .inflate(R.layout.dialog_progress, null, false)
//        val alertDialogBuilder = AlertDialog.Builder(this,R.style.CustomDialog)
//        alertDialogBuilder.setView(view)
//        dialogLoadingProgress = alertDialogBuilder.create()
//        dialogLoadingProgress!!.setCanceledOnTouchOutside(false)
//        dialogLoadingProgress!!.setCancelable(false)
//        dialogLoadingProgress!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        dialogLoadingProgress!!.show()
//        dialogLoadingProgress!!.window!!.setLayout(
//            WindowManager.LayoutParams.WRAP_CONTENT,
//            WindowManager.LayoutParams.WRAP_CONTENT
//        )
//    }


    fun hideProgressLoadingDialog() {
        try {
            (dialogLoadingProgress as AlertDialog?)!!.dismiss()
        }catch (e :Exception){
            Log.e(TAG, "hideProgressLoadingDialog: $e" )
        }
    }

//    fun showRateDelivery() {
//        val view = LayoutInflater.from(this)
//            .inflate(R.layout.rate_immediate_request, null, false)
//        val alertDialogBuilder = AlertDialog.Builder(this,R.style.CustomDialog)
//        alertDialogBuilder.setView(view)
//        dialogRateDilevery = alertDialogBuilder.create()
//        dialogRateDilevery!!.setCanceledOnTouchOutside(false)
//        dialogRateDilevery!!.setCancelable(false)
//        dialogRateDilevery!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//        dialogRateDilevery!!.show()
//        dialogRateDilevery!!.window!!.setLayout(
//            WindowManager.LayoutParams.MATCH_PARENT,
//            WindowManager.LayoutParams.WRAP_CONTENT
//        )
//        dialogRateDilevery!!.window!!.setGravity(Gravity.BOTTOM)
//    }

}