package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class registeractivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeractivity)
    }

    fun registerevent(view: View) {
        var getname=findViewById<EditText>(R.id.uname)
        var getphn=findViewById<EditText>(R.id.uphone)
        var getemail=findViewById<EditText>(R.id.uemail)
        var getusername=findViewById<EditText>(R.id.username)
        var getpasswrd=findViewById<EditText>(R.id.passwrd)
        Toast.makeText(this,getname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getphn.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getemail.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getusername.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getpasswrd.text.toString(),Toast.LENGTH_LONG).show()
    }
}