package com.example.vadabarber

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vadabarber.databinding.LoginActivityBinding
import com.example.vadabarber.databinding.RegisterActivityBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: RegisterActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = RegisterActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // CAMBIO AL LOGIN
        binding.cambioDeRegALog.setOnClickListener {

            val intentSwapLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentSwapLogin)

        }

        // BOTON DE REGISTRO
        binding.buttonReg.setOnClickListener {

            val intentHome = Intent(this, HomeActivity::class.java)
            startActivity(intentHome)

        }

    }

}