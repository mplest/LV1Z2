package com.mplest.orwma.lv1z2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSpremi = findViewById<Button>(R.id.btnSpremi)
        val btnIzracunaj = findViewById<Button>(R.id.btnIzracunaj)
        val etUpper = findViewById<EditText>(R.id.etUpper)
        val etLower = findViewById<EditText>(R.id.etLower)
        val etVisina = findViewById<EditText>(R.id.etVisina)
        val etTezina = findViewById<EditText>(R.id.etTezina)


        btnSpremi.setOnClickListener {
            val tvUpper = findViewById<TextView>(R.id.tvUpper) as TextView
            tvUpper.setText(etUpper.text.toString())

            val tvLower = findViewById<TextView>(R.id.tvLower) as TextView
            tvLower.setText(etLower.text.toString())
        }

        btnIzracunaj.setOnClickListener {
            val tezina = etTezina.text.toString().toFloat()
            val visina = etVisina.text.toString().toFloat()
            Toast.makeText(this,"BMI iznosi: " + calcBMI(tezina, visina),Toast.LENGTH_LONG).show()
        }
    }

    fun calcBMI(tezina: Float, visina: Float): Float {
        return (tezina/(visina*visina/10000)) //dijelimo sa 10000 jer je visina izražena u centimetrima a potrebni su m^2
    }
}