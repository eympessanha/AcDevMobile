package com.example.projetotalento
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_perfil)
        val perfil = findViewById<ImageView>(R.id.imageView9)
        val notificacoes = findViewById<ImageView>(R.id.imageView10)
        val configuracoes = findViewById<ImageView>(R.id.imageView11)
        val diversikas = findViewById<ImageView>(R.id.imageView8)
        val jornada = findViewById<ImageView>(R.id.imageView7)
        val alterarPerfil = findViewById<Button>(R.id.button2)

        diversikas.setOnClickListener {
            val intent = Intent(this@TelaPerfil, Diversikas::class.java)
            startActivity(intent)
        }

        jornada.setOnClickListener {
            val intent = Intent(this@TelaPerfil, Jornada::class.java)
            startActivity(intent)
        }

        perfil.setOnClickListener {
            val intent = Intent(this@TelaPerfil, TelaPerfil::class.java)
            startActivity(intent)
        }
        notificacoes.setOnClickListener {
            val intent = Intent(this@TelaPerfil, Notificacoes::class.java)
            startActivity(intent)
        }
        configuracoes.setOnClickListener {
            val intent = Intent(this@TelaPerfil, Configuracoes::class.java)
            startActivity(intent)
        }
        alterarPerfil.setOnClickListener {
            val intent = Intent(this@TelaPerfil, Configuracoes::class.java)
            startActivity(intent)
        }

    }
}