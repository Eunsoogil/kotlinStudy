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

    // 전역 클래스 (public static class) 처럼 사용하기 위함
    // 엄밀히 말하면 static 이 아니다
    companion object {
        fun getInstance() = AnotherAlternativeCustomer2("Micky", 22, "some address")
    }

    // destructing 가능
    operator fun component1() = name
    operator fun component2() = age

}


// data class : toString, hashCode 등 메소드 자동 생성
data class Customer6(
    val name : String,
    val address : String,
    var age : Int) {

    // secondary constructor
    constructor(name: String, age: Int) : this(name, "", age)

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

    val anotherCustomer3 = AnotherAlternativeCustomer2.getInstance()
    println(anotherCustomer3)

    val dataClassCustomer = Customer6("Jimmy", 33)
    println(dataClassCustomer)
    val copyCustomer = dataClassCustomer.copy(name="Diane")
    println(copyCustomer)

    // unpacking, 코틀린에서는 destructing
    val (name, age, address) = copyCustomer
    println("$name, $age, $address")

    // data class가 아닌데 operator fun을 이용한 destructing
    val (test1, test2) = anotherCustomer3
    println("$test1, $test2")
}
