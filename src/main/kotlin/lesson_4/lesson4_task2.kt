package lesson_4

import kotlin.io.println

fun main() {

    val minAverageWeight = 36
    val maxAverageWeight = 100
    val maxAverageVolume = 99

    val firstCargoWeight = 20
    val firstCargoVolume = 80

    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println(
        "Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л соответствует категории 'Average': " +
                (firstCargoWeight > minAverageWeight &&
                        maxAverageWeight <= firstCargoWeight &&
                        firstCargoVolume < maxAverageVolume)
    )
    println(
        "Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л соответствует категории 'Average': " +
                (secondCargoWeight > minAverageWeight &&
                        maxAverageWeight <= secondCargoWeight &&
                        secondCargoVolume < maxAverageVolume))

}
