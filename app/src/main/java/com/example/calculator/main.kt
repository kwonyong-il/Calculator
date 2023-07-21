package com.example.calculator

fun main() {
    println("연습용 텍스트 계산기 입니다.")

    println("첫번째 수를 입력해주세요")
    var num1 = readLine()?.toInt()!!

    println("두번째 수를 입력해주세요")
    var num2 = readLine()?.toInt()!!

    println("연산기호를 입력해주세요 (+, - , *, /,%) ")
    var operator = readLine()

    var result: AbstractOperation =
        when (operator) {
            "+" -> AddOperation(num1, num2)
            "-" -> SubstractOperation(num1, num2)
            "*" -> MultiplyOperation(num1, num2)
            "/" -> DivideOperation(num1, num2)
            else
               -> AddOperation(num1, num2)

        }
    val caculater = Calculator(result)
    caculater.caculate()
    println(caculater.caculate())
}

class Calculator(var operator: AbstractOperation) {

    fun caculate(): Double = operator.operate()

}