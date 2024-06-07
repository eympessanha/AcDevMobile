package com.example.ac_dev_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val comecar = findViewById<Button>(R.id.button)

        comecar.setOnClickListener {
            val intent = Intent(this@MainActivity, Questionario::class.java)
            startActivity(intent)
        }
    }
}