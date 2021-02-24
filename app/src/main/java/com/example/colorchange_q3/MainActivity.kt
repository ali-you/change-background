package com.example.colorchange_q3

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import com.example.colorchange_q3.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var colorNum:Int = intent.extras?.getInt("color") ?: 0
        binding.root.setBackgroundColor(colorNum)


        binding.changeColor.setOnClickListener{
            colorNum = (Color.parseColor("#000000")..Color.parseColor("#ffffff")).random()
            binding.layout.setBackgroundColor(colorNum)
        }

        binding.next.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            intent.putExtra("color", colorNum)
            startActivity(intent)
        }

        binding.back.setOnClickListener{
            this.onBackPressed()
        }



    }
}