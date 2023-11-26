package com.example.week5assessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar



class MainActivity : AppCompatActivity() {
    private fun showErrorMessage(message:String){
        Snackbar.make(findViewById(R.id.secondPage), message, Snackbar.LENGTH_SHORT).show()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
var loginButton:Button = findViewById(R.id.loginbutton)
        var usernameInput: EditText = findViewById(R.id.username)
        var passwordInput:EditText = findViewById(R.id.password)
        loginButton.setOnClickListener{
            var emailFeedBack = usernameInput.text.toString()
            var passwordFeedBack = passwordInput.text.toString()
            if(emailFeedBack.isEmpty() && passwordFeedBack.isEmpty()){

showErrorMessage("Username or Password can not be empty")
            }
            else {
                val intent = Intent(this, Login_Page::class.java)
                startActivity(intent)
            }

        }
var forgotButton:Button = findViewById(R.id.forgotPassword)
        forgotButton.setOnClickListener {
            val intent = Intent(this, ForgottenPasswordActivity::class.java)
            startActivity(intent)
        }

        var createAccount:Button = findViewById(R.id.createAccount)
       createAccount.setOnClickListener {
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }
    }

}