package com.test.scrollview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.scrollview.databinding.ListitemBinding

class Adapter(
    private val items: ArrayList<listData>,
    private val context: Context,
) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ListitemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position], context)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(private val view: ListitemBinding) :
        RecyclerView.ViewHolder(view.root) {
        fun bind(
            item: listData,
            context: Context,
        ) {

        }
    }

    interface OnItemListener {
        fun onItemBtn(item: listData)
    }


}