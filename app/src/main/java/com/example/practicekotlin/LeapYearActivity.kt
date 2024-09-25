package com.example.practicekotlin

import android.os.Bundle
import android.provider.MediaStore.Images
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class LeapYearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_leap_year)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val txtLeapYear = findViewById<EditText>(R.id.txtLeapYear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val btnSubmit = findViewById<Button>(R.id.btnSubmitLeapYear)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnSubmit.setOnClickListener {

            val text = txtLeapYear.text.toString()
            val year = text.toInt()

             if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                txtResult.text = "$year is Leap Year"
            } else {
                 txtResult.text = "$year It is not Leap Year"
            }
        }

        btnClear.setOnClickListener {
            txtResult.text = ""
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}



