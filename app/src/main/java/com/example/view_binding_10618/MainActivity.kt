package com.example.view_binding_10618

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.view_binding_10618.databinding.ActivityMainBinding

var binding : ActivityMainBinding? = null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
 //       setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(TaskList.tasksList)
        binding?.taskRv?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}