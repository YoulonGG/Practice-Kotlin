package com.example.practicekotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Scope1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scope)

        val list = mutableListOf<Int>()

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnAdd = findViewById<Button>(R.id.btnAddScope)

        btnAdd.setOnClickListener {

            //Convert List of Int to String
            val listInt = list.joinToString(separator = ", ")

            Toast.makeText(this,listInt, Toast.LENGTH_SHORT).show()

        }.apply {
            list.add(1)
            list.add(2)
            list.add(3)
            list.add(4)
            list.add(5)
        }

        btnBack.setOnClickListener {
            finish()
        }

    }
}