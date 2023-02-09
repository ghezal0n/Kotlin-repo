package com.example.curriculumvitae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns.EMAIL_ADDRESS

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun slider() {
        val sliderValue = 90


        if (sliderValue > 80) {
            println("Vous êtes excellent en skill")
        } else if (sliderValue <= 30) {
            println("Vous devez travailler vos skills")
        } else {
            println("Vous avez de bons skills !")
        }
    }
}