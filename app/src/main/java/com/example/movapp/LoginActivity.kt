package com.example.movapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val loginButton = findViewById<Button>(R.id.ResetPassword)

        loginButton.setOnClickListener {
            // Navigate to Navigation activity (which hosts HomeFragment)
            val intent = Intent(this, Navigation::class.java)
            startActivity(intent)
            finish() // Optional: Close the LoginActivity
        }

        // Forgot Password Navigation
        val forgetPasswordText = findViewById<TextView>(R.id.forgetPasswordText)
        forgetPasswordText.setOnClickListener {
            val intent = Intent(this,ForgetPasssword::class.java)
            startActivity(intent)
        }

        // Register Text Navigation
        val registerText = findViewById<TextView>(R.id.registerText)
        registerText.setOnClickListener {
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
    }
}