package com.lkdont.bottomdrawerdemo

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * 列表数据适配器
 *
 * Created by kidonliang on 2017/8/6.
 */

class ItemAdapter(val context: Context) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView = view.findViewById(R.id.itemTv) as TextView
    }

    override fun getItemCount(): Int {
        return 100
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ItemViewHolder?, position: Int) {
        holder?.textView?.text = "item $position"
        holder?.textView?.setOnClickListener {
            Log.i("TestAct", "item click : $position")
        }
    }
}