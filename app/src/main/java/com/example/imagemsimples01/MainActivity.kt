package com.example.imagemsimples01

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ivavatar = findViewById<ImageView>(R.id.ivavatar)
        var btalterar = findViewById<Button>(R.id.btalterar)

        var numImagem = 1

        btalterar.setOnClickListener {
            if (numImagem == 1) {
                ivavatar.setImageResource(R.drawable.av2)
                numImagem = 2
            } else {
                ivavatar.setImageResource(R.drawable.av1)
                numImagem = 1
            }
        }

    }
}