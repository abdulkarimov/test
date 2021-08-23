package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button);
        button.setOnClickListener()
        {
            val intent = Intent(this, RegisterActivity::class.java)
            //val intent = Intent(this,RecycelerViewActivity::class.java)

            startActivity(intent)
        }
    }
}