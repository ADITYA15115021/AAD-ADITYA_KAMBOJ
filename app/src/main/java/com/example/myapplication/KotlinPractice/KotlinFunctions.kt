package com.example.myapplication.KotlinPractice


fun main(): Unit {
    println("hello");

    println( addNumbers(2,5) )
    divide(4,2)
    EvenOrOdd(11)
    printSum(10);

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



fun EvenOrOdd( num : Int){

    if( num%2 == 0)
        println("even number")
    else
        println("odd number")
}

fun printSum( num : Int ){
    var sum : Int = 0;
    for( x in 1..num ){
        sum = sum + x;
    }
    println(sum)
}



