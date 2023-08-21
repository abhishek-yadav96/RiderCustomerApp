package com.ridercustomerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.findNavController


class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        val start=view.findViewById<AppCompatButton>(R.id.submit)

//        start.setOnClickListener {
//            it.findNavController().navigate(R.id.action_splashFragment_to_verificationFragment)
//        }
        return view

    }

}