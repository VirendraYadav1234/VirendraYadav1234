package com.example.birthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mainbirth2.*

class Mainbirth2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainbirth2)
        val nam=intent.getStringExtra("name")


        text3.text="HAPPY BIRTHDAY $nam"
    }
}