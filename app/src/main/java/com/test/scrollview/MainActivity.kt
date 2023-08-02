package com.test.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.HorizontalScrollView
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.test.scrollview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private var items = arrayListOf<listData>()
    lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        adapter = Adapter(items, this)
        binding.list.adapter = adapter

        for (i in 0..30) {
            items.add(
                listData(
                    ""
                )
            )
        }
        adapter.notifyDataSetChanged()

    }
}