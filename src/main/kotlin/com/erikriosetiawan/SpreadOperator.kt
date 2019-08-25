package com.erikriosetiawan

fun printNumber(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}
fun main() {
    val numbers = intArrayOf(1, 2, 3)
    printNumber(*numbers)

    val number = intArrayOf(1, 2, 3)
    printNumber(10, 20, *number, 30, 40)
}