package racingcar.v1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CarMoveTest {

    @Test
    fun `move()를 하게 되면 움직임 숫자가 1 증가한다`() {
        val result = CarMove(0).updateCount()

        Assertions.assertEquals(result.count, 1)
    }
}