package com.example.week5assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar

class ForgottenPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotten_password)
        val email:EditText = findViewById(R.id.editText)
var feedBack: String = email.text.toString()
        val forgotPasswordBtn: MaterialButton = findViewById(R.id.forgotPasswordBtn)

        forgotPasswordBtn.setOnClickListener{
            var feedBack: String = email.text.toString()
            var message = ""
            val regex = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})"
            if(!feedBack.matches(regex.toRegex())){
            message = "Kindly enter a valid email address"
            }
            else {
                message = "A recovery mail has been sent to ${feedBack}"
            }
            Snackbar.make(findViewById(R.id.forgotLayout), message, Snackbar.LENGTH_LONG).show()
        }
    }
}