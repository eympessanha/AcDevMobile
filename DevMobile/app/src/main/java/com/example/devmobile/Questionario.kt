package com.example.devmobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Questionario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_questionario)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var invernoFrio = 0
        var invernoEscuro = 0
        var outonoEscuro = 0
        var outonoQuente = 0
        var primaveraClara = 0
        var primaveraQuente = 0
        var veraoClaro = 0
        var veraoFrio = 0

        val opcoesRadioGroupVeia: RadioGroup = findViewById(R.id.opcoesVeias)

        opcoesRadioGroupVeia.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.veiaQuente -> {
                    primaveraQuente++
                    outonoEscuro++
                }
                R.id.veiaFria -> {
                    veraoFrio++
                    invernoFrio++
                    invernoEscuro++
                }
                R.id.veiaNeutra -> {
                    primaveraClara++
                    veraoClaro++
                    outonoQuente++
                }
            }
        }

        val opcoesRadioGroupOlhos: RadioGroup = findViewById(R.id.olhos)

        opcoesRadioGroupOlhos.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.azul -> {
                    primaveraClara++
                    veraoFrio++
                }
                R.id.mel -> {
                    primaveraQuente++
                    outonoQuente++
                }
                R.id.verde -> {
                    primaveraClara++
                    veraoClaro++
                }
                R.id.castanhoo -> {
                    outonoEscuro++
                    invernoFrio++
                    invernoEscuro++
                }
            }
        }

        val opcoesRadioGroupCabelos: RadioGroup = findViewById(R.id.cabelos)

        opcoesRadioGroupCabelos.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.loiro -> {
                    primaveraClara++
                    veraoFrio++
                }
                R.id.castanho -> {
                    outonoEscuro++
                    invernoFrio++
                    veraoClaro++
                }
                R.id.ruivo -> {
                    primaveraQuente++
                    outonoQuente++
                }
                R.id.preto -> {
                    outonoQuente++
                    outonoEscuro++
                    invernoEscuro++
                }
            }
        }

        val finalizar = findViewById<Button>(R.id.button2)

        finalizar.setOnClickListener {

            val intent: Intent
            if (invernoFrio >= invernoEscuro && invernoFrio >= outonoEscuro && invernoFrio >= outonoQuente && invernoFrio >= primaveraQuente && invernoFrio >= primaveraClara && invernoFrio >= veraoFrio && invernoFrio >= veraoClaro) {
                intent = Intent(this@Questionario, InvernoFrio::class.java)
                startActivity(intent)
            } else if (invernoEscuro >= invernoFrio && invernoEscuro >= outonoEscuro && invernoEscuro >= outonoQuente && invernoEscuro >= primaveraQuente && invernoEscuro >= primaveraClara && invernoEscuro >= veraoFrio && invernoEscuro >= veraoClaro) {
                intent = Intent(this@Questionario, InvernoEscuro::class.java)
                startActivity(intent)
            } else if (outonoEscuro >= invernoFrio && outonoEscuro >= invernoEscuro && outonoEscuro >= outonoQuente && outonoEscuro >= primaveraQuente && outonoEscuro >= primaveraClara && outonoEscuro >= veraoFrio && outonoEscuro >= veraoClaro) {
                intent = Intent(this@Questionario, OutonoEscuro::class.java)
                startActivity(intent)
            } else if (outonoQuente >= invernoFrio && outonoQuente >= invernoEscuro && outonoQuente >= outonoEscuro && outonoQuente >= primaveraQuente && outonoQuente >= primaveraClara && outonoQuente >= veraoFrio && outonoQuente >= veraoClaro) {
                intent = Intent(this@Questionario, OutonoQuente::class.java)
                startActivity(intent)
            } else if (primaveraClara >= invernoFrio && primaveraClara >= invernoEscuro && primaveraClara >= outonoEscuro && primaveraClara >= primaveraQuente && primaveraClara >= outonoQuente && primaveraClara >= veraoFrio && primaveraClara >= veraoClaro) {
                intent = Intent(this@Questionario, PrimaveraClara::class.java)
                startActivity(intent)
            } else if (primaveraQuente >= invernoFrio && primaveraQuente >= invernoEscuro && primaveraQuente >= outonoEscuro && primaveraQuente >= primaveraClara && primaveraQuente >= outonoQuente && primaveraQuente >= veraoFrio && primaveraQuente >= veraoClaro) {
                intent = Intent(this@Questionario, PrimaveraQuente::class.java)
                startActivity(intent)
            } else if (veraoClaro >= invernoFrio && veraoClaro >= invernoEscuro && veraoClaro >= outonoEscuro && veraoClaro >= primaveraClara && veraoClaro >= outonoQuente && veraoClaro >= veraoFrio && veraoClaro >= primaveraQuente) {
                intent = Intent(this@Questionario, VeraoClaro::class.java)
                startActivity(intent)
            } else {
                intent = Intent(this@Questionario, VeraoFrio::class.java)
                startActivity(intent)
            }

        }
    }
}

/*inverno escuro: veia fria, olho castanho, cabelo preto

inverno frio: veia fria, olho castanho, cabelo castanho

outono quente: veia neutra, olho mel, cabelo ruivo

outono escuro: veia quente, olho castanho, cabelo castanho

primavera clara: veia neutra, olho azul, cabelo loiro

primavera quente: veia quente, olho mel, cabelo ruivo

verao claro: veia neutra, olho verde, cabelo castanho

verao frio: veia fria, olho azul, cabelo loiro*/