package nl.sourcelabs.exercises

/**
 * Define a toplevel function (not inside a class) "sum" that adds two integers together
 * So you can do sum(1, 1)
 */
fun sum(a: Int, b: Int) = a + b

/**
 * Write the same function as an extension function on class Int,
 * so you can do 1.add(1)
 */
fun Int.add(a: Int) = this + a

/**
 * Rewrite the function so you can call it as follows
 *  "1 plus 1"
 */
infix fun Int.plus(a: Int) = this + a

/**
 * Write a main function to call the functions
 */

fun main(args: Array<String>) {
    println("sum 1 + 1 = " + sum(1, 1))
    println("Int sum 1 + 1 = " + 1.add(1))
    println("infix sum 1 + 1 = " + (1 plus 1))
}
