package com.example.demo1_kotlin_t4tek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo1_kotlin_t4tek.databinding.ActivityMainBinding
import com.example.demo1_kotlin_t4tek.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivitySecondBinding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val username=intent.getStringExtra("username")
        val password=intent.getStringExtra("password")
        //nhận username vs password từ mainactivity bằng getStingExtra

        binding.tv1.text="Username : "+username
        binding.tv2.text="Password : "+password

    }
}