package com.example.fragment_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fragmentOne: Fragment_One
        var fragmentTwo: Fragment_two
        var fragmentThree: Fragment_three

        val btn1: Button= findViewById(R.id.btn1)
        val btn2: Button= findViewById(R.id.btn2)
        val btn3: Button= findViewById(R.id.btn3)

        btn1.setOnClickListener {
            replaceFragment(Fragment_One())
        }
        btn2.setOnClickListener {
            replaceFragment(Fragment_two())
        }
        btn3.setOnClickListener {
            replaceFragment(Fragment_three())
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}