package com.example.vadabarber

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import com.example.vadabarber.databinding.HomeActivityBinding
import com.example.vadabarber.databinding.RegisterActivityBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding : HomeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReserva.setOnClickListener {

        }

    }

}