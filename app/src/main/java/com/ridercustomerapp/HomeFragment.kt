package com.ridercustomerapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class HomeFragment : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)




        val profile=view.findViewById<ImageView>(R.id.manimage)

        profile.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_profilesFragment)
        }
        val notification=view.findViewById<ImageView>(R.id.notificationimage)


        notification.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_liveOrderFragment)

        }

        return view

    }
}