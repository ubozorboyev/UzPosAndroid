package com.example.uzposandroid.users.fragments

import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uzposandroid.R
import com.example.uzposandroid.users.adapters.MainPageItemAdapter
import com.example.uzposandroid.users.models.ProductItemData
import kotlinx.android.synthetic.main.fragment_main_page.view.*

class MainPageFragment :BaseFragment(R.layout.fragment_main_page){
private lateinit var adapter: MainPageItemAdapter
private val data=ArrayList<ProductItemData>()

    override fun viewApply(view: View) {

        loadView()
        replaceFragment(CategoryFragment())
        adapter= MainPageItemAdapter(data)

        view.apply {
            productsRecyclerView.adapter=adapter
            productsRecyclerView.layoutManager=LinearLayoutManager(activity?.applicationContext)
            clear_all.setOnClickListener {
                data.clear()
                adapter.notifyDataSetChanged()
            }

            }
    }

    fun loadView(){
        for (i in 1..100){
         data.add(ProductItemData("Coca-Cola$i",i,"code$i","pisce$i",i,i.toDouble()))
        }
    }

    fun replaceFragment(fragment: Fragment){
        fragmentManager?.beginTransaction()?.add(R.id.fragmentContainer,fragment)?.commit()
    }

}