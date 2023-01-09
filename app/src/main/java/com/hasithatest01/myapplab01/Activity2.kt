package com.hasithatest01.myapplab01

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val emailTextView = findViewById<TextView>(R.id.EmailView)

        //no need to use a intent due to...
        //val mIntent = intent
        val userEmail = intent.extras!!.getString("email")

        val userMessage = "Hi LNBTI ,\n Your email:$userEmail \n is registered Successfully"
        emailTextView.text = userMessage
    }
}