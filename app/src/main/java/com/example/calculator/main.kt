package com.example.calculator

fun main() {
    val calculator = Calculator()
    calculator.caculator()

}

class Calculator() {
    fun caculator() {
        println("연습용 텍스트 계산기 입니다.")
        println("첫번째 수를 입력해주세요")
        var num1 = readLine()?.toInt()!!

        println("두번째 수를 입력해주세요")
        var num2 = readLine()?.toInt()!!

        println("연산기호를 입력해주세요 (+, - , *, /,%) ")
        var operator = readLine()

        var result: String = when (operator) {
            "+" -> (num1 + num2).toString()
            "-" -> (num1 - num2).toString()
            "*" -> (num1 * num2).toString()
            "/" -> (num1 / num2).toString()
            "%" -> (num1 % num2).toString()
            else ->
                "잘못된 접근입니다 다시 작성해주세요" //

        }
        println("결과: $result ")
    }
}



class AddOperation() {

}
class SubstractOperration() {

}


class MultiplyOperation() {

}

class DivideOperation() {

}