package com.example.androidpractice     //Declare path of location that stores this file.

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

// Import the classes from external packages

class MainActivity : AppCompatActivity() {
    // MainActivity : AppCompatActivity() meaning: The class "MainActivity" inherits class "AppCompatActivity", which allows to use the up-to-date functions on old versions.
    override fun onCreate(savedInstanceState: Bundle?) {
        //Override: Language feature that allows an subclass or child class to provide a specific implementation of method that is already provided by one of its superclass or parent class.
        super.onCreate(savedInstanceState)      //in onCreate() method, it must call the constructor of its parent class.
        setContentView(R.layout.activity_main)      // setContentView() designates a specific layout file that this activity represent.
        // R.layout.activity_main -> meaning: represent activity_main.xml file,  R: class that has resource information automatically generated by Android Studio.

        lateinit var commitTestString : String
        clickButton.setOnClickListener {
            textView_Top.text = getString(R.string.text_after_Clicked)
            commitTestString = "Hello Kotlin! Hello Github"
        }
    }
}