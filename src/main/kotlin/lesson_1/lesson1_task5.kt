package lesson_1

fun main() {
    val secondsInSpace = 6480

    val minutes = (secondsInSpace / 60)
    val hours = minutes / 60

    val remainingSeconds = secondsInSpace % 60
    val remainingMinutes = minutes % 60

    val timeString = String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds)
    println(timeString)
}

