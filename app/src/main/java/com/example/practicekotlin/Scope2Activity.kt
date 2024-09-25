package com.example.practicekotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Scope2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scope2)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val btnSubmit = findViewById<Button>(R.id.btnSubmitScope)
        val btnClear = findViewById<Button>(R.id.btnClearScope)
        val txtUsername = findViewById<EditText>(R.id.txtScopeName)
        val txtResult = findViewById<TextView>(R.id.txtResultScope)

        txtUsername.text = null

        btnSubmit.setOnClickListener {
            txtResult.text = txtUsername.text
        }

        btnClear.setOnClickListener {
            txtResult.text = ""
            txtUsername.text.clear()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}