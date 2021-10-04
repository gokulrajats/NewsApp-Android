package com.example.padhnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.padhnews.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.article -> {
                    Toast.makeText(this,"Article",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this,"Search",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.news -> {
                    Toast.makeText(this,"News",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.account -> {
                    Toast.makeText(this,"Account",Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {
                    Toast.makeText(this,"Account",Toast.LENGTH_SHORT).show()
                    true
                }
            }
        }

    }
}