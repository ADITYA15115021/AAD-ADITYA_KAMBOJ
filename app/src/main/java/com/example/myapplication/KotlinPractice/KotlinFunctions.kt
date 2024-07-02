package com.example.myapplication.KotlinPractice


fun main(): Unit {
    println("hello");

    println( addNumbers(2,5) )
    divide(4,2)

}


fun addNumbers( a : Int , b : Int) : Int{
    return a + b
}

fun divide(a: Int , b : Int ){

    if( b == 0 )
        println("can't divide by zero")

    else
        println(a/b);
}


