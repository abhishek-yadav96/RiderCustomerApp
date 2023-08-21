package com.ridercustomerapp

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import java.text.DateFormatSymbols
import java.util.*


class IncentiveFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_incentive, container, false)

//        val year= resources.getStringArray(R.array.year)
//        val month=resources.getStringArray(R.array.month)
//
//        val autocompleteTV = view.findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
//        val autocompleteTV1 = view.findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView1)
//
//        val arrayAdapter = ArrayAdapter(requireActivity(), R.layout.year_item_list,R.id.textinput_counter, year)
//        val arrayAdapter1 = ArrayAdapter(requireActivity(), R.layout.month_item_list,R.id.textinput_counter1, month)
//
//        autocompleteTV.setAdapter(arrayAdapter)
//        autocompleteTV1.setAdapter(arrayAdapter1)
        return view


    }
        }