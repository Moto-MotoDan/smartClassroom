package com.example.iotfinal

import android.graphics.Color
import android.view.View
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

class Sub3personActivity : AppCompatActivity() {
    private lateinit var a1: Button
    private lateinit var a2: Button
    private lateinit var a3: Button
    private lateinit var a4: Button

    private lateinit var b1: Button
    private lateinit var b2: Button
    private lateinit var b3: Button
    private lateinit var b4: Button

    private lateinit var c1: Button
    private lateinit var c2: Button
    private lateinit var c3: Button
    private lateinit var c4: Button

    private lateinit var d1: Button
    private lateinit var d2: Button
    private lateinit var d3: Button
    private lateinit var d4: Button

    private lateinit var e1: Button
    private lateinit var e2: Button
    private lateinit var e3: Button
    private lateinit var e4: Button

    private lateinit var f1: Button
    private lateinit var f2: Button
    private lateinit var f3: Button
    private lateinit var f4: Button

    private lateinit var g1: Button
    private lateinit var g2: Button
    private lateinit var g3: Button
    private lateinit var g4: Button

    private lateinit var h1: Button
    private lateinit var h2: Button
    private lateinit var h3: Button
    private lateinit var h4: Button

    private lateinit var i1: Button
    private lateinit var i2: Button
    private lateinit var i3: Button
    private lateinit var i4: Button

    private lateinit var j1: Button
    private lateinit var j2: Button
    private lateinit var j3: Button
    private lateinit var j4: Button

    private lateinit var k1: Button
    private lateinit var k2: Button
    private lateinit var k3: Button
    private lateinit var k4: Button

    private lateinit var l1: Button
    private lateinit var l2: Button
    private lateinit var l3: Button
    private lateinit var l4: Button

    private lateinit var m1: Button
    private lateinit var m2: Button
    private lateinit var m3: Button
    private lateinit var m4: Button

    private lateinit var n1: Button
    private lateinit var n2: Button
    private lateinit var n3: Button
    private lateinit var n4: Button

    private lateinit var o1: Button
    private lateinit var o2: Button
    private lateinit var o3: Button
    private lateinit var o4: Button

    private lateinit var p1: Button
    private lateinit var p2: Button
    private lateinit var p3: Button
    private lateinit var p4: Button

    private lateinit var q1: Button
    private lateinit var q2: Button
    private lateinit var q3: Button
    private lateinit var q4: Button

    private lateinit var r1: Button
    private lateinit var r2: Button
    private lateinit var r3: Button
    private lateinit var r4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sub3_person)

        val button: Button = findViewById(R.id.buttonBack3)
        button.setOnClickListener {
            finish()
        }

        a1 = findViewById(R.id.a1)
        a2 = findViewById(R.id.a2)
        a3 = findViewById(R.id.a3)
        a4 = findViewById(R.id.a4)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)

        c1 = findViewById(R.id.c1)
        c2 = findViewById(R.id.c2)
        c3 = findViewById(R.id.c3)
        c4 = findViewById(R.id.c4)

        d1 = findViewById(R.id.d1)
        d2 = findViewById(R.id.d2)
        d3 = findViewById(R.id.d3)
        d4 = findViewById(R.id.d4)

        e1 = findViewById(R.id.e1)
        e2 = findViewById(R.id.e2)
        e3 = findViewById(R.id.e3)
        e4 = findViewById(R.id.e4)

        f1 = findViewById(R.id.f1)
        f2 = findViewById(R.id.f2)
        f3 = findViewById(R.id.f3)
        f4 = findViewById(R.id.f4)

        g1 = findViewById(R.id.g1)
        g2 = findViewById(R.id.g2)
        g3 = findViewById(R.id.g3)
        g4 = findViewById(R.id.g4)

        h1 = findViewById(R.id.h1)
        h2 = findViewById(R.id.h2)
        h3 = findViewById(R.id.h3)
        h4 = findViewById(R.id.h4)

        i1 = findViewById(R.id.i1)
        i2 = findViewById(R.id.i2)
        i3 = findViewById(R.id.i3)
        i4 = findViewById(R.id.i4)

        j1 = findViewById(R.id.j1)
        j2 = findViewById(R.id.j2)
        j3 = findViewById(R.id.j3)
        j4 = findViewById(R.id.j4)

        k1 = findViewById(R.id.k1)
        k2 = findViewById(R.id.k2)
        k3 = findViewById(R.id.k3)
        k4 = findViewById(R.id.k4)

        l1 = findViewById(R.id.l1)
        l2 = findViewById(R.id.l2)
        l3 = findViewById(R.id.l3)
        l4 = findViewById(R.id.l4)

        m1 = findViewById(R.id.m1)
        m2 = findViewById(R.id.m2)
        m3 = findViewById(R.id.m3)
        m4 = findViewById(R.id.m4)

        n1 = findViewById(R.id.n1)
        n2 = findViewById(R.id.n2)
        n3 = findViewById(R.id.n3)
        n4 = findViewById(R.id.n4)

        o1 = findViewById(R.id.o1)
        o2 = findViewById(R.id.o2)
        o3 = findViewById(R.id.o3)
        o4 = findViewById(R.id.o4)

        p1 = findViewById(R.id.p1)
        p2 = findViewById(R.id.p2)
        p3 = findViewById(R.id.p3)
        p4 = findViewById(R.id.p4)

        q1 = findViewById(R.id.q1)
        q2 = findViewById(R.id.q2)
        q3 = findViewById(R.id.q3)
        q4 = findViewById(R.id.q4)

        r1 = findViewById(R.id.r1)
        r2 = findViewById(R.id.r2)
        r3 = findViewById(R.id.r3)
        r4 = findViewById(R.id.r4)

        a1.setOnClickListener {
            toggleButtonColor(a1)
        }
        a2.setOnClickListener {
            toggleButtonColor(a2)
        }
        a3.setOnClickListener {
            toggleButtonColor(a3)
        }
        a4.setOnClickListener {
            toggleButtonColor(a4)
        }
        b1.setOnClickListener {
            toggleButtonColor(b1)
        }
        b2.setOnClickListener {
            toggleButtonColor(b2)
        }
        b3.setOnClickListener {
            toggleButtonColor(b3)
        }
        b4.setOnClickListener {
            toggleButtonColor(b4)
        }

        c1.setOnClickListener {
            toggleButtonColor(c1)
        }
        c2.setOnClickListener {
            toggleButtonColor(c2)
        }
        c3.setOnClickListener {
            toggleButtonColor(c3)
        }
        c4.setOnClickListener {
            toggleButtonColor(c4)
        }

        d1.setOnClickListener {
            toggleButtonColor(d1)
        }
        d2.setOnClickListener {
            toggleButtonColor(d2)
        }
        d3.setOnClickListener {
            toggleButtonColor(d3)
        }
        d4.setOnClickListener {
            toggleButtonColor(d4)
        }

        e1.setOnClickListener {
            toggleButtonColor(e1)
        }
        e2.setOnClickListener {
            toggleButtonColor(e2)
        }
        e3.setOnClickListener {
            toggleButtonColor(e3)
        }
        e4.setOnClickListener {
            toggleButtonColor(e4)
        }

        f1.setOnClickListener {
            toggleButtonColor(f1)
        }
        f2.setOnClickListener {
            toggleButtonColor(f2)
        }
        f3.setOnClickListener {
            toggleButtonColor(f3)
        }
        f4.setOnClickListener {
            toggleButtonColor(f4)
        }

        g1.setOnClickListener {
            toggleButtonColor(g1)
        }
        g2.setOnClickListener {
            toggleButtonColor(g2)
        }
        g3.setOnClickListener {
            toggleButtonColor(g3)
        }
        g4.setOnClickListener {
            toggleButtonColor(g4)
        }

        h1.setOnClickListener {
            toggleButtonColor(h1)
        }
        h2.setOnClickListener {
            toggleButtonColor(h2)
        }
        h3.setOnClickListener {
            toggleButtonColor(h3)
        }
        h4.setOnClickListener {
            toggleButtonColor(h4)
        }

        i1.setOnClickListener {
            toggleButtonColor(i1)
        }
        i2.setOnClickListener {
            toggleButtonColor(i2)
        }
        i3.setOnClickListener {
            toggleButtonColor(i3)
        }
        i4.setOnClickListener {
            toggleButtonColor(i4)
        }

        j1.setOnClickListener {
            toggleButtonColor(j1)
        }
        j2.setOnClickListener {
            toggleButtonColor(j2)
        }
        j3.setOnClickListener {
            toggleButtonColor(j3)
        }
        j4.setOnClickListener {
            toggleButtonColor(j4)
        }

        k1.setOnClickListener {
            toggleButtonColor(k1)
        }
        k2.setOnClickListener {
            toggleButtonColor(k2)
        }
        k3.setOnClickListener {
            toggleButtonColor(k3)
        }
        k4.setOnClickListener {
            toggleButtonColor(k4)
        }

        l1.setOnClickListener {
            toggleButtonColor(l1)
        }
        l2.setOnClickListener {
            toggleButtonColor(l2)
        }
        l3.setOnClickListener {
            toggleButtonColor(l3)
        }
        l4.setOnClickListener {
            toggleButtonColor(l4)
        }

        m1.setOnClickListener {
            toggleButtonColor(m1)
        }
        m2.setOnClickListener {
            toggleButtonColor(m2)
        }
        m3.setOnClickListener {
            toggleButtonColor(m3)
        }
        m4.setOnClickListener {
            toggleButtonColor(m4)
        }

        n1.setOnClickListener {
            toggleButtonColor(n1)
        }
        n2.setOnClickListener {
            toggleButtonColor(n2)
        }
        n3.setOnClickListener {
            toggleButtonColor(n3)
        }
        n4.setOnClickListener {
            toggleButtonColor(n4)
        }

        o1.setOnClickListener {
            toggleButtonColor(o1)
        }
        o2.setOnClickListener {
            toggleButtonColor(o2)
        }
        o3.setOnClickListener {
            toggleButtonColor(o3)
        }
        o4.setOnClickListener {
            toggleButtonColor(o4)
        }

        p1.setOnClickListener {
            toggleButtonColor(p1)
        }
        p2.setOnClickListener {
            toggleButtonColor(p2)
        }
        p3.setOnClickListener {
            toggleButtonColor(p3)
        }
        p4.setOnClickListener {
            toggleButtonColor(p4)
        }

        q1.setOnClickListener {
            toggleButtonColor(q1)
        }
        q2.setOnClickListener {
            toggleButtonColor(q2)
        }
        q3.setOnClickListener {
            toggleButtonColor(q3)
        }
        q4.setOnClickListener {
            toggleButtonColor(q4)
        }

        r1.setOnClickListener {
            toggleButtonColor(r1)
        }
        r2.setOnClickListener {
            toggleButtonColor(r2)
        }
        r3.setOnClickListener {
            toggleButtonColor(r3)
        }
        r4.setOnClickListener {
            toggleButtonColor(r4)
        }

    }

    private fun toggleButtonColor(button: Button) {
        val currentColor = button.currentTextColor
        val isWhite = currentColor == Color.WHITE
        val newColor = if (isWhite) Color.BLACK else Color.WHITE
        button.setBackgroundColor(newColor)
        button.setTextColor(newColor)
    }
}