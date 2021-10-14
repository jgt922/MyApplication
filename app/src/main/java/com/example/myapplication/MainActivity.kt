package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvCiudad:TextView? = null   //Definimos variables del tipo textView
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.tvCiudad)  //Inicializamos variables textView para que apunten a los textView del activity
        tvGrados = findViewById(R.id.tvGrados)
        tvEstatus = findViewById(R.id.tvEstatus)

        val ciudad = intent.getStringExtra("com.example.myapplication.ciudades.CIUDAD")

        //Creando objetos de la clase Ciudad
        val ciudadS = Ciudad("Ciudad de Santander", 15, "Nublado")
        val ciudadM = Ciudad("Ciudad de Madrid", 20, "Soleado")

        if (ciudad == "ciudad-santander"){
            //Mostrar informacion de Santander  //Pone los valores de las variables del objeto en los text view
            tvCiudad?.text = ciudadS.nombre
            tvGrados?.text = ciudadS.grados.toString() + "º"
            tvEstatus?.text = ciudadS.estatus

        }else if (ciudad == "ciudad-madrid"){
            //Mostrar informacion de Madrid     //Pone los valores de las variables del objeto en los text view
            tvCiudad?.text = ciudadM.nombre
            tvGrados?.text = ciudadM.grados.toString() + "º"
            tvEstatus?.text = ciudadM.estatus

        }else Toast.makeText(this, "Nose encuentra la información", Toast.LENGTH_SHORT).show()
    }
}