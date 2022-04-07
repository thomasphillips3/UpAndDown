package com.thomasphillips3.upanddown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thomasphillips3.upanddown.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        var counter = 0

        binding.numberText.text = counter.toString()

        binding.minusButton.setOnClickListener{
            counter--
            binding.numberText.text = counter.toString()
        }

        binding.plusButton.setOnClickListener{
            counter++
            binding.numberText.text = counter.toString()
        }

        binding.clearButton.setOnClickListener {
            counter = 0
            binding.numberText.text = counter.toString()
        }

        setContentView(binding.root)
    }
}
