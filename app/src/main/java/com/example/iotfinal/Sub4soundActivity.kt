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

class Sub4soundActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sub4_sound)

        // OkHttpClientのインスタンスを作成
        val client = OkHttpClient()

// サーバーのAPIエンドポイントを指定
        val url = "http://192.168.0.1:5001/getVolume"

// TextViewのインスタンスを取得
        val soundText: TextView = findViewById(R.id.soundText)

        // 音量情報を解析する関数（適宜実装してください）
        fun parseVolumeInfo(jsonData: String?): Int {
            // JSONデータを解析して音量情報を取得する処理を実装してください
            // ここでは仮に音量情報をランダムに生成しています
            return (1..100).random()
        }
        // 音量情報を取得して表示する関数
        fun getVolumeInfo() {
            val request = Request.Builder()
                .url(url)
                .build()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    // 通信失敗時の処理
                    runOnUiThread {
                        Toast.makeText(applicationContext, "音量情報の取得に失敗しました", Toast.LENGTH_SHORT)
                            .show()
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    val jsonData = response.body?.string()

                    // 取得した音量情報をUIに表示する処理
                    runOnUiThread {
                        // jsonDataを適切に解析して音量情報を取得
                        val volume = parseVolumeInfo(jsonData)

                        // 取得した音量情報をUIに表示する処理（例: TextViewに表示）
                        soundText.text = "Current Volume: $volume"
                    }
                }
            })
        }

        val button: Button = findViewById(R.id.buttonBack4)
        button.setOnClickListener{
            finish()
        }
    }
}