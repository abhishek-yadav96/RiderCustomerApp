package com.ridercustomerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.bottomsheet.BottomSheetDialog


class AddressFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_address, container, false)

        val cancel=view.findViewById<AppCompatButton>(R.id.cancel_button)

        cancel.setOnClickListener {
            val dialog = BottomSheetDialog(requireActivity())
            val view = layoutInflater.inflate(R.layout.delevery_details, null)

            dialog.setCancelable(true)
            dialog.setContentView(view)
            dialog.show()
        }

        return view
    }
}
