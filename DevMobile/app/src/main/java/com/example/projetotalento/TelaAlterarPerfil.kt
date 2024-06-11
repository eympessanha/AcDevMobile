package com.example.projetotalento
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaAlterarPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_alterar_perfil)

        val perfil = findViewById<ImageView>(R.id.imageView9)
        val notificacoes = findViewById<ImageView>(R.id.imageView10)
        val configuracoes = findViewById<ImageView>(R.id.imageView11)
        val diversikas = findViewById<ImageView>(R.id.imageView8)
        val jornada = findViewById<ImageView>(R.id.imageView7)


        diversikas.setOnClickListener {
            val intent = Intent(this@TelaAlterarPerfil, Diversikas::class.java)
            startActivity(intent)
        }

        jornada.setOnClickListener {
            val intent = Intent(this@TelaAlterarPerfil, Jornada::class.java)
            startActivity(intent)
        }

        perfil.setOnClickListener {
            val intent = Intent(this@TelaAlterarPerfil, TelaPerfil::class.java)
            startActivity(intent)
        }
        notificacoes.setOnClickListener {
            val intent = Intent(this@TelaAlterarPerfil, Notificacoes::class.java)
            startActivity(intent)
        }
        configuracoes.setOnClickListener {
            val intent = Intent(this@TelaAlterarPerfil, Configuracoes::class.java)
            startActivity(intent)
        }
    }
}