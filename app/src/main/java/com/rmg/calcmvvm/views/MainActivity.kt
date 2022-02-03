package com.rmg.calcmvvm.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rmg.calcmvvm.databinding.ActivityMainBinding
import com.rmg.calcmvvm.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mainActivityViewModel = MainActivityViewModel()
        binding.viewModel = mainActivityViewModel
    }
}