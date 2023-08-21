package com.ridercustomerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController

class LanguageSettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_language_setting, container, false)

        val applanguage=view.findViewById<ConstraintLayout>(R.id.mainlayout1)

        applanguage.setOnClickListener {
            it.findNavController().navigate(R.id.action_languageSettingFragment_to_appLanguageFragment)
        }

        return view
    }


    }
