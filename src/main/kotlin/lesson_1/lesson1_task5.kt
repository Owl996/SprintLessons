package lesson_1

const val SECONDS_IN_MINUTE = 60

fun main() {

    val secondsInSpace = 6480

    val minutes = (secondsInSpace / SECONDS_IN_MINUTE)
    val hours = (minutes / SECONDS_IN_MINUTE)

    val remainingSeconds = (secondsInSpace % SECONDS_IN_MINUTE)
    val remainingMinutes = (minutes % SECONDS_IN_MINUTE)

    println("%02d:%02d:%02d".format(hours, remainingMinutes, remainingSeconds))
}


