package com.example.testrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        binding.myTextView.setText("Text")
        binding.myButton.setOnClickListener {
            Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show()
        }

    }
}