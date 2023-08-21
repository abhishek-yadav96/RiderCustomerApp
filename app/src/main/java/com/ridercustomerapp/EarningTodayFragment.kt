package com.ridercustomerapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class EarningTodayFragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_earning_today, container, false)
        val data = ArrayList<String>()

        for (item in 1..50) {
            data.add("gkgjffgh")
        }

        val recyclerview = view.findViewById<RecyclerView>(R.id.recycleview)
        val adapter = EarnsAdopters(data)
        recyclerview.adapter = adapter
        return view
    }

}