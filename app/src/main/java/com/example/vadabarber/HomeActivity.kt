package com.example.vadabarber

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.vadabarber.databinding.HomeActivityBinding
import com.example.vadabarber.databinding.RegisterActivityBinding

class HomeActivity : ComponentActivity() {

    private lateinit var binding : HomeActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}