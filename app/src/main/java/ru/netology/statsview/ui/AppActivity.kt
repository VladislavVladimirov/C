package ru.netology.statsview.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.statsview.R

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<StatsView>(R.id.statsView)
        view.data = listOf(
            300F,
            300F,
            300F,
            300F
        )
    }
}
