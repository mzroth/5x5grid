package com.example.a5x5grid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.drawable.ColorDrawable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listOf(
            button1_1, button1_2, button1_3, button1_4, button1_5,
            button2_1, button2_2, button2_3, button2_4, button2_5,
            button3_1, button3_2, button3_3, button3_4, button3_5,
            button4_1, button4_2, button4_3, button4_4, button4_5,
            button5_1, button5_2, button5_3, button5_4, button5_5
        ).forEach {
            it.setOnClickListener {
                val color = (it.background as? ColorDrawable)?.color
                when(color) {
                    R.color.button_default -> it.setBackgroundColor(ContextCompat.getColor(this, R.color.button_pressed))
                    R.color.button_pressed -> it.setBackgroundColor(ContextCompat.getColor(this, R.color.button_default))
                }
            }
        }
    }
}
