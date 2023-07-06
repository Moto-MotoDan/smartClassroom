package com.example.iotfinal

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.graphics.drawable.Drawable
import android.os.Handler
import android.os.Looper
import android.view.View
import okhttp3.*
import java.util.*
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException

class Sub2temperatureActivity : AppCompatActivity(){

        private lateinit var temperatureButton: Button
        private lateinit var temperatureImage: ImageView

        private val client: OkHttpClient = OkHttpClient()
        private val url: String = "http://192.168.0.1:5001/getTemperature"

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.sub2_temperature)

            temperatureButton = findViewById(R.id.temperatureButton)
            temperatureImage = findViewById(R.id.temperatureImage)

            temperatureButton.setOnClickListener {
                fetchData()
            }
        }

        private fun fetchData() {
            val request = Request.Builder()
                .url(url)
                .build()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    runOnUiThread {
                        showToast("データの取得に失敗しました")
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    val responseBody = response.body?.string()
                    val temperature = responseBody?.toFloatOrNull()

                    if (temperature != null) {
                        runOnUiThread {
                            updateUI(temperature)
                        }
                    } else {
                        runOnUiThread {
                            showToast("データの解析に失敗しました")
                        }
                    }
                }
            })
            val button: Button = findViewById(R.id.buttonBack2)
            button.setOnClickListener {
                finish()
            }
        }

        private fun updateUI(temperature: Float) {
            val message: String
            val imageResId: Int

            when {
                temperature >= 30.0 -> {
                    message = "暑い"
                    imageResId = R.drawable.hot
                }
                temperature <= 15.0 -> {
                    message = "寒い"
                    imageResId = R.drawable.cold
                }
                else -> {
                    message = "普通"
                    imageResId = R.drawable.normal
                }
            }

            showToast("現在の温度: $temperature ℃")
            temperatureImage.setImageResource(imageResId)
        }

        private fun showToast(message: String) {
            Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
        }
}

