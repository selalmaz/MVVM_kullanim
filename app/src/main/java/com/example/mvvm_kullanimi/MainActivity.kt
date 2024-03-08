package com.example.mvvm_kullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvm_kullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainActivityNesnesi = this

        viewModel.sonuc.observe(this){
            binding.hesaplamaSonuc = it
        }
    }

    fun Toplama(alinanSayi1: String,alinanSayi2: String){
        viewModel.toplamaYap(alinanSayi1,alinanSayi2)
    }
    fun carpma(alinanSayi1: String,alinanSayi2: String){
        viewModel.carpmaYap(alinanSayi1,alinanSayi2)
    }
}