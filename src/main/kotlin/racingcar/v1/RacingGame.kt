package racingcar.v1

import java.util.*

class RacingGame(
    private val text: String,
    private val racingCount: Int,
    private val randomNumberQueue: Queue<Int>
) {

    companion object {
        private const val SPLIT_TEXT = ","
        private const val START_RACING_COUNT = 0
    }

    fun gameStart(): MutableList<String> {
        val racingCatSplit = text.split(SPLIT_TEXT)

        // 자동차를 생성한다.
        val makeRacingCar = makeRacingCar(racingCatSplit)

        // 레이싱 경주를 실시한다.
        startRacing(makeRacingCar)

        // 레이싱 경주에서 승자를 구한다
        return getWinnerName(makeRacingCar)
    }

    private fun makeRacingCar(
        racingCatSplit: List<String>
    ) = racingCatSplit
        .map {
            Car(
                CarName(it),
                CarMove(0)
            )
        }

    private fun startRacing(racingCarList: List<Car>) {
        for (i in START_RACING_COUNT until racingCount) {
            Racing(racingCarList, getRandomNumber(racingCarList))
                .start()

            println()
        }
    }

    private fun getRandomNumber(carList: List<Car>): MutableList<Int> {
        val randomNumberList = mutableListOf<Int>()
        for (i in START_RACING_COUNT until carList.size) {
            randomNumberList.add(randomNumberQueue.remove())
        }

        return randomNumberList
    }

    private fun getWinnerName(racingCarList: List<Car>): MutableList<String> {
        val winnerList = mutableListOf<String>()
        var maxMoveCount = Integer.MIN_VALUE

        racingCarList.forEach {
            maxMoveCount = it.move.count.coerceAtLeast(maxMoveCount)
        }

        racingCarList.forEach {
            if (it.move.isMaxMoveCount(maxMoveCount)) {
                winnerList.add(it.name.title)
                it.name
            }
        }

        return winnerList
    }
}
