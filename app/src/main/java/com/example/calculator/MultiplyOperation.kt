package com.example.calculator

class MultiplyOperation(val num1: Int, val num2: Int): AbstractOperation(){
    override fun operate() {
        (num1 * num2).toString()
    }
}