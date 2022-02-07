package com.study.learningkotlin.kotlin

// unit 생략가능
// 별도 클래스 선언하지 않아도 함수 선언 가능 (top level function)
// public static이 default
fun printString(value: String) : Unit {
    println(value)
    // 아래와 같이 매개변수를 재선언 불가능
    // value = 3
}

private fun privatePrintString(value: String) : Unit {
    println(value)
}

// main 메소드에 private 붙이면 동작하지 않음
//private fun main(args: Array<String>) {
//    printString("Hello world")
//}

// 더 간단한 표현
// default value 초기화 가능
private fun addTwoNumbers(one: Double = 6.2, two: Double = 3.9) : Double =
    one + two


// single expression function의 경우 아래와 같이도 선언 가능
//private fun addTwoNumbers(one: Double, two: Double) =
//    one + two

fun printSomeMath(one: Double, two: Double) {
    println("one + two is ${one + two}")
    println("one + two is ${one - two}")

    fun functionWithinFunction(a: String) =
        println(a)

    functionWithinFunction("Done")
}

fun methodTakesLambda(input: String, action: (String) -> Int) {
    println(action(input))
}


fun main(args: Array<String>) {
    printString("Hello world")
    println(addTwoNumbers(3.1, 2.4))
    // default value 사용
    println(addTwoNumbers())
    printSomeMath(3.1, 2.4)
    printSomeMath(two = 3.1, one = 2.4)
}

