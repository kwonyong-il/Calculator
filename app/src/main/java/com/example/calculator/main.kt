package com.example.calculator

fun main() {
    println("연습용 텍스트 계산기 입니다.")
    println("첫번째 수를 입력해주세요")
    var num1 = readLine()?.toInt()!!
    println("두번째 수를 입력해주세요")
    var num2 = readLine()?.toInt()!!
    println("연산기호를 입력해주세요 (+, - , *, /,%) ")
    var operator = readLine()

    val caculater = Calculator()
    caculater.caculate()

    val add = AddOperation(num1, num2)
    add.operate()
    val substract = SubstractOperation(num1, num2)
    substract.operate()
    val multiply = MultiplyOperation(num1, num2)
    multiply.operate()
    val divide = DivideOperation(num1, num2)
    divide.operate()

    val result = caculater.caculate()
    println("답은{$result}")
}

class Calculator(val operator: AbstractOperation) {

    fun caculate(): Double = operator.operate()


}
