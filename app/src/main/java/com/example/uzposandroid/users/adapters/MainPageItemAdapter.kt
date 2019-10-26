package com.example.uzposandroid.users.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.example.uzposandroid.R
import com.example.uzposandroid.users.models.ProductItemData
import kotlinx.android.synthetic.main.item_line_home_page.view.*

class MainPageItemAdapter (val data:ArrayList<ProductItemData>):RecyclerView.Adapter<MainPageItemAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inlater(R.layout.item_line_home_page))
    }

    override fun getItemCount(): Int =data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =holder.bind()

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){

        fun bind(){
            itemView.apply {
                product_number_id.text=(1+adapterPosition).toString()

                product_amount_plus_id.setOnClickListener {
                    val cout=product_amount_text.text.toString().toInt()+1
                    product_amount_text.setText(cout.toString())
                }

                product_amount_minus_id.setOnClickListener {
                    val cout=product_amount_text.text.toString().toInt()-1
                    if (cout>0){
                        product_amount_text.setText(cout.toString())
                    }
                }

                product_clearBtn_id.setOnClickListener {
                    data.removeAt(adapterPosition)
                    notifyItemRemoved(adapterPosition)
                }

            }
        }
    }

}
fun ViewGroup.inlater(@LayoutRes resId:Int)=LayoutInflater.from(this.context).inflate(resId,this,false)