package com.example.calculator

abstract class AbstractOperation() {
    abstract fun operate()
    fun result() {
        println("결과는 ${operate()}")
    }
}
