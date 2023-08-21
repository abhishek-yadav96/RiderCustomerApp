package com.ridercustomerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController


class ProfilesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profiles, container, false)
        val idcard=view.findViewById<ConstraintLayout>(R.id.mainlayout)
        val documentdetail=view.findViewById<ConstraintLayout>(R.id.secondlayout)
        val languageseeting=view.findViewById<ConstraintLayout>(R.id.sevenlayout)
        val performance=view.findViewById<ConstraintLayout>(R.id.fivelayout)
val image=view.findViewById<ImageView>(R.id.profileimage)
        idcard.setOnClickListener {
            it.findNavController().navigate(R.id.action_profilesFragment_to_profileidcardFragment)
        }

        documentdetail.setOnClickListener {
            it.findNavController().navigate(R.id.action_profilesFragment_to_documentDetailsFragment2)
        }

        image.setOnClickListener {
            it.findNavController().navigate(R.id.action_profilesFragment_to_profileFragment)
        }
        languageseeting.setOnClickListener {
            it.findNavController().navigate(R.id.action_profilesFragment_to_languageSettingFragment)
        }
        performance.setOnClickListener {
            it.findNavController().navigate(R.id.action_profilesFragment_to_myPerformanceFragment)
        }


        return view
    }

}