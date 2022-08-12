package racingcar.domain

import racingcar.domain.strategy.MoveStrategy

class Car(
    val nameValue: NameValue,
    val locationValue: LocationValue
) {
    fun move(moveStrategy: MoveStrategy): Car {
        if (moveStrategy.isMovable()) {
            locationValue.up()
        }

        return this
    }
}