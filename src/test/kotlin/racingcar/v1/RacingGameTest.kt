package racingcar.v1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class RacingGameTest {

    @Test
    fun `레이싱경주를 시작하고 최종우승자를 구한다`() {
        val result =
            RacingGame(
                text = "pobi,crong,honux",
                racingCount = 3,
                randomNumberQueue = LinkedList(intArrayOf(1, 2, 5, 6, 7, 8, 1, 4, 2).asList())
            ).gameStart()


        assertEquals(result, mutableListOf("crong", "honux"))
    }

    @Test
    fun `레이싱경주를 시작하고 최종우승자가 존재하지 않는다`() {
        val result =
            RacingGame(
                text = "pobi,crong,honux",
                racingCount = 3,
                randomNumberQueue = LinkedList(intArrayOf(1, 2, 5, 6, 7, 8, 1, 4, 2).asList())
            ).gameStart()


        assertEquals(result, mutableListOf("crong", "honux"))
    }
}