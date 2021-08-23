package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityBidinBinding

class BidinActivity : AppCompatActivity() {
    private var binding: ActivityBidinBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBidinBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding!!.textForBinding

    }


}