package com.example.viewsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewsapp.data.News
import com.example.viewsapp.data.NewsModel
import com.example.viewsapp.databinding.ActivityNewsBinding
import com.example.viewsapp.rv.ItemlistNewsAdapter

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsBinding
    private lateinit var adapter: ItemlistNewsAdapter
    private lateinit var data: List<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = layoutInflater
        binding = ActivityNewsBinding.inflate(inflater)
        setContentView(binding.root)

        adapter = ItemlistNewsAdapter()

        binding.rvNews.setHasFixedSize(true)
        binding.rvNews.layoutManager = LinearLayoutManager(this)
        binding.rvNews.adapter = adapter

        data = NewsModel.newslist
        adapter.addData(data)

    }
}