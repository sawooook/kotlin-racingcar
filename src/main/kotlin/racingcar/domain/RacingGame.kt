package racingcar.domain

import racingcar.domain.strategy.MoveStrategy
import racingcar.domain.util.SPLIT_WORD

class RacingGame(
    private val carList: String,
    private val racingCount: Int
) {

    fun start(moveStrategy: MoveStrategy): List<Car> {
        val racingCar = getParticipate(carList)

        repeat(racingCount) {
            Racing(racingCar).start(moveStrategy)
        }

        return Racing(racingCar).getWinner()
    }

    // 참여자 리스트를 구함
    private fun getParticipate(carList: String): List<Car> =
        carList.split(SPLIT_WORD)
            .map { Car(NameValue(it), LocationValue(0)) }
}