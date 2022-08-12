package racingcar.domain

import racingcar.domain.strategy.MoveStrategy

class Racing(
    private val carList: List<Car>
) {

    fun start(moveStrategy: MoveStrategy): List<Car> =
        carList.map { it.move(moveStrategy) }

    fun getWinner(): List<Car> {
        val winnerCar = mutableListOf<Car>()
        val highLocation = getHighLocation(carList)

        carList.forEach {
            if (it.locationValue.isHighLocation(highLocation)) {
                winnerCar.add(it)
            }
        }

        return winnerCar
    }

    private fun getHighLocation(carList: List<Car>): Int {
        var highLocation = Integer.MIN_VALUE
        carList.forEach {
            if (highLocation < it.locationValue.location) {
                highLocation = it.locationValue.location
            }
        }

        return highLocation
    }
}