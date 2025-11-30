package com.example.vadabarber

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.navigateUp
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import com.example.vadabarber.databinding.HomeActivityBinding


class HomeActivity : AppCompatActivity() {

    private lateinit var binding : HomeActivityBinding
    private lateinit var navController : NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = HomeActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController
        appBarConfiguration = AppBarConfiguration.Builder(

            R.id.homeActivity,
            R.id.reservaFragment

        ).build()

        setupActionBarWithNavController(this, navController, appBarConfiguration)

        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController);

    }

    override fun onSupportNavigateUp(): Boolean {
        return navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp()
    }

}