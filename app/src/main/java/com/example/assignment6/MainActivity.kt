package com.example.assignment6

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.ceil

//Welcomes user by receiving input of their name and displaying back on the screen


class MainActivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var enterNameView: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        nameTextView = findViewById(R.id.textView)
        enterNameView = findViewById(R.id.editTextText)
        nameTextView.setText("Name: ?...")
//            numAttendEditText = findViewById(R.id.num_attend_edit_text)

    }

    fun  updateText(view:View){
        nameTextView.setText("Hello, ${enterNameView.text}")
//        nameTextView.setText("Button Clicked")
//        println("Button Clicked")

    }
}

