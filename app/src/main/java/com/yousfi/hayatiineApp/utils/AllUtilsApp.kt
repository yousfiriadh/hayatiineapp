package com.yousfi.hayatiineApp.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.yousfi.hayatiineApp.R

class AllUtilsApp {
    companion object{
        fun toOtherActivityData(
            from: Activity,
            context: Context,
            to: Any,
            data: Int
        ) {
            from.startActivityForResult(
                Intent(context, to as Class<Object>).putExtra(
                    "data", data
                ), 0
            )
        }
        fun toOtherActivity(
            from: Activity,
            context: Context,
            to: Any
        ) {
            from.startActivity(Intent(context, to as Class<Object>))
        }
        fun navigateToActivity(
            activity: Activity,
            start: Context,
            destination: Any
        ) {
            activity.startActivity(Intent(start, destination as Class<Object>))

        }
    }
}