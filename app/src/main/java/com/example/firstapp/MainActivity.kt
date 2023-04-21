package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload=findViewById<Button>(R.id.buttonupload)
        val buttonDownload=findViewById<Button>(R.id.buttonDownload)

        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext, "Uploading..",Toast.LENGTH_LONG).show()
        }
        buttonDownload.setOnClickListener{
            Toast.makeText(applicationContext,"Downlaoding..",Toast.LENGTH_LONG).show()
        }
    }
}