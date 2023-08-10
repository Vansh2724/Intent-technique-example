package com.example.mad_prac3_89_5b6

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    lateinit var tv1:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        var bundle:String?=intent.getStringExtra("MainActivity1")
        tv1=findViewById(R.id.text_view1)
        tv1.text=bundle
    }
}