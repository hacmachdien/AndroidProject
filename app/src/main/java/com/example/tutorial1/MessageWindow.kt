package com.example.tutorial1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.message_window.*

class MessageWindow: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.message_window)

        val message = intent.getStringExtra("user_message")
        userText.text = message
    }
}