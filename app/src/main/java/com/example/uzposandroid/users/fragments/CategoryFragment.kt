package com.example.uzposandroid.users.fragments

import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.uzposandroid.R
import com.example.uzposandroid.users.adapters.CategoryFragmentAdapter
import com.example.uzposandroid.users.dialog.AddProductDialog
import com.example.uzposandroid.users.models.CategoryItemData
import kotlinx.android.synthetic.main.fragment_category.*

class CategoryFragment :BaseFragment(R.layout.fragment_category){
private val data=ArrayList<CategoryItemData>()
private  val adapter: CategoryFragmentAdapter =CategoryFragmentAdapter(data )

    init {
        loadData()
    }

    override fun viewApply(view: View) {
        recylviewt_category.adapter=adapter
        recylviewt_category.layoutManager=GridLayoutManager(context,4)

        adapter.SetOnItemClickListener {
            val dialog=AddProductDialog(context!!)
            dialog.showDialog()
        }

    }

    fun loadData(){
        for(i in 1..100){
        data.add(CategoryItemData(0,"Type","noiasv asnvksjv saknvksj askljvnskl salkjnvskjvnf"))
        }
    }


}