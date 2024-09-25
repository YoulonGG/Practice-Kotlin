package com.example.practicekotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

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
        val btnScopeFunction1 = findViewById<Button>(R.id.btnScopeFunction)
        val btnScopeFunction2 = findViewById<Button>(R.id.btnScopeFunction2)


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

        btnScopeFunction1.setOnClickListener {
            val intent = Intent(this, Scope1Activity::class.java)
            startActivity(intent)
        }

        btnScopeFunction2.setOnClickListener {
            val intent = Intent(this, Scope2Activity::class.java)
            startActivity(intent)
        }

    }
}