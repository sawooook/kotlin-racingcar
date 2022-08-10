package racingcar.v1

data class Car(
    val name: CarName,
    val move: CarMove
) {
    fun printName() =
        println("${name.title} : ${getMovePrint(move.count)}")

    private fun getMovePrint(count: Int): String {
        var result = ""
        for (i in 0..count) {
            result += "-"
        }

        return result
    }
}