package com.burcuerdogan.viewbindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.burcuerdogan.viewbindingkotlin.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // private lateinit var textView: TextView

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textView.text = "Code below the onCreate"

        // textView = findViewById<TextView>(R.id.textView)
    }

    fun changeName(view : View) {

        // textView.text = "Name is changed"

        binding.textView.text = "Name is changed"


    }






}