package com.example.iotfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.fade_in)

            button1.startAnimation(animation)

            val intent = Intent(this, Sub1lightActivity::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.fade_in)

            button2.startAnimation(animation)

            val intent = Intent(this, Sub2temperatureActivity::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.fade_in)

            button3.startAnimation(animation)

            val intent = Intent(this, Sub3personActivity::class.java)
            startActivity(intent)
        }

        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.fade_in)

            button4.startAnimation(animation)

            val intent = Intent(this, Sub4soundActivity::class.java)
            startActivity(intent)
        }

        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.fade_in)

            button5.startAnimation(animation)

            val intent = Intent(this, Sub5projectorActivity::class.java)
            startActivity(intent)
        }
    }
}