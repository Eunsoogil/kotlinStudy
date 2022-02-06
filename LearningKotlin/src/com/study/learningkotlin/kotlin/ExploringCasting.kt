package com.study.learningkotlin.kotlin

import java.math.BigDecimal
import java.util.*

fun main() {
    var result: Any

    val randomNumber = Random().nextInt(3)
    if (randomNumber == 1) {
        result = BigDecimal(30);
    } else {
        result = "hello";
    }

    println("Result is currently ${result}");

    if (result is BigDecimal) {
        // smart casting, if문에서 이미 형이 검증되었으므로 중괄호부터 형이 변해있음
        result = result.add(BigDecimal(47));
    } else {
        // 별도 형변환이 필요한 경우 as 키워드 사용
        val tempResult = result as String
        result = tempResult.uppercase();
    }

    println("Result is currently ${result}");
}