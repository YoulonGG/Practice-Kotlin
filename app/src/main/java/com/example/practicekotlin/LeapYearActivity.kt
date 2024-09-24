package com.example.practicekotlin

import android.os.Bundle
import android.provider.MediaStore.Images
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LeapYearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_leap_year)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val txtLeapYear = findViewById<EditText>(R.id.txtLeapYear)
        val txtResult = findViewById<EditText>(R.id.txtResult)
        val btnSubmit = findViewById<Button>(R.id.btnSubmitLeapYear) // Changed to Button

        btnSubmit.setOnClickListener {
            val yearInput = txtLeapYear.text.toString()

        }
    }
}

//        fun checkLeapYear(year: Int): Boolean {
//            if (year % 4 == 0){
//                if (year % 100 == 0) {
//                    if (year % 400 ==0) {
//                        return true
//                    } else return false
//                } else return false
//            }else return false
//        }

//        btnBack.setOnClickListener {
//            finish()
//        }