package com.example.bts_ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//클릭시 토스트메시지
        val image1 = findViewById<ImageView>(R.id.bts_image1)
        image1.setOnClickListener {
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            //클릭시 큰사진 화면 띄우기
            val intent = Intent(this, BtsActivity1::class.java)
            startActivity(intent)
        }
        val image2 = findViewById<ImageView>(R.id.bts_image2)
        val image3 = findViewById<ImageView>(R.id.bts_image3)
        val image4 = findViewById<ImageView>(R.id.bts_image4)
        val image5 = findViewById<ImageView>(R.id.bts_image5)
        val image6 = findViewById<ImageView>(R.id.bts_image6)
        val image7 = findViewById<ImageView>(R.id.bts_image7)

        image2.setOnClickListener {
            val intent = Intent(this, BtsActivity2::class.java)
            startActivity(intent)}
        image3.setOnClickListener {
            val intent = Intent(this, BtsActivity3::class.java)
            startActivity(intent)}
        image4.setOnClickListener {
            val intent = Intent(this, BtsActivity4::class.java)
            startActivity(intent)}
        image5.setOnClickListener {
            val intent = Intent(this, BtsActivity5::class.java)
            startActivity(intent)}
        image6.setOnClickListener {
            val intent = Intent(this, BtsActivity6::class.java)
            startActivity(intent)}
        image7.setOnClickListener {
            val intent = Intent(this, BtsActivity7::class.java)
            startActivity(intent)}


    }
}