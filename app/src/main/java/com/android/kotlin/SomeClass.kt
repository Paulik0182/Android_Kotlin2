package com.android.kotlin

import android.util.Log

//все что будет объявлено глобально, все будет видно по всему проекту, файлах Kotlin
val applicationName = "Kotlin"//переменная верхнего уровня (глобальная переменная)
fun globalFun() {
    //можно сделать глобальную функцию
}

class SomeClass(private var name: Double?) {
    // class SomeClass constructor(private val name: String) {// можно записать и так, смысл добавлять слово constructor нет.
    // Если необходимо наследоватся от данного класс, необходимо в начале написать open
    // пример - open class SomeClass constructor(private val name: String) {// можно записать и так, смысл добавлять слово constructor нет.

    init {//продолжение конструктора (блок)

    }

//объевляем конструктор private,
//val переменная которая не может менятся (var - переменная которая может менятся)
//name: String - имя переменной и ее тип, пишется в указанном порядке.


    //все переменные к Kotlin должны быть инициализированы,
// кроме тех случаев когда мы пишим
    private lateinit var something: String //не требует инициализации при объявлении переменной. Инициализируется позже.
    private var something2: String? = null // требует инициализации при объявлении переменной


    fun doSomething(): Boolean {
        // fun doSomething(a: Int, b:Double, vararg string: String): Boolean {// то что в скобках это переданые параметры.
        // protected fun doSomething(a: Int, b:Double, vararg string: String): Boolean { // Если написать в начале protected то это значит, что эта функция будет видна в классе наследника. в других классах не видно.
        // internal fun doSomething(a: Int, b:Double, vararg string: String): Boolean { // Если написать в начале internal то это значит, что эта функция будет видна только в данном проекте (проект - com.android.kotlin).
        // vararg string: String         vararg - это параметр долженбыть  последним и единственным (среди перечисленных параметров).
        name = null

        //doSomething - функция, она пишится с ключевого слова fun
        //: Boolean возвращаемое значение в функции
        // name - значение уже доступно в коде
        // тип переменной в Kotlin пишутся с большой буквы (Int, Double и т.д)


        return true //возвращаем значение
    }


    fun doSomething2(): Boolean {
        val byteArray = arrayOf<Byte>(1, 2, 3)
        //создали массив byteArray, определили что в нем лежит Byte и перечислили его

        val byteArray2 = Array<Byte?>(0) { 0 }
        //второй вариант создания массива
        //знак ? говорит о том, что массив может принимать null, без ? массив не может принять null, будет ошибка.
        //  {0} - значит, что по дефолту там все 0

        //еще варианты создания массива
        val arrayList = ArrayList<String>()
        val arrayList2 = arrayListOf<Int>()
        val arrayList3 = arrayListOf(1, 2, 3, 4) //Kotlin сам вычислил что значение интовое и
        // указавать тип переменной нет необходимости


        // цыклы
        byteArray.forEach {
            Log.i("SomeClass", it.toString())
        }
//вариант 2
//        byteArray.forEach { value -> //явное значение value заменяет it. Тогда обезательно нужно заменить it
//            Log.i("SomeClass", value.toString())
//        }

        for (i in 1..10) {
            Log.i("SomeClass", i.toString())//здесь напечатает значение до 10, последнее 10
        }

        for (i in 1 until 10) {
            Log.i("SomeClass", i.toString())//здесь напечатает значение до 9, последнее 9
        }


        for (i in 10 downTo 1) {
            Log.i("SomeClass", i.toString())// последнее 1
        }

        for (i in 10 downTo 1 step 3) {
            Log.i("SomeClass", i.toString())// напечатаеи 10, 7, 4, 1
        }

        something = "Hello"

        //пример написания в java
        //  if(something2 != null){
        //      var length = something2.length
        //   }
        //пример написания в kotlin
        var length = something2?.length
        //это означает, если something2 равно null, значит правая часть не будет вызвана.
        //ставить ? не хорошо , можно вместо ? поставить !! , но это будет означать,
        //что исполнитель берет на себя ответственность и говорит, что значение не null , в kotlin так лучше не делать.

        // пример записи
        var length1 = if (something2 == null) 10 else 20
        //можно записать еще короче
        var length2 = something2 ?: 10

        secondFun(10, 20)//вызвали функцию и передали параметры, третий параметр будет false
        secondFun(10, 20, true)//вызвали функцию и все три параметры

        //обращение к классу SomeDataClass
        val someData1 = SomeDataClass(1, 2.0)
        val someData2 = SomeDataClass(2, 3.0)
        //сравнение параметров
        val equals = someData1 == someData2
        //можно указать, что someData3 = someData2 и это будет не ссылка на someData2, это будет отдельная ячейка в памяти
        val someData3 = someData2

        applicationName // вызвать переменную верхнего уровня (глобальную переменную)
        globalFun()// вызываем глобальную функцию

        return true //возвращаем значение
    }

    fun secondFun(a: Int, b: Int, isShoudConnect: Boolean? = false) {
        //Функция с передоваемыми пораметрами где isShoudConnect по умолчанию false
    }

    //пример работы с get
    val appVersion1: String
        get() {
            return doSomething().toString()
        }

    //пример работы с set
    var appVersion2: String = ""
        set(value) {
            //обрабатываем value
            field = value//по сути это appVersion2
        }

    //В konlin отсутствует статика, в замен ее есть компонент object
    companion object {
        var a = "" //к данной переменной мы можем обращатся через имя класса . Пример в MainActivity
    }

    //если создаем класс в классе и вложенному классу необходимо использовать переменные класса родителя, то необходимо в начале написать inner
    inner class InnerClass() {
        fun innerFun() {
            name
        }
    }
}
