package lesson_3


const val WELCOME_MESSAGE_DAY = "Good afternoon"
const val WELCOME_MESSAGE_NIGHT = "Good evening"

fun main() {

    val name = "Kirill"

    var welcomeMessage = "$WELCOME_MESSAGE_DAY $name"
    println(welcomeMessage)

    welcomeMessage = "$WELCOME_MESSAGE_NIGHT $name"
    println(welcomeMessage)
}