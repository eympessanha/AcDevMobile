package com.example.projetotalento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Notificacoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificacoes)

        val perfil = findViewById<ImageView>(R.id.imageView9)
        val notificacoes = findViewById<ImageView>(R.id.imageView10)
        val configuracoes = findViewById<ImageView>(R.id.imageView11)
        val diversikas = findViewById<ImageView>(R.id.imageView8)
        val jornada = findViewById<ImageView>(R.id.imageView7)


        diversikas.setOnClickListener {
            val intent = Intent(this@Notificacoes, Diversikas::class.java)
            startActivity(intent)
        }

        jornada.setOnClickListener {
            val intent = Intent(this@Notificacoes, Jornada::class.java)
            startActivity(intent)
        }

        perfil.setOnClickListener {
            val intent = Intent(this@Notificacoes, TelaPerfil::class.java)
            startActivity(intent)
        }
        notificacoes.setOnClickListener {
            val intent = Intent(this@Notificacoes, Notificacoes::class.java)
            startActivity(intent)
        }
        configuracoes.setOnClickListener {
            val intent = Intent(this@Notificacoes, Configuracoes::class.java)
            startActivity(intent)
        }
    }
}