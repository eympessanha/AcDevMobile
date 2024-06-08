package com.example.devmobile

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class VeraoFrio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_verao_frio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val duvida = findViewById<ImageButton>(R.id.imageButton)
        duvida.setOnClickListener() {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.pauapique.com/tecnica-coloracao-pessoal/"))
            startActivity(intent)
        }

        val refazer = findViewById<Button>(R.id.button3)
        refazer.setOnClickListener {
            val intent = Intent(this@VeraoFrio, Questionario::class.java)
            startActivity(intent)
        }
    }
}