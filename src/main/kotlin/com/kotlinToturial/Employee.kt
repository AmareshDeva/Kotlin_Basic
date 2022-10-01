package com.kotlinToturial

fun main(args: Array<String>){
    val employee1 = Employee1("Amaresh",100)
    val employee2 = Employee1("Leela",200)
    val employee3 = Employee1("Leela",200)
   /* println(employee1.equals(employee2))
    println(employee2.equals(employee3))*/
   /* println(employee1==employee2)
    println(employee2==employee3)
    println(employee1===employee2)
    println(employee2===employee3)*/

    /*var something: Any = employee1
    if (something is Employee1){
        println(something.id)
    }*/

    val x=0x0001
    val y=0x0000
    val z=0x0000
    var a= x and y
    var b= y and z
    println(a)
    println(b)
}
class Employee1(var name: String,val id: Int){
    override fun equals(obj: Any?):Boolean{
        if(obj is Employee1){
            return name==obj.name && id==obj.id
        }
        return false
    }
}