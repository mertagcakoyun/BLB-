package com.example.blbi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubeEkle.setOnClickListener(View.OnClickListener {
            val intent= Intent(this, SubeEkleActivity::class.java)
            startActivity(intent)
        })
    }
}
