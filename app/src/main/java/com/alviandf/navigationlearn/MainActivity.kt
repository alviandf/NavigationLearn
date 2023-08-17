package com.alviandf.navigationlearn

import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.alviandf.navigationlearn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onBackPressedDispatcher
            .addCallback(this, object: OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    Log.d("TAG", "handleOnBackPressed: ")
                }
            })
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}