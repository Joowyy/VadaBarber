package com.example.vadabarber

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.vadabarber.databinding.FragmentHomeBinding
import com.example.vadabarber.databinding.LoginActivityBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : LoginActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLog.setOnClickListener {

            var intentContinue = Intent(this, HomeActivity::class.java)

        }

        binding.cambioDeLogAReg.setOnClickListener {

            var intentSwapReg = Intent(this, RegisterActivity::class.java)
            startActivity(intentSwapReg)

        }

    }

}
