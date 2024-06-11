package com.example.projetotalento

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Jornada : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jornada)

        val perfil = findViewById<ImageButton>(R.id.imageView9)
        val notificacoes = findViewById<ImageButton>(R.id.imageView10)
        val configuracoes = findViewById<ImageButton>(R.id.imageView11)
        val diversikas = findViewById<ImageButton>(R.id.imageView8)
        val jornada = findViewById<ImageButton>(R.id.imageView7)

        diversikas.setOnClickListener {
            val intent = Intent(this@Jornada, Diversikas::class.java)
            startActivity(intent)
        }

        jornada.setOnClickListener {
            val intent = Intent(this@Jornada, Jornada::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener {
            val intent = Intent(this@Jornada, TelaPerfil::class.java)
            startActivity(intent)
        }
        notificacoes.setOnClickListener {
            val intent = Intent(this@Jornada, Notificacoes::class.java)
            startActivity(intent)
        }
        configuracoes.setOnClickListener {
            val intent = Intent(this@Jornada, Configuracoes::class.java)
            startActivity(intent)
        }
    }
}
