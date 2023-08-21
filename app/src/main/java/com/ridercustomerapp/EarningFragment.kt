package com.ridercustomerapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EarningFragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_earning, container, false)


        val data = ArrayList<String>()

        for (item in 1..50) {
            data.add("gkgjffgh")
        }

        val recyclerview = view.findViewById<RecyclerView>(R.id.recycleview)
        val adapter = EarningAdapter(data)
        recyclerview.adapter = adapter

        return view
    }
}