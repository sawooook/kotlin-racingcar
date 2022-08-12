package racingcar.domain.strategy

import racingcar.domain.util.MOVE_BOUNDARY

class FakeMoveStrategy(private val result: Int) : MoveStrategy {
    override fun isMovable(): Boolean = result >= MOVE_BOUNDARY
}
