package com.example.iotfinal

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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

class Sub1lightActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sub1_light)
        val client: OkHttpClient = OkHttpClient()

        val lite1: Button = findViewById(R.id.lite1)
        lite1.setOnClickListener {
            val url: String = "http://192.168.0.1:5001/turnOnLite1"

            val request = Request.Builder()
                .url(url)
                .get()
                .build()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    runOnUiThread {
                        Toast.makeText(applicationContext, "通信に失敗しました", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    val responseBody = response.body?.string()
                    runOnUiThread {
                        Toast.makeText(applicationContext, "リクエストを送信しました。レスポンス：$responseBody", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }

        val lite2: Button = findViewById(R.id.lite2)
        lite2.setOnClickListener {
            val url: String = "http://192.168.0.1:5001/turnOnLite2"

            val request = Request.Builder()
                .url(url)
                .get()
                .build()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    runOnUiThread {
                        Toast.makeText(applicationContext, "通信に失敗しました", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    val responseBody = response.body?.string()
                    runOnUiThread {
                        Toast.makeText(applicationContext, "リクエストを送信しました。レスポンス：$responseBody", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }

        val lite3: Button = findViewById(R.id.lite3)
        lite3.setOnClickListener {
            val url: String = "http://192.168.0.1:5001/turnOnLite3"

            val request = Request.Builder()
                .url(url)
                .get()
                .build()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    runOnUiThread {
                        Toast.makeText(applicationContext, "通信に失敗しました", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    val responseBody = response.body?.string()
                    runOnUiThread {
                        Toast.makeText(applicationContext, "リクエストを送信しました。レスポンス：$responseBody", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }


            val button: Button = findViewById(R.id.buttonBack1)
            button.setOnClickListener {
                finish()
            }
    }
}