package com.moveloper.androidmaster.firstapp.sintaxis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.moveloper.androidmaster.R
import com.moveloper.androidmaster.firstapp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        btnSaludApp.setOnClickListener {navigateToSaludApp()}
    }

    private fun navigateToSaludApp(){
     val intent = Intent(this,FirstAppActivity::class.java)
        startActivity(intent)
    }
}