package com.android.kotlin

//тип данных object.
// Это реализация Singleton. Внутри object все будет Singleton
//в object можно хранить константы
object SomeSingleton {
    val b = 10
    //обращение к данной переменной из других классов возможно через название object

    // но если обращение к переменной будет через java класс, тогда необходимо обращатся через INSTANCE.getB()   Пример в классе Person
}