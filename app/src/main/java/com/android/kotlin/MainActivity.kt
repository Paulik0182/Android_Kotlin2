package com.android.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //layoutInflater - это системный сервис

        setContentView(binding.root)//root - это корневой элемент

        //пример обращения к переменной через имя класса
        SomeClass.a
        SomeSingleton.b

        //после добавление и изменения строки 9 и 13 мы можем обратится к тексту активити и что-то с ним сделать, например изменить
        binding.textView.setOnClickListener {
            Toast.makeText(applicationContext, "On text view clicked", Toast.LENGTH_SHORT).show()
        }
    }

    //обращение к Enum
    val carType = SomeEnum.BMW.value
}