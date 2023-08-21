package com.ridercustomerapp

import android.app.DatePickerDialog
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class WalletPassbookFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_wallet_passbook2, container, false)

        val toclick=view.findViewById<TextView>(R.id.from_month_txt)
        val textView1=view.findViewById<TextView>(R.id.from_month_txt)

        val click=view.findViewById<TextView>(R.id.to_txt)
        val textView=view.findViewById<TextView>(R.id.to_txt)




        val data = ArrayList<String>()

        for (item in 1..50) {
            data.add("gkgjffgh")
        }

        val recyclerview = view.findViewById<RecyclerView>(R.id.recycleview)
        val adapter = DateAdapter(data)
        recyclerview.adapter = adapter


//for from
        click.setOnClickListener {

            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)


            val datePickerDialog = DatePickerDialog(

                requireActivity(),
                { view, year, monthOfYear, dayOfMonth ->

                    textView.text =
                        (dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year)
                },

                year,
                month,
                day
            )

            datePickerDialog.show()
        }




//for to

        toclick.setOnClickListener {

            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)


            val datePickerDialog = DatePickerDialog(

                requireActivity(),
                { view, year, monthOfYear, dayOfMonth ->

                    textView1.text =
                        (dayOfMonth.toString() + "-" + (monthOfYear + 1) + "-" + year)
                },

                year,
                month,
                day
            )

            datePickerDialog.show()
        }

        return view
    }
}