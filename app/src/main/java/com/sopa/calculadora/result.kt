package com.sopa.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sopa.calculadora.databinding.ActivityResultBinding

class result : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
}