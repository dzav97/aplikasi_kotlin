package com.example.aplikasikotlin

class House {
    val houseColor:String = "white"
    val numberOfWindows:Int = 2
    val isForSale:Boolean = false

    fun updateColor(){

    }

    fun putOnSale(){

    }
}

fun main(){
    val A1 = House()
    val A2 = House()
    val A3 = House()

    println(A1.houseColor)
    println("=".repeat(20))
    println(A2)
    println("=".repeat(20))
    println(A3)
}