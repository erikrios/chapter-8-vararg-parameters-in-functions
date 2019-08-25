package com.erikriosetiawan

fun printNumbers(vararg numbers: Int) {
    for (number in numbers) println(number)
}

fun main() {
    printNumbers(0, 1)
    printNumbers(10, 20, 30, 500)
}