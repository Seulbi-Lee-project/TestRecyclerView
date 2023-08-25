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

        // 데이터 원본 준비
        val dataList = mutableListOf<MyItem>()
        dataList.add(MyItem(R.drawable.sample10, "Bella", "1"))
        dataList.add(MyItem(R.drawable.sample1, "Charlie", "2"))
        dataList.add(MyItem(R.drawable.sample2, "Daisy", "1.5"))
        dataList.add(MyItem(R.drawable.sample3, "Duke", "1"))
        dataList.add(MyItem(R.drawable.sample4, "Max", "2"))
        dataList.add(MyItem(R.drawable.sample5, "Happy", "4"))
        dataList.add(MyItem(R.drawable.sample6, "Luna", "3"))
        dataList.add(MyItem(R.drawable.sample7, "Bob", "2"))

        // 어댑터 생성 및 연결
        binding.listView.adapter = MyAdapter(this, dataList)

        // 항목 클릭 이벤트 처리
        binding.listView.setOnItemClickListener{ parent, view, position, id ->
            val name: String = (binding.listView.adapter.getItem(position) as MyItem).aName
            Toast.makeText(this," $name 선택!", Toast.LENGTH_SHORT).show()
        }

    }
}