package racingcar.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import racingcar.domain.strategy.FakeMoveStrategy

class RacingTest {

    @Test
    fun `경기를 시작하고 숫자가 4를 넘지 않으면 움직이지 않는다`() {
        val result = Racing(
            listOf(Car(NameValue("B"), LocationValue(0)))
        ).start(FakeMoveStrategy(3))


        assertEquals(result[0].locationValue.location, 0)
    }

    @Test
    fun `경기를 시작하고 숫자가 4를 넘으면 움직인다`() {
        val result = Racing(
            listOf(
                Car(NameValue("A"), LocationValue(0))
            )
        ).start(FakeMoveStrategy(5))

        assertEquals(result[0].locationValue.location, 1)
    }

    @Test
    fun `가장 많이 움직인 유저들의 클래스를 성공적으로 구한다 - 1명 수상`() {
        val result = Racing(
            listOf(
                Car(NameValue("A"), LocationValue(0)),
                Car(NameValue("B"), LocationValue(1)),
            )
        ).getWinner()

        assertEquals(result[0].nameValue.name, "B")
        assertEquals(result[0].locationValue.location, 1)
    }

    @Test
    fun `가장 많이 움직인 유저들의 클래스를 성공적으로 구한다 - 공동수상`() {
        val result = Racing(
            listOf(
                Car(NameValue("A"), LocationValue(1)),
                Car(NameValue("B"), LocationValue(1)),
            )
        ).getWinner()

        assertEquals(result[0].nameValue.name, "A")
        assertEquals(result[0].locationValue.location, 1)

        assertEquals(result[1].nameValue.name, "B")
        assertEquals(result[1].locationValue.location, 1)
    }
}