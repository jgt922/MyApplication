package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.myapplication.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bSantander = findViewById<Button>(R.id.bSantander)
        val bMadrid = findViewById<Button>(R.id.bMadrid)

        bSantander.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java) //Vamos de this hacia la activity secundaria
            intent.putExtra(TAG, "ciudad-santander")
            startActivity(intent)
        })

        bMadrid.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java) //Vamos de this hacia la activity secundaria
            intent.putExtra(TAG, "ciudad-madrid")
            startActivity(intent)
        })
    }
}