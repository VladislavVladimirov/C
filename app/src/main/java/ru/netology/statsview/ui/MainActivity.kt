package ru.netology.statsview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.netology.statsview.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<StatsView>(R.id.statsView).data = listOf(
            300F,
            300F,
            300F,
            300F


        )
    }
}