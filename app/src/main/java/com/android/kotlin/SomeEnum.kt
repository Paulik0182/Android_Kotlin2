package com.android.kotlin

enum class SomeEnum (val value: Int){
    BMW(0), AUDI(1), LADA(2)
    //Если необходимо что бы BMW, AUDI, LADA  соответствовало какое либо значение то необходимо написать (val value: Int), как конструктор
}