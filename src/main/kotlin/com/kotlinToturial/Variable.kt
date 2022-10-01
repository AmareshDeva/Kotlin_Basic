package com.kotlinToturial

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext
import jdk.nashorn.internal.ir.CallNode.EvalArgs
import java.lang.StringBuilder

typealias Employeeset = Set<Employee>
fun main(args: Array<String>){
    val number=100
    var number1 = 25
    number1 = 200
    val employee: Employeeset
    /*println(number)
    println(number1)*/
    var employee1 = Employee(100,"Amaresh","Developer", 12400.toDouble())
    /*var employee2 = Employee(101,"Leela","Testing", 400000.toDouble())
    println(employee1.name+" "+employee1.destination+" "+employee1.salary+" "+employee1.id)
    println(employee2.name+" "+employee2.destination+" "+employee2.salary+" "+employee2.id)*/

    /*val name = arrayListOf("Amaresh","Leela","Devaraj","Amsa")
    print(name[1])*/

    /*val name: String = "Amaresh"
    println(name.length)
    println(name.get(0)+" "+name.get(1))
    println(name.compareTo("amaresh"))
    println(name.compareTo("Amaresh"))
    println("--equals--->>"+name.equals("Amaresh"))
    println(name.substring(0,3))*/

    val a: Int = 10
    val b: Int = 20
    val c: Int = 30
    var d: Int = 40
 /*   println(a>b ? c:d)*/



}
class Employee(var id: Int,var name: String, var destination: String,var salary: Double)