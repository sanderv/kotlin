package nl.sourcelabs.exercises

/**
 * Given the three classes below and the main method, retrieve the value from type
 * 'C' or return "Unknown" if you can't determine the value.
 */

class A(val b: B?)

class B(val c: C?)

class C(val value: String)

// Implement
fun extractCValue(a: A): String {
    return a.b?.c?.value ?: "Unknown"
}

fun main(args: Array<String>) {
    val ok = A(B(C("Value")))
    val nok = (A(B(null)))

    println("ok: " + extractCValue(ok))
    println("nok: " + extractCValue(nok))
}