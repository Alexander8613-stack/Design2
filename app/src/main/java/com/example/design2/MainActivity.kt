package com.example.design2

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val yellowView = View(this)
        yellowView.setBackgroundColor(resources.getColor(R.color.yellow))
        val yellowParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            0
        )
        yellowParams.weight = 0.5f
        layout.addView(yellowView, yellowParams)

        val redView = View(this)
        redView.setBackgroundColor(resources.getColor(R.color.red))
        val redParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            0
        )
        redParams.weight = 0.85f
        layout.addView(redView, redParams)

        val blueView = View(this)
        blueView.setBackgroundColor(resources.getColor(R.color.blue))
        val blueParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            0
        )
        blueParams.weight = 0.8f
        layout.addView(blueView, blueParams)

        setContentView(layout)
    }
}