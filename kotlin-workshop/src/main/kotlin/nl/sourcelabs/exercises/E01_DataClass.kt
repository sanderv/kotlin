package nl.sourcelabs.exercises

import java.time.LocalDate
import java.time.Period

data class Person(var firstName: String,
                  var lastName: String,
                  var birthDate: LocalDate,
                  var emailAddress: String) {

    fun getFullName() = firstName + " " + lastName

    fun ageAt(refDate: LocalDate): Int = Period.between(birthDate, refDate).years
}

fun main(args: Array<String>) {
    val p = Person("Sander", "Verbruggen", LocalDate.of(1974, 1, 29), "s@v.ws")
    print(p.getFullName())
    println(" is " + p.ageAt(LocalDate.of(2000, 1, 1)))

    println(p.hashCode())
    println(p.toString())

    val op = p.copy(birthDate = LocalDate.of(2000,1,1))
    println(op.toString())
}
/**
 * Assignment:
 *
 *  - Write a simple data class, for a Person.
 *      Properties: firstName (String), lastName (String), birthDate(LocalDate), emailAddress (String)
 *      All properties are immutable, except for email which can be modified.
 *
 * - Add a way to get the full name for the person, which is firstName and lastName together
 *
 * - Add a function to get the persons age at a given date
 *      -> ageAt(date)
 *
 * - Write a main function that creates a new person and prints the toString, hashcode, fullname and age on 2000/1/1 for the person
 *
 * - Also in the main function, create a copy of the original person with a different birthdate and print the tostring
 */


