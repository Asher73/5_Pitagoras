package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    var a: Double = 0.0
    var b: Double = 0.0
    var c: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        eta.requestFocus()
    }
    fun CalcularC(v: View){
        if (eta.text.isEmpty() || etb.text.isEmpty()){
            Toast.makeText(this, "Faltan valores",Toast.LENGTH_LONG).show()
            eta.requestFocus()
        }
        else{
            a = eta.text.toString().toDouble()
            b = etb.text.toString().toDouble()
            c = sqrt((pow(a,2.0) + pow(b,2.0)))
            eth.setText(c.toString())
        }
    }
    fun CalcularA(v: View){
        if (eth.text.isEmpty() || etb.text.isEmpty()){
            Toast.makeText(this, "Faltan valores",Toast.LENGTH_LONG).show()
            etb.requestFocus()
        }
        else{
            c = eth.text.toString().toDouble()
            b = etb.text.toString().toDouble()
            a = sqrt((pow(c,2.0) - pow(b,2.0)))
            eta.setText(a.toString())
        }
    }
    fun CalcularB(v: View){
        if (eth.text.isEmpty() || eta.text.isEmpty()){
            Toast.makeText(this, "Faltan valores",Toast.LENGTH_LONG).show()
            eta.requestFocus();
        }
        else{
            c = eth.text.toString().toDouble()
            a = eta.text.toString().toDouble()
            b = sqrt((pow(c,2.0) - pow(a,2.0)))

            etb.setText(b.toString())
        }
    }
    fun enviaRes(v: View){
        if (eth.text.isEmpty() || eta.text.isEmpty() || etb.text.isEmpty()){
            Toast.makeText(this, "Escribe todos los valores",Toast.LENGTH_LONG).show()
            eta.requestFocus()
        }
        else{
            val enviar= Intent(this,ActivityResultado::class.java)
            enviar.putExtra(ActivityResultado.EXTRA_A, a)
            enviar.putExtra(ActivityResultado.EXTRA_B, b)
            enviar.putExtra(ActivityResultado.EXTRA_C, c)
            startActivity(enviar)
        }
    }
}
