package com.example.deliveryeduardo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.deliveryeduardo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var views: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        initializationListeners()
        setContentView(views.root)
    }

    private fun initializationListeners(){
        views.buttonLogin.setOnClickListener{
            Toast.makeText(this,"El usuario es:"+" "+ views.editTextTextPersonName.text+" "+"y su contrasena es"+" "+views.editTextPassword.text, Toast.LENGTH_SHORT).show()
        }
    }
}