package com.example.youwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var emailEdit: EditText
    lateinit var passwordEdit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginButton = findViewById<Button>(R.id.login_button)
        emailEdit = findViewById(R.id.email_edit)
        passwordEdit = findViewById(R.id.password_edit)
        loginButton.setOnClickListener { onLogin() }
    }

    private fun onLogin() {
        if (emailEdit.text.toString() == "admin" && passwordEdit.text.toString() == "admin") {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            findViewById<TextView>(R.id.error_text).visibility = View.VISIBLE
        }
    }
}
