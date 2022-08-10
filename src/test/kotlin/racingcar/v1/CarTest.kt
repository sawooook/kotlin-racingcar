package racingcar.v1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CarTest {

    @Test
    fun `자동차 객체를 성공적으로 생성한다`() {
        val result = Car(CarName("자동차"), CarMove(0))

        assertEquals(result.move.count, 0)
        assertEquals(result.name.title, "자동차")
    }
}