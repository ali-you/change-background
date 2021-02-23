package com.example.colorchange_q3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.colorchange_q3.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val random = Random(20)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var colorNum = 0


        binding.changeColor.setOnClickListener{
            colorNum = random.nextInt()
            binding.layout.setBackgroundColor(colorNum)
        }

        binding.next.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            binding.layout.setBackgroundColor(colorNum)
        }

//        binding.back.setOnClickListener{
//            val callback = requireA
//        }



    }
}