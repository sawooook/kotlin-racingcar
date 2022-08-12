package racingcar.domain.strategy

import racingcar.domain.util.MOVE_BOUNDARY
import racingcar.domain.util.NUMBER_RANGE

class RandomMoveStrategy : MoveStrategy {

    override fun isMovable(): Boolean = (NUMBER_RANGE.random() >= MOVE_BOUNDARY)
}