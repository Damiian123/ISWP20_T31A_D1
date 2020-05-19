package com.example.driver1

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_pantalla__menu.*

class Pantalla_Menu : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla__menu)

        boton_maps.setOnClickListener()
        {
            val intent:Intent = Intent(this, Maps_GASyMEC::class.java)
            startActivity(intent)
        }

        boton_cerrarsesion.setOnClickListener()
        {
            val builder = AlertDialog.Builder(applicationContext)
            builder.setMessage("¿Está seguro(a) de cerrar sesión?")
            builder.setCancelable(true)
            builder.setPositiveButton("Si") { dialogInterface: DialogInterface, i: Int ->
                val intent: Intent = Intent(this, MainActivity::class.java)
                startActivity(intent)}
            builder.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int -> builder.show()})
        }
    }
}
