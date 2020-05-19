package com.example.driver1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Boton_Ingresar.setOnClickListener()
        {
            val intent:Intent = Intent(this, Pantalla_Menu::class.java)
            startActivity(intent)
        }
    }
}
