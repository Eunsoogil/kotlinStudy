package com.study.learningkotlin.kotlin

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main() {
    // mutable variable var
//    var name: String = "Matt"
    // 형을 선언하지 않아도 무관
    var name = "Matt"

    // immutable variable val
//    val surname: String = "Greencroft"
    val surname = "Greencroft"

    name = "John"

//    System.out.println(name + " " + surname)
    // kotlin.io 패키지에서 wrapping한 java method를 더 간결한 문법으로 불러옴
    println(name + " " + surname)

    // 더 간결한 변수 사용
    println("Hello $name $surname")
    println("${surname.uppercase()}, Your first name has ${name.length} characters")
    println("\$name variable has ${name.length} characters")


    val story = """It was a dark and stormy night.
        |A foul smell crept across the city.
        |Jane wondered what time is was, and when it would be daylight.""".trimMargin("|")

    println(story)

    val myDouble = 21.4
    println("${myDouble is Double}")
    println("${myDouble.javaClass}")

    // kotlin.Double 형으로 나온다
    // 자바보다 몇가지 내장 함수가 추가되어 있다
    println("${myDouble::class.qualifiedName}")

    val myInteger = myDouble.roundToInt()
    println("${myInteger::class.qualifiedName}")

    // 아래와 같이 선언하면 안됨, 자바 Integer class를 가져오므로
    // val anotherInteger : Integer = 17

    // 아래와 같이 선언
    val anotherInteger : Int = 17

    // 코틀린 자료구조
    // 상수형이 없다. no literal

    // new 를 하지 않아도 된다
    // val bd : BigDecimal = BigDecimal(17)

    // 혹은 아래처럼도 가능
    val bd = BigDecimal(17)

    val bd2: BigDecimal
    bd2 = bd.add(BigDecimal(30))

    // 함수 return 타입에 선언하면 자바의 void와 같다, 생략 가능
    var myUnit: Unit
}