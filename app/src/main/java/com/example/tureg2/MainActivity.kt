package com.example.tureg2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val password1Editor: EditText = findViewById(R.id.password1)
        val password2Editor: EditText = findViewById(R.id.password2)
        val checkbox: CheckBox = findViewById(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)

        button.setOnClickListener {
            val password1 = password1Editor.text.toString()
            val password2 = password2Editor.text.toString()

            if (password1 == password2) {
                checkbox.isChecked = true}
            if (password1.isNotEmpty() && password1.matches(Regex(".*[A-Z].*"))) {
                val checkbox1 = findViewById<CheckBox>(R.id.checkBox1)
                checkbox1.isChecked = true
            }
            if (password1.matches(Regex(".*[a-z].*"))) {
                checkBox2.isChecked = true
            }

        }
    }
}

