package com.example.test.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.googleLoginButton.setOnClickListener {
            moveMainPage()
        }
    }

    private fun moveMainPage() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        //finish()
    }
}