package com.Arson

fun main(args: Array<String>) {
//    println("Hello kotlin")
//   Human().hello()
    val h = Human()
    h.hello()
    var age : Long = 28
    age = 29
    val weight = 58.6
    val name : String
    name = "Arson"
}

class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}