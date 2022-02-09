package com.study.learningkotlin.kotlin

class Customer {
    val name : String = "Matt"
    val address : String = "High street"
    var age : Int = 20
}


class Book {
    // 하나의 파일에 여러개 생성해도 상관없음
}


class Customer2 {
    val name : String
    val address : String
    var age : Int

    constructor(name: String, address: String, age: Int) {
        this.name = name
        this.address = address
        this.age = age
    }

}


class Customer3(
    val name : String,
    val address : String,
    var age : Int) {

}


class Customer4(
    val name : String,
    val address : String,
    var age : Int) {

    // secondary constructor
    constructor(name: String, age: Int) : this(name, "", age)
}


class Customer5(
    val name : String,
    val address : String,
    var age : Int) {

    constructor(name: String, age: Int) : this(name, "", age){
        println("secondary constructor")
    }

    init {
        println("init block")
    }
}


class AlternativeCustomer (val name: String, var age: Int) {
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }
}

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = "")


// overriding getter and setter, custom getter, setter 제작
class AnotherAlternativeCustomer2(val name: String, var age: Int, val address: String = ""){
    var approved: Boolean = false

    set(value) {
        if (age >= 21) {
            field = value
        } else {
            println("not allow")
        }
    }
    get() {
        return field
    }

    val nextAge
    get() = age + 1

    fun uppercaseName() =
        name.uppercase()

    override fun toString() =
        "$name $address"

}


fun main(args: Array<String>) {
    val customer = Customer()
    customer.age = 22
    println("${customer.name} is ${customer.age} years old")

    val customer5 = Customer5("Matt", 30)
    val anotherCustomer = AnotherAlternativeCustomer("Matt", 25, "somewhere")
    val anotherCustomer2 = AnotherAlternativeCustomer2("John", 11)
    anotherCustomer2.approved = true
    println("${anotherCustomer2.uppercaseName()} next age is ${anotherCustomer2.nextAge}")
}
