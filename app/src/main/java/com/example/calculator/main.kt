package com.example.calculator

fun main() {
    val calculator = Calculator()
    calculator.caculate()//class 에서는 함수 호출이 안된다

}

class Calculator() {
    val addOperation = AddOperation()
    val substractOperration = SubstractOperration()
    val multiplyOperation = MultiplyOperation()
    val divideOperation = DivideOperation()

    // 함수의 호출은 클래스에서 하는게 아닌 클래스의 함수 정의 안에서 호출을 해야된다.
    fun caculate() {
        println("연습용 텍스트 계산기 입니다.")
        println("첫번째 수를 입력해주세요")
        var num1 = readLine()?.toInt()!!

        println("두번째 수를 입력해주세요")
        var num2 = readLine()?.toInt()!!


        println("연산기호를 입력해주세요 (+, - , *, /,%) ")
        var operator = readLine()

        var result: String = when (operator) {
            "+" -> addOperation.add(num1, num2).toString()
            "-" -> substractOperration.substract(num1, num2).toString()
            "*" -> multiplyOperation.multiply(num1, num2).toString()
            "/" -> divideOperation.divide(num1, num2).toString()
            else ->
                "잘못된 접근입니다 다시 작성해주세요" //else의 값이 int가 아닌 string으로 나타내야 하므로 result의 자료형은 String으로 나타낸다.(Int로 나타냈을때 else는 "kotlin.unit"으로 나타났다.


        }
        println("결과: $result ")

    }

}

class AddOperation() {
    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

class SubstractOperration() {
    fun substract(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

class MultiplyOperation() {
    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}

class DivideOperation() {
    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}


//이와 같은 짧은 코드에서는 효율적이지 못한 방법이라 생각이 들지만 회사 차원에서 하는 큰 프로젝트에서는 이런한 방식으로 코드를 짜야 관리하기가 용이해진다.지금부터 버릇을 들여서 해야한다.