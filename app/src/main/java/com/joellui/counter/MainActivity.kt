package com.joellui.counter

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = 0
        var tapCount = findViewById<ImageButton>(R.id.btn_tap)
        var text = findViewById<TextView>(R.id.tv_count)
        var resetCount = findViewById<ImageButton>(R.id.btn_reset)
        var minCount = findViewById<ImageButton>(R.id.btn_min)

        tapCount.setOnClickListener {
            number++
            text.text = number.toString()

        }

        resetCount.setOnClickListener {
            number = 0
            text.text = number.toString()
        }

        minCount.setOnClickListener {
            number--
            text.text = number.toString()
        }

    }
}