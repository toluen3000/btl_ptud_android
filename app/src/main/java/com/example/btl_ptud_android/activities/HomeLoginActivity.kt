package com.example.btl_ptud_android.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.btl_ptud_android.R
import com.example.btl_ptud_android.databinding.ActivityHomeLoginBinding
import com.google.firebase.Firebase
import com.google.firebase.database.database

class HomeLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        LoginScreen()
        SignUpScreen()
        // Write a message to the database
        val database = Firebase.database
//        val myRef = database.getReference("message")
//
//        myRef.setValue("Hello, Tôi là Đạt!")
    }

    private fun SignUpScreen() {
        binding.btnSignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

    private fun LoginScreen() {
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}