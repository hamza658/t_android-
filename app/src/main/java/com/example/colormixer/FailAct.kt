package com.example.colormixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class FailAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fail_activity)


        val intent = intent
        val name= intent.getStringExtra("Name")
        val quitButton = findViewById<Button>(R.id.quitting)
        val messageFail = findViewById<TextView>(R.id.fail)
        messageFail.text="Sorry $name!"

        quitButton.setOnClickListener{
            finish()
            exitProcess(0)
        }
    }
}