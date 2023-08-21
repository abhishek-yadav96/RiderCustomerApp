package com.ridercustomerapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.findNavController


class OtpFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_otp, container, false)
        val textview=view.findViewById<TextView>(R.id.timer_txt)



        object : CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                textview.setText("" + millisUntilFinished / 1000)

            }
            override fun onFinish() {
                textview.setText("02:34")
            }
        }.start()

//        val otp=view.findViewById<AppCompatButton>(R.id.otp)

//        otp.setOnClickListener {
//            it.findNavController().navigate(R.id.action_otpFragment_to_homeFragment)
//        }
        return view

    }

}