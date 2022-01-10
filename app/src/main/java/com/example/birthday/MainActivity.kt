package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val intent = Intent(this,Mainbirth2::class.java)
            val name=text.editableText.toString()
            intent.putExtra("name",name)
            startActivity(intent)
            Toast.makeText(this, "enjoy your day", Toast.LENGTH_SHORT).show()

        }

    }
}