package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 观察ViewModel中的消息变化
        viewModel.message.observe(this) { message ->
            binding.textView.text = message
        }

        // 设置按钮点击事件
        binding.button.setOnClickListener {
            viewModel.updateMessage()
        }
    }
} 