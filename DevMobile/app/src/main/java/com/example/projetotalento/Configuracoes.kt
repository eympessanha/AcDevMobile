package com.example.projetotalento

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Configuracoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracoes)
        val ajuda = findViewById<TextView>(R.id.textView10)
        val sair = findViewById<TextView>(R.id.textView11)

        val perfil = findViewById<ImageView>(R.id.imageView9)
        val notificacoes = findViewById<ImageView>(R.id.imageView10)
        val configuracoes = findViewById<ImageView>(R.id.imageView11)
        val diversikas = findViewById<ImageView>(R.id.imageView8)
        val jornada = findViewById<ImageView>(R.id.imageView7)


        diversikas.setOnClickListener {
            val intent = Intent(this@Configuracoes, Diversikas::class.java)
            startActivity(intent)
        }

        jornada.setOnClickListener {
            val intent = Intent(this@Configuracoes, Jornada::class.java)
            startActivity(intent)
        }
        perfil.setOnClickListener {
            val intent = Intent(this@Configuracoes, TelaPerfil::class.java)
            startActivity(intent)
        }
        notificacoes.setOnClickListener {
            val intent = Intent(this@Configuracoes, Notificacoes::class.java)
            startActivity(intent)
        }
        configuracoes.setOnClickListener {
            val intent = Intent(this@Configuracoes, Configuracoes::class.java)
            startActivity(intent)
        }
        ajuda.setOnClickListener {
            val intent = Intent(this@Configuracoes, Ajuda::class.java)
            startActivity(intent)
        }
        sair.setOnClickListener {
            val intent = Intent(this@Configuracoes, Login::class.java)
            startActivity(intent)
        }
    }
}