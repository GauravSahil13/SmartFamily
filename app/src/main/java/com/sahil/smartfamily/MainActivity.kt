package com.sahil.smartfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inflateHomeFragment()

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav_bar)

        bottomNav.setOnItemSelectedListener {
            if(it.itemId==R.id.ic_security){
                inflateGuardFragment()
            }
            else if (it.itemId==R.id.ic_home){
                inflateHomeFragment()
            }
            else if (it.itemId==R.id.ic_dashboard){
                inflateDashboardFragment()
            }
            else if (it.itemId==R.id.ic_profile){
                inflateProfileFragment()
            }

            true
        }
    }

    private fun inflateGuardFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, Security_Fragment.newInstance())
        transaction.commit()

    }

    private fun inflateHomeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, Home_Fragment.newInstance())
        transaction.commit()

    }

    private fun inflateDashboardFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, Dashboard_Fragment.newInstance())
        transaction.commit()

    }

    private fun inflateProfileFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, Profile_Fragment.newInstance())
        transaction.commit()

    }
}