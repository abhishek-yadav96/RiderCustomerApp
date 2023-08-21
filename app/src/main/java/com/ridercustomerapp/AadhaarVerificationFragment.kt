package com.ridercustomerapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class AadhaarVerificationFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_aadhaar_verification, container, false)
        val submit=view.findViewById<AppCompatButton>(R.id.submit)
        val nameadhar=view.findViewById<EditText>(R.id.panverfication)
        val adharno=view.findViewById<EditText>(R.id.panverficationnumber)
//        val camera=view.findViewById<ImageView>(R.id.upimimage1)
//
//      }  camera.setOnClickListener {
//            camera.setOnClickListener {
//                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE)
//                startActivityForResult(cameraIntent, 1)
//
//            }
//
//        }
//
//
//
//        submit.setOnClickListener {
//            if ( nameadhar.text.toString().trim().isEmpty()){
//                Toast.makeText(requireContext(),"ENTER NAME ON AADHAR CARD",Toast.LENGTH_SHORT).show();
//            }else if(adharno.text.toString().trim().isEmpty()){
//                Toast.makeText(requireContext(),"ENTER AADHAR NO",Toast.LENGTH_SHORT).show();
//
//            }
//
//
//        }
//
        return view
//    }


    }}
