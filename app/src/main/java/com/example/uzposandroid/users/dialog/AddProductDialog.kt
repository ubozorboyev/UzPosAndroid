package com.example.uzposandroid.users.dialog

import android.content.Context
import android.view.View
import com.example.uzposandroid.R
import kotlinx.android.synthetic.main.dialog_item_page.view.*

class AddProductDialog(context: Context):BaseDialog(context, R.layout.dialog_item_page){


    override fun viewDialog(view: View) {

        dilog.setCancelable(false)
        view.apply {
            dialog_page_increase_btn.setOnClickListener {
                val count=dailog_page_editable_text.text.toString().toInt()+1
                dailog_page_editable_text.setText(count.toString())
            }

            dialog_page_decrease_btn.setOnClickListener {
                val count=dailog_page_editable_text.text.toString().toInt()-1
                if (count>0){
                    dailog_page_editable_text.setText(count.toString())
                }
            }

            dialog_page_basket_btn.setOnClickListener {
              dismissDialog()
            }

            close_dialog_button.setOnClickListener {
                dismissDialog()
            }

        }

    }


}
