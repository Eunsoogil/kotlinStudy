package com.study.learningkotlin.kotlin

fun main() {
    // null을 assign할 수 없다
    // var name: String = null

    // null일수도 있다고 선언 가능
    var name: String? = null

    // nullable 변수를 아래와 같이 사용하면 에러 발생
    // println(name.uppercase())

    // 아래 처럼도 가능
    var myInteger: Int? = 9
    myInteger = null

    name = "Matt"
    // smart casting
    println(name.uppercase())

    var name2: String? = null
    if (name2 != null) {
        // smart casting
        println(name2.uppercase())
    }

    // null 출력
    println("$name2".uppercase())

    // null-safe operator
    // 메소드를 실행하거나, null인 경우 실행하지 않음
    var name3: String? = null
    println(name3?.uppercase())

    // non-null asserted operator
    // null일시 에러 발생
    println(name3!!.uppercase())

    // 타입을 선언하지 않는 경우
    // 해당 변수는 Nothing object 타입이다
    var address = null

    // 에러 발생
    // address = "Hello"
}