package com.example.pizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //instance text
        val txtEmail: EditText = findViewById(R.id.registerEmail)
        val txtName: EditText = findViewById(R.id.registerPersonName)
        val txtLevel: EditText = findViewById(R.id.registerLevel)
        val txtPassword: EditText = findViewById(R.id.registerPassword)
        //instance button register
        val btnRegister: Button = findViewById(R.id.buttonRegisterAccount)

btnRegister.setOnClickListener {
    //object class databaseHelper
    val databaseHelper = DatabaseHelper(this)
    //declare data
}
    }
}