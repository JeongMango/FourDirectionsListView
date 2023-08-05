package com.test.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.widget.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val headerView002 = findViewById<LinearLayout>(R.id.testHeaderView002)

        var startX = 0f

        val listView002 = findViewById<LinearLayout>(R.id.testListView002)
        listView002.setOnTouchListener { v, event ->

//            Log.d("Kimse", "setOnTouchListener : ${event.action}")


            when (event.action) {

                MotionEvent.ACTION_DOWN -> {
                    startX = event.x
                }

                MotionEvent.ACTION_MOVE -> {
                    val movedX: Float = event.x - startX

                    if (v.x + movedX > 420) {
                        v.x = 420f
                        headerView002.x = 420f
                    } else {
                        v.x = v.x + movedX
                        headerView002.x = headerView002.x + movedX
                    }
                }
            }

            return@setOnTouchListener true
        }


        val listView001 = findViewById<LinearLayout>(R.id.testListView001)

        val inflater = LayoutInflater.from(this)


        for (i in 0..100) {
            val itemView = inflater.inflate(R.layout.listitem, null)
            itemView.findViewById<TextView>(R.id.itemTitle).text = "ITEM = ${i}"
            listView001.addView(itemView)
        }

        for (i in 0..100) {
            val itemView = inflater.inflate(R.layout.listitem, null)
            itemView.findViewById<TextView>(R.id.itemTitle).text = "HORIZONTAL SCROLL ITEM = ${i}"
            listView002.addView(itemView)
        }

    }


}