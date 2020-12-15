package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginevent(view: View) {
        var getusername=findViewById<EditText>(R.id.uname)
        var getpasswrd=findViewById<EditText>(R.id.passwrd)
        Toast.makeText(this,getusername.text.toString()+getpasswrd.text.toString(),Toast.LENGTH_LONG).show()
    }
}