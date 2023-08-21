package com.ridercustomerapp

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.green


class RcVerificationFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_rc_verification, container, false)
        val licensephoto = view.findViewById<ImageView>(R.id.image1)
        licensephoto.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE)
            startActivityForResult(cameraIntent, 1)

        }
        return view

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            val photo: Bitmap = data?.extras?.get("data") as Bitmap
//            var ImageView = view?.findViewById<ImageView>(R.id.image_view)
//            ImageView?.setImageBitmap(photo)
//            var imageView = view?.findViewById<ImageView>(R.id.image1)
//            imageView?.visibility?.green

        }
    }
}







        
    




