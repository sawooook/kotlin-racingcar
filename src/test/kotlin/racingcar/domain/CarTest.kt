package racingcar.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import racingcar.domain.strategy.FakeMoveStrategy
import racingcar.domain.strategy.RandomMoveStrategy

class CarTest {


    @Test
    fun `랜덤숫자가 4이상 나오면 움직인다`() {
        val result = Car(NameValue("자동차"), LocationValue(0))
            .move(FakeMoveStrategy(4))

        assertEquals(result.locationValue.location, 1)
        assertEquals(result.nameValue.name, "자동차")
    }

    @Test
    fun `랜덤숫자가 4미만으로 나오면 움직이지 않는다`() {
        val result = Car(NameValue("자동차"), LocationValue(0))
            .move(FakeMoveStrategy(3))

        assertEquals(result.locationValue.location, 0)
        assertEquals(result.nameValue.name, "자동차")
    }
}