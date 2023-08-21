package com.ridercustomerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DateAdapter (private val list:  ArrayList<String>): RecyclerView.Adapter<DateAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.transcition_details, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return  list.size
    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

    }

}

