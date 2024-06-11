package com.example.projetotalento

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Diversikas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diversikas)

        val perfil = findViewById<ImageButton>(R.id.imageView9)
        val notificacoes = findViewById<ImageButton>(R.id.imageView10)
        val configuracoes = findViewById<ImageButton>(R.id.imageView11)
        val diversikas = findViewById<ImageButton>(R.id.imageView8)
        val jornada = findViewById<ImageButton>(R.id.imageView7)


        diversikas.setOnClickListener {
            val intent = Intent(this@Diversikas, Diversikas::class.java)
            startActivity(intent)
        }

        jornada.setOnClickListener {
            val intent = Intent(this@Diversikas, Jornada::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener {
            val intent = Intent(this@Diversikas, TelaPerfil::class.java)
            startActivity(intent)
        }
        notificacoes.setOnClickListener {
            val intent = Intent(this@Diversikas, Notificacoes::class.java)
            startActivity(intent)
        }
        configuracoes.setOnClickListener {
            val intent = Intent(this@Diversikas, Configuracoes::class.java)
            startActivity(intent)
        }
    }
    }
