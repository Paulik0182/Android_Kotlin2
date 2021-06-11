package com.android.kotlin

import java.io.Serializable

//это класс который можно копировать, они переопределяют методы иквелс и хешкод.
// Класс реализован как контейнер для какихто палей, логики в этом классе может быть минимум или вообе отсутствовать.

data class SomeDataClass(val a: Int, val b: Double) : Serializable//сериализация
// пример обращения к этому классу в классе SomeClass