package com.example.goodwords

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class sentenceActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()

        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("나는 배고프다.")
        sentenceList.add("신은 죽었다.")
        sentenceList.add("나는 생각한다.")
        sentenceList.add("너 자신을 알라.")
        sentenceList.add("늦었다고 생각할때가 진짜 늦었다.")

        val sentenceAdapater = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapater
    }


}