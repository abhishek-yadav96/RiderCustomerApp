package com.ridercustomerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController


class DocumentDetailsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_document_details, container, false)


        val rc = view.findViewById<ConstraintLayout>(R.id.mainlayout1)
        val driving=view.findViewById<ConstraintLayout>(R.id.mainlayout2)
        val adhar=view.findViewById<ConstraintLayout>(R.id.mainlayout3)
        val pan=view.findViewById<ConstraintLayout>(R.id.mainlayout4)

        rc.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_documentDetailsFragment_to_rcVerificationFragment)
        }

        driving.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_documentDetailsFragment_to_DLVerificationFragment)
        }

        adhar.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_documentDetailsFragment_to_aadhaarVerificationFragment)
        }
        pan.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_documentDetailsFragment_to_panVerificationFragment)
        }

        return view

    }
}
