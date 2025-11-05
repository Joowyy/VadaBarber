package com.example.vadabarber

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.vadabarber.databinding.LoginActivityBinding
import com.example.vadabarber.databinding.RegisterActivityBinding

class RegisterActivity : ComponentActivity() {

    private lateinit var binding: RegisterActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = RegisterActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cambioDeRegALog.setOnClickListener {

            var intentSwapLogin = Intent(this, LoginActivity::class.java)
            startActivity(intentSwapLogin)

        }

    }

}