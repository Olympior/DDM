package com.example.compra

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val loginButton = findViewById<Button>(R.id.button2)
        val login = findViewById<EditText>(R.id.login)
        val password = findViewById<EditText>(R.id.Password)

        loginButton.setOnClickListener {
            val username = login.text.toString()
            val password = password.text.toString()
            autenticacao(username, password)
        }
    }

    private fun autenticacao(nome: String, senha: String) {
        if (nome == "olympio" && senha == "123") {
            Toast.makeText(this, "Autenticado", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ComparadorActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Não Autenticado", Toast.LENGTH_LONG).show()
        }
    }
}