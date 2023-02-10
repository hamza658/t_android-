package com.example.colormixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class successAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.success_activity)

        val intent = intent
        val name = intent.getStringExtra("Name")

        val message = findViewById<TextView>(R.id.congratz)
        message.text = "Congratulation $name!"
        val quitButton = findViewById<Button>(R.id.quit)
        quitButton.setOnClickListener{
            finish()
            exitProcess(0)
        }

    }
}