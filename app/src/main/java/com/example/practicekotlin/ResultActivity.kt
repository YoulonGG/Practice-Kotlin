package com.example.practicekotlin

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.practicekotlin.Class.Result


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val btnSuccess = findViewById<Button>(R.id.btnSuccess)
        val btnFail = findViewById<Button>(R.id.btnFail)
        val btnBack = findViewById<ImageView>(R.id.btnBack)

        btnSuccess.setOnClickListener {
            Toast.makeText(this, Result.Success.errorMessage, Toast.LENGTH_SHORT).show()
        }

        btnFail.setOnClickListener {
            Toast.makeText(this, Result.Failure("Math", 4813).errorMessage, Toast.LENGTH_SHORT).show()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
