package nl.sourcelabs.exercises

import java.math.BigDecimal

/**
 * Write an extension property that easily converts an Int to a BigDecimal
 */

val Int.bigDecimal
    get() = BigDecimal(this)

fun main(args: Array<String>) {
    println(-3.bigDecimal)
}