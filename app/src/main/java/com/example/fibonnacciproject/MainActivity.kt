package com.example.fibonnacciproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonnacciproject.databinding.ActivityMainBinding
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fibonacciNumbers = generateFibonacciNumbers(100)
        val adapter = NumbersRecyclerViewAdapter(fibonacciNumbers)

        binding.rvNumbers.adapter = adapter
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
    }

    fun generateFibonacciNumbers(n: Int): List<BigInteger> {
        val result = mutableListOf<BigInteger>()
        var a = BigInteger.ZERO
        var b = BigInteger.ONE
        result.add(a)
        result.add(b)
        for (i in 2..n) {
           val next = a + b
            result.add(next)
            a = b
            b = next
        }
        return result
    }
}