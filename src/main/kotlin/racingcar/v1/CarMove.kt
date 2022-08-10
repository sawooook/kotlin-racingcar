package racingcar.v1

class CarMove(
    var count: Int
) {
    fun updateCount(): CarMove {
        count += 1
        return this
    }

    fun isMaxMoveCount(maxMoveCount: Int): Boolean = (count == maxMoveCount)
}