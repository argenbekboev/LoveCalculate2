package com.example.lessoncalculate2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lessoncalculate2.databinding.ActivityResultBinding
import com.example.lessoncalculate2.remote.LoveModel

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var result = intent.getSerializableExtra("data") as LoveModel

        binding.tvResult.text = result.toString()
    }
}