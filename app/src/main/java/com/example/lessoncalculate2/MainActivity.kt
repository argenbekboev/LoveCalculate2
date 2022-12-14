package com.example.lessoncalculate2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.lessoncalculate2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: LoveViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnCalculate.setOnClickListener {
                viewModel.liveModel(etFname.text.toString(), etSname.text.toString())
                    .observe(this@MainActivity,
                        Observer {
                            val intent = Intent(this@MainActivity, ResultActivity::class.java)
                            intent.putExtra("data", it!!)
                            startActivity(intent)
                        })
            }
        }
    }
}