package com.example.practicekotlin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //1. Array Manipulation
        val arrayString = ArrayList<String>()
        arrayString.add("Apple")
        arrayString.add("Orange")
        arrayString.add("Watermelon")
        fun getLength(arr: ArrayList<String>): Int {
            return arr.size
        }
//        Log.e("","The size of Array String is : ${getLength(arrayString)}")


        val btnLeapYear = findViewById<Button>(R.id.btnLeapYear)
        val btnTestResult = findViewById<Button>(R.id.btnTestResult)
        val btnCarFunction = findViewById<Button>(R.id.btnCarFunction)
        val btnScopeFunction = findViewById<Button>(R.id.btnScopeFunction)


        btnLeapYear.setOnClickListener {
            val intent = Intent(this, LeapYearActivity::class.java)
            startActivity(intent)
        }

        btnTestResult.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }

        btnCarFunction.setOnClickListener {
            val intent = Intent(this, CarActivity::class.java)
            startActivity(intent)
        }

        btnScopeFunction.setOnClickListener {
            val intent = Intent(this, ScopeActivity::class.java)
            startActivity(intent)
        }
    }
}