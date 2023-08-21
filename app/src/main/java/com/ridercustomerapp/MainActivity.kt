package com.ridercustomerapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.transition.TransitionManager
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import me.ibrahimsn.lib.SmoothBottomBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navController = findNavController(R.id.activity_main_nav_host_fragment1)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNav1)
        bottomNavigationView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
//            TransitionManager.beginDelayedTransition(bottomNavigationView, Fade())
            if (destination.id == R.id.otpFragment) {
                bottomNavigationView.visibility = View.GONE
            }
              else if  (destination.id==R.id.rcVerificationFragment) {
                bottomNavigationView.visibility = View.GONE
            }
            else if  (destination.id==R.id.verificationFragment) {
                bottomNavigationView.visibility = View.GONE

            } else if  (destination.id==R.id.otpFragment) {
                bottomNavigationView.visibility = View.GONE
            }
            else if  (destination.id==R.id.aadhaarVerificationFragment) {
                bottomNavigationView.visibility = View.GONE
            }
            else if  (destination.id==R.id.profilesFragment) {
                bottomNavigationView.visibility = View.GONE
            }
            else if  (destination.id==R.id.panVerificationFragment) {
                bottomNavigationView.visibility = View.GONE
            }
            else if  (destination.id==R.id.profileFragment) {
                bottomNavigationView.visibility = View.GONE
            }
            else if  (destination.id==R.id.DLVerificationFragment) {
                bottomNavigationView.visibility = View.GONE
            }

            else if  (destination.id==R.id.liveOrderFragment) {
                bottomNavigationView.visibility = View.GONE
            }
             else {
                bottomNavigationView.visibility = View.VISIBLE
            }
        }


    }}
