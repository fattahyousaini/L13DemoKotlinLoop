package com.myapplicationdev.android.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnCount.setOnClickListener {
//            for (i in 1..5){
//                Log.d("MainActivity", "$i")
//            }
//        }

        btnCount.setOnClickListener {
            var i = 1
            while (i < 6) {
                Log.d("MainActivity", "$i")
                i++
            }
        }

        button2.setOnClickListener {
            val word = editTextTextPersonName.text.toString()

            for (letter in word) {
                Log.d("Mainactivity", "$letter")
            }
        }
    }
}