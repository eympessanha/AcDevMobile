package com.example.ac_dev_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class Questionario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionario)

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
                    primaveraClara++
                    primaveraQuente++
                    outonoEscuro++
                    outonoQuente++
                }
                R.id.veiaFria -> {
                    veraoFrio++
                    veraoClaro++
                    invernoFrio++
                    invernoEscuro++
                }
                R.id.veiaNeutra -> {
                    primaveraClara++
                    veraoClaro++
                }
            }
        }

        val opcoesRadioGroupOlhos: RadioGroup = findViewById(R.id.olhos)

        opcoesRadioGroupOlhos.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.azul -> {
                    primaveraClara++
                    veraoFrio++
                    veraoClaro++
                    invernoFrio++
                }
                R.id.mel -> {
                    primaveraQuente++
                    outonoQuente++
                }
                R.id.verde -> {
                    primaveraQuente++
                    primaveraClara++
                    outonoQuente++
                    veraoFrio++
                    veraoClaro++
                }
                R.id.castanhoo -> {
                    outonoQuente++
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
                    primaveraQuente++
                    primaveraClara++
                    veraoFrio++
                    veraoClaro++
                }
                R.id.castanho -> {
                    primaveraQuente++
                    primaveraClara++
                    outonoQuente++
                    outonoEscuro++
                    invernoFrio++
                    invernoEscuro++
                    veraoFrio++
                    veraoClaro++
                }
                R.id.ruivo -> {
                    primaveraQuente++
                    outonoQuente++
                }
                R.id.preto -> {
                    outonoQuente++
                    outonoEscuro++
                    invernoFrio++
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