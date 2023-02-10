package com.example.colormixer

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MixCheck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.answer_activity)

        val intent = intent
        val name = intent.getStringExtra("Name")
        val color = intent.getStringExtra("Color")

        val resultSelectedColors = findViewById<TextView>(R.id.selectedColors)

        resultSelectedColors.text= "$name you selected $color"

        val submit = findViewById<Button>(R.id.submit)
        val radioGreen = findViewById<RadioButton>(R.id.radioButton2)
        val radioPurple = findViewById<RadioButton>(R.id.radio_violet)
        val radioOrange = findViewById<RadioButton>(R.id.radioButton3)

        submit.setOnClickListener {
            val success = Intent(this, successAct::class.java)
            val fail = Intent(this, FailAct::class.java)
            if(color.equals("Blue and Yellow") and radioGreen.isChecked){
                success.putExtra("Name",name)
                startActivity(success)
            }
            else if (color.equals("Blue and Red") and radioPurple.isChecked){
                success.putExtra("Name",name)
                startActivity(success)
            }
            else if (color.equals("Yellow and Red") and radioOrange.isChecked){
                success.putExtra("Name",name)
                startActivity(success)
                }

            else{
                fail.putExtra("Name",name)
                startActivity(fail)
            }

        }


    }


}