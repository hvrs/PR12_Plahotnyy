package com.example.plahotnyy_pr12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
    fun onClickStepsActivity1(view: View){
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
}