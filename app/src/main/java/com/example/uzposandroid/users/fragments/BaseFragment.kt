package com.example.uzposandroid.users.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(@LayoutRes val resId:Int) :Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(resId,null,true)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewApply(view)
    }

    abstract fun viewApply(view: View)

    fun startFragment(fragment: Fragment){
       val transaction=activity!!.supportFragmentManager.beginTransaction()
       transaction.add(fragment,fragment.toString()).commit()
    }

    fun finishFragment(){
     activity?.supportFragmentManager?.popBackStack()
    }


}