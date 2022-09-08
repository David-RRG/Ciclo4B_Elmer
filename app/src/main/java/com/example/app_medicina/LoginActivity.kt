package com.example.app_medicina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app_medicina.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
        //se usa binding con el nombre q tenga el layout (activity_login.xml)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}