package com.example.mad_prac3_89_5b6

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val tag="MainActivity"
    val EXTRAMESSAGE="com.example.mad_prac3_89_5b6.MESSAGE"
    lateinit var M_messageedittext:EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        M_messageedittext=findViewById(R.id.edit_text)
    }

    fun MainActivity2(view: View) {
        Log.i(tag," is called")
        intent = Intent(this,MainActivity2::class.java)
        var message=M_messageedittext.text.toString()
        intent.putExtra("MainActivity1",message)
        startActivity(intent)

    }


}