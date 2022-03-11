package oreilly.books

import java.math.BigInteger
import acuscorp.printCore

fun main() {
    val time = System.currentTimeMillis()
    println("The factorial of 10 is: ${factorial(10)}")
    showTimeFrom(time)

    println("printig from ")
    printCore()

    // TODO("create other module name controller")


}

fun showTimeFrom(time: Long) = println("Total time consumed: ${(System.currentTimeMillis() - time)} ms")

@JvmOverloads
tailrec fun factorial(
    n: Long,
    acc: BigInteger = BigInteger.ONE
): BigInteger =
    when (n) {
        0L -> BigInteger.ONE
        1L -> acc
        else -> factorial(n - 1, acc * BigInteger.valueOf(n))
    }
