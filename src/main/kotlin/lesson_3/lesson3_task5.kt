package lesson_3

fun main() {

    val messageString = "D2-D4;0"

    val splitMessage = messageString.split(";")
    val moveParts = splitMessage[0]
    val moveNumberParts = splitMessage[1]

    val splitMoveParts = moveParts.split("-")
    val from = splitMoveParts[0]
    val to = splitMoveParts[1]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода $moveNumberParts")
}