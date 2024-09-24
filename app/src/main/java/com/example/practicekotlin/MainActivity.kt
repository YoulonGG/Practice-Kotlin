package com.example.practicekotlin

import android.os.Bundle
import android.util.Log
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
        Log.e("","The size of Array String is : ${getLength(arrayString)}")


        //2. Conditional Logic
//        fun checkLeapYear(year: Int): Boolean {
//            if (year % 4 == 0){
//                if (year % 100 == 0) {
//                    if (year % 400 ==0) {
//                        return true
//                    } else return false
//                } else return false
//            }else return false
//        }



    }
}