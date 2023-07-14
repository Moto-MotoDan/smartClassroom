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

class Sub5projectorActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sub5_projector)

        val buttonOn: Button = findViewById(R.id.buttonOn)
        buttonOn.setOnClickListener {
            val client: OkHttpClient = OkHttpClient()
            val url: String = "http://192.168.0.1:5001/btb?id=1" // サーバのURLを適切なものに変更する必要があります

            val request = Request.Builder()
                .url(url)
                .get()
                .build()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    // 通信失敗時の処理
                    runOnUiThread {
                        Toast.makeText(applicationContext, "通信に失敗しました", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    // 通信成功時の処理
                    val responseBody = response.body?.string()
                    runOnUiThread {
                        Toast.makeText(applicationContext, "リクエストを送信しました。レスポンス：$responseBody", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }

        val button: Button = findViewById(R.id.buttonBack5)
        button.setOnClickListener{
            finish()
        }
    }
}