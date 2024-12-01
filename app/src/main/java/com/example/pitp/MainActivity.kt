package com.example.pitp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity]

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNavigate = findViewById<Button>(R.id.buttonNavigate)
        buttonNavigate.setOnClickListener {
            val intent = Intent(this, Secondactitvity::class.java)
            startActivity(intent)
        }
    }
}
