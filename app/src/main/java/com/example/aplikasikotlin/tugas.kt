package com.example.aplikasikotlin
fun main(args: Array<String>) {
    biodata("Diaz Azkha Varissa", 19)
    hobby("membaca", "membaca au")
}

fun biodata(name:String, age:Int){
    // minimal 2 parameter/args
    println("===============================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("===============================")
}

fun hobby(hobby:String, desc:String){
    println("Saya suka $hobby")
    println("Yang saya baca adalah $desc")
}