package com.example.demo1_kotlin_t4tek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo1_kotlin_t4tek.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    //tạo binding class cho activity_main
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java)//câu hỏi : tại sao SeconActivity::class, nó có ý nhĩa gì
                .putExtra("username",binding.edt1.text.toString())
                .putExtra("password",binding.edt2.text.toString()))
        }
        //gửi username vs password bằng putExtra


    }
}