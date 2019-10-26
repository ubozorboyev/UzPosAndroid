package com.example.uzposandroid.users.adapters


import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uzposandroid.R
import com.example.uzposandroid.users.models.CategoryItemData
import kotlinx.android.synthetic.main.item_category_product.view.*

class CategoryFragmentAdapter (val data:ArrayList<CategoryItemData>):RecyclerView.Adapter<CategoryFragmentAdapter.ViewHolder>(){
private var listener:((CategoryItemData)->Unit)?=null


    fun SetOnItemClickListener(ls:(CategoryItemData)->Unit){
        listener=ls
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= ViewHolder(
        parent.inlater(R.layout.item_category_product)
    )

    override fun getItemCount(): Int =data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind()

    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){

        init {
            itemView.apply {
                if (adapterPosition!=-1){
                    product_type.text=data[adapterPosition].type
                    product_data.text=data[adapterPosition].data
                }
            }
        }

        fun bind(){
            itemView.setOnClickListener {
                listener?.invoke(data[adapterPosition])
            }
        }


    }

}