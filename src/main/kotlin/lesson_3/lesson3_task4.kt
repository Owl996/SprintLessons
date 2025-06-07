package lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    var moveMessageString = "[$from-$to;$moveNumber]"
    println(moveMessageString)

    from = "D2"
    to = "D3"
    moveNumber = 2

    moveMessageString = "[$from-$to;$moveNumber]"
    println(moveMessageString)
}