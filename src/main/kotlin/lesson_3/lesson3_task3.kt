package lesson_3

fun main() {

    val userInput = readln().toIntOrNull()

    if (userInput != null) {
        val multiplicationTable = (1..9).joinToString("\n") { "$userInput * $it = ${userInput * it}" }
        println(multiplicationTable)
    } else
        println("Некорректные данные ")
}