package com.techmess.viveoclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techmess.viveoclone.databinding.ActivityMainBinding
import com.techmess.viveoclone.utils.Utils.Companion.toast

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.txtView.text = "This is a sample text"
        setContentView(binding.root)
    }
}