package com.example.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.testrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        val items = arrayOf<String?>("item1", "item2", "item3", "item4", "item5", "item6", "item7", "item8", "item5", "item6", "item7", "item8", "item5", "item6", "item7", "item8", "item5", "item6",  "item7", "item8")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)

        binding.listView.adapter = adapter

    }
}