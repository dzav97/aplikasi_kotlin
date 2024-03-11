package com.example.aplikasikotlin

fun main(){
    val kali = {x:Int, y:Int, z:String -> "nilai $z = ${x*y}"}
    println(kali(2,3,"2 kali 3"))
}