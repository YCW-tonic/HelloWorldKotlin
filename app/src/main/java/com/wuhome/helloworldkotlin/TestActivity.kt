package com.wuhome.helloworldkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wuhome.helloworldkotlin.databinding.ActivityMainBinding
import com.wuhome.helloworldkotlin.databinding.ActivityTestBinding

class TestActivity: AppCompatActivity() {
    private lateinit var binding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageViewII.setImageResource(R.mipmap.ic_launcher)
    }
}