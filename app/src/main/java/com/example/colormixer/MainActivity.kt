package com.example.colormixer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<TextView>(R.id.editTextTextPersonName)
        val blueCheckBox = findViewById<CheckBox>(R.id.checkBox_blue)
        val redCheckBox = findViewById<CheckBox>(R.id.checkBox_red)
        val yellowCheckBox = findViewById<CheckBox>(R.id.checkBox_yellow)

        val mixbutton: Button = findViewById<Button>(R.id.MixButton)
        mixbutton.setOnClickListener {
            val name = username.text.toString()
            val cb = if (blueCheckBox.isChecked && redCheckBox.isChecked) {
                "Blue and Red"
            }
            else if (blueCheckBox.isChecked && yellowCheckBox.isChecked) {
                "Blue and Yellow"
            }
            else if (yellowCheckBox.isChecked && redCheckBox.isChecked) {
                "Yellow and Red"
            }
            else {
                "Error"
            }
            val intent = Intent(this, MixCheck::class.java)
            intent.putExtra("Name",name)
            intent.putExtra("Color",cb)

            startActivity(intent)
        }


    }



}