package com.example.plahotnyy_pr12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }
}