package racingcar.domain

import racingcar.domain.strategy.MoveStrategy

class Racing(
    private val carList: List<Car>
) {

    fun start(moveStrategy: MoveStrategy): List<Car> = carList.map { it.move(moveStrategy) }

    fun getWinner(): List<Car> =
        carList.filter {
            it.locationValue.isMaxLocation(
                getMaxLocation(carList)
            )
        }

    private fun getMaxLocation(carList: List<Car>): Int =
        carList.maxOfOrNull { it.locationValue.location }
            ?: throw IllegalArgumentException("자동차의 위치가 존재하지 않습니다.")
}