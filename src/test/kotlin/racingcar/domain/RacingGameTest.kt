package racingcar.domain

import io.kotest.matchers.sequences.sorted
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import racingcar.domain.strategy.FakeMoveStrategy

class RacingGameTest {

    @Test
    fun `자동차 레이싱 경주의 승자를 구한다`() {
        val result = RacingGame("test", 1)
            .start(FakeMoveStrategy(5))

        result.forEach {
            assertEquals(it.locationValue.location, 1)
            assertEquals(it.nameValue.name, "test")
        }
    }
}