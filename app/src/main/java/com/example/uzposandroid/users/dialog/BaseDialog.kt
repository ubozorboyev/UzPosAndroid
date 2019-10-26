package com.example.uzposandroid.users.dialog

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.LayoutRes

abstract class BaseDialog (context: Context, @LayoutRes val resId:Int){

    val dilog=AlertDialog.Builder(context).create()

    init {
        val view=LayoutInflater.from(context).inflate(resId,null)
        dilog.setView(view)
        viewDialog(view)
    }

    fun showDialog(){
        dilog.show()
    }

    fun dismissDialog(){
        dilog.dismiss()
    }

    abstract fun viewDialog(view: View)


}