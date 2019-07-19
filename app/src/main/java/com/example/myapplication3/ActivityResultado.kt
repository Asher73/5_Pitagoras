package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_resultado.*

class ActivityResultado : AppCompatActivity() {
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0
    companion object {
        val EXTRA_A ="Cateto A"
        val EXTRA_B ="Cateto B"
        val EXTRA_C ="Hipotenusa C"
        private val DEFAULT_DOUBLE = -1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val recibir = intent
        a= recibir.getDoubleExtra(EXTRA_A, DEFAULT_DOUBLE)
        b= recibir.getDoubleExtra(EXTRA_B, DEFAULT_DOUBLE)
        c= recibir.getDoubleExtra(EXTRA_C, DEFAULT_DOUBLE)
        textViewA.setText("Cateto A="+ a.toString())
        textViewB.setText("Cateto B="+ b.toString())
        textViewC.setText("Hipotenusa C="+ c.toString())
    }
}
