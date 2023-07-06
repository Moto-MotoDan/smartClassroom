package com.example.iotfinal

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // スプラッシュ画面の表示時間（ミリ秒）
        val splashDisplayLength = 1000000L

        // メインのアクティビティに遷移するための Intent
        val mainIntent = Intent(this, MainActivity::class.java)

        // スプラッシュ画面を表示後、メインのアクティビティに遷移する
        Handler().postDelayed({
            startActivity(mainIntent)
            finish()
        }, splashDisplayLength)
    }
}
