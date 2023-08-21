package com.ridercustomerapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.findNavController


class VerificationFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_verification, container, false)

        val verify=view.findViewById<AppCompatButton>(R.id.verify_button1)
        verify.setOnClickListener {
            it.findNavController().navigate(R.id.action_verificationFragment_to_otpFragment)
        }
        return view

    }

}
