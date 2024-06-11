package com.example.projetotalento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class EsqueceuSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esqueceu_senha)

        val enviarEmail = findViewById<Button>(R.id.enviarButton)

        enviarEmail.setOnClickListener {
            val intent = Intent(this@EsqueceuSenha, VerificarEmail::class.java)
            startActivity(intent)
        }
    }
}

