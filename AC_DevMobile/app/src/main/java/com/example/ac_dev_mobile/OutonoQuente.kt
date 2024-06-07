package com.example.ac_dev_mobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class OutonoQuente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outono_quente)

        val duvida = findViewById<ImageButton>(R.id.imageButton)
        duvida.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.pauapique.com/tecnica-coloracao-pessoal/"))
            startActivity(intent)
        }

        val refazer = findViewById<Button>(R.id.button3)
        refazer.setOnClickListener {
            val intent = Intent(this@OutonoQuente, MainActivity::class.java)
            startActivity(intent)
        }
    }
}