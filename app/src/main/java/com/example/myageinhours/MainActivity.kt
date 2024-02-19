package com.example.myageinhours

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ageInput: EditText = findViewById(R.id.age_input)
        val convertButton: Button = findViewById(R.id.convert_button)
        val resultText: TextView = findViewById(R.id.result_text)

        convertButton.setOnClickListener {
            val ageStr = ageInput.text.toString()
            if (ageStr.isNotEmpty()) {
                val age = ageStr.toInt()
                val hours = age * 365 * 24
                resultText.text = "Your age in hours is: $hours"
            } else {
                resultText.text = "Please enter your age"
            }
        }
    }
}