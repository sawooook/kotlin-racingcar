package racingcar.v1

class Racing(
    private val carList: List<Car>,
    private val randomNumberList: MutableList<Int>
) {

    fun start(): List<Car> =
        carList.mapIndexed { index, car ->
            if (isWin(randomNumberList[index])) {
                car.move.updateCount()
            }

            car.printName()

            car
        }


    private fun isWin(randomNumber: Int): Boolean = randomNumber >= 4
}
