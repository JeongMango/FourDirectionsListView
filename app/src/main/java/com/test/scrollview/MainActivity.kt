package com.test.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView1: ListView = findViewById(R.id.listView1)
        val listView2: ListView = findViewById(R.id.listView2)

        // 1번째 리스트뷰 아이템 설정 (상하 스크롤 고정)
        val items1 = mutableListOf<String>()
        for (i in 1..20) {
            items1.add("Item $i")
        }
        val adapter1 = ArrayAdapter(this, android.R.layout.simple_list_item_1, items1)
        listView1.adapter = adapter1

        // 2번째 리스트뷰 아이템 설정 (좌우 스크롤)
        val items2 = mutableListOf<String>()
        for (i in 21..50) {
            items2.add("Item $i")
        }
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_list_item_1, items2)
        listView2.adapter = adapter2
    }
}