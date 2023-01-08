package com.geektech.lesson6_2kurs3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.lesson6_2kurs3.databinding.ActivityMainBinding
import com.geektech.lesson6_2kurs3.databinding.ItemFoodBinding
import java.text.ParsePosition

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var list= arrayListOf<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()

       val adapter=FoodAdapter(list,this::onClick)
        binding.rvRv.adapter=adapter
    }
    private  fun onClick(position: Int){
        // showToast(position.toString())
    }

    private fun loadData() {
        list.add(Food("Бризоль","https://myastoriya.com.ua/upload/iblock/5f7/5f7bf0a44689c0ac8d20191187c0b76a.jpg"))
        list.add(Food("Лагман","https://myastoriya.com.ua/upload/iblock/5f7/5f7bf0a44689c0ac8d20191187c0b76a.jpg"))
        list.add(Food("Манты","https://myastoriya.com.ua/upload/iblock/5f7/5f7bf0a44689c0ac8d20191187c0b76a.jpg"))
        list.add(Food("Шаурма","https://myastoriya.com.ua/upload/iblock/5f7/5f7bf0a44689c0ac8d20191187c0b76a.jpg"))
        list.add(Food("Бризоль","https://myastoriya.com.ua/upload/iblock/5f7/5f7bf0a44689c0ac8d20191187c0b76a.jpg"))
        list.add(Food("Бризоль","https://myastoriya.com.ua/upload/iblock/5f7/5f7bf0a44689c0ac8d20191187c0b76a.jpg"))
        list.add(Food("Бризоль","https://myastoriya.com.ua/upload/iblock/5f7/5f7bf0a44689c0ac8d20191187c0b76a.jpg"))
    }
}