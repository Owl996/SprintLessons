package lesson_3

fun main() {

    val messageString = "D2-D4;0"

    val splitMessage = messageString.split("-", ";")

    val from = splitMessage[0]
    val to = splitMessage[1]
    val moveNumberParts = splitMessage[2]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода $moveNumberParts")
}