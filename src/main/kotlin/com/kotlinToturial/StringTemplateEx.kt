package com.kotlinToturial

fun main(args: Array<String>){
    val a = 200
    val b= 20
    println("a values $a and b value is $b and total is ${a/b}")
    var emp = Employee2("Amaresh",100)
    println("Employee name: ${emp.name}")
}
class Employee2(var name: String,val id: Int)