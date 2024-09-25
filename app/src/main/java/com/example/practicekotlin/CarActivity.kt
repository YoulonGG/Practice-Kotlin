package com.example.practicekotlin

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.practicekotlin.Class.BMW
import com.example.practicekotlin.Class.Benz
import com.example.practicekotlin.Class.Mercedes

class  CarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_car)

        val btnBMW = findViewById<Button>(R.id.btnBMW)
        val btnBenz = findViewById<Button>(R.id.btnBenz)
        val btnMercedes = findViewById<Button>(R.id.btnMercedes)
        val btnBack = findViewById<ImageView>(R.id.btnBack)

        btnBMW.setOnClickListener {
            val bmw = BMW()
            Toast.makeText(this, bmw.mileage(), Toast.LENGTH_SHORT).show()
        }

        btnBenz.setOnClickListener {
            val benz = Benz()
            Toast.makeText(this, benz.mileage(), Toast.LENGTH_SHORT).show()
        }

        btnMercedes.setOnClickListener {
            val mercedes = Mercedes()
            Toast.makeText(this, mercedes.mileage(), Toast.LENGTH_SHORT).show()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}