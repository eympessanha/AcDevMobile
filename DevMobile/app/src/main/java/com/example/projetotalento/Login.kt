package com.example.projetotalento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val esqueceuSenha = findViewById<Button>(R.id.esqueciButton)

        esqueceuSenha.setOnClickListener {
            val intent = Intent(this@Login, EsqueceuSenha::class.java)
            startActivity(intent)
        }

        val entrar = findViewById<Button>(R.id.entrarButton)

        entrar.setOnClickListener {
            val intent = Intent(this@Login, EscolherJornada::class.java)
            startActivity(intent)
        }

    }
}