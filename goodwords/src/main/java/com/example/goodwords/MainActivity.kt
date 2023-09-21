package com.example.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰글씨 쓰면 명언같다.")
        sentenceList.add("나는 배고프다.")
        sentenceList.add("신은 죽었다.")
        sentenceList.add("나는 생각한다.")
        sentenceList.add("너 자신을 알라.")
        sentenceList.add("늦었다고 생각할때가 진짜 늦었다.")

        Log.d("MainActivity",sentenceList.random())

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener{
            val intent = Intent(this,sentenceActivity::class.java)
            startActivity(intent)
        }

        binding.goodWordTextArea.setText(sentenceList.random())
    }
}