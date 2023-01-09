package com.hasithatest01.myapplab01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var registerBtn: Button
    lateinit var emailInput : EditText
    lateinit var passwordInput : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerBtn = findViewById(R.id.btn_register)
        emailInput = findViewById(R.id.editTextEmail)
        passwordInput = findViewById(R.id.editTextPassword)

        registerBtn.setOnClickListener {
            if(validate()) {
                val intent = Intent(applicationContext, Activity2::class.java)
                intent.putExtra("email", emailInput.text.toString());
                intent.putExtra("password", passwordInput.text.toString());
                startActivity(intent)
            }
        }
    }

    // remove and use when
    private fun validate(): Boolean{
        if (emailInput.text.toString() == null || emailInput.text.toString().trim() == ""){
            Toast.makeText(baseContext,"Email cannot be empty", Toast.LENGTH_SHORT).show();
            return false
        }

        if (passwordInput.text.toString() == null || passwordInput.text.toString().trim() == ""){
            Toast.makeText(baseContext,"Password cannot be empty", Toast.LENGTH_SHORT).show();
            return false
        }

        return true
    }
}
