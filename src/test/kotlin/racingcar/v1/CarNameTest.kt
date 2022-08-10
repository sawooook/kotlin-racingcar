package racingcar.v1

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CarNameTest {

    @Test
    fun `자동차의 이름이 5자리를 넘으면 오류가 발생한다`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            CarName("테스트입니다")
        }
    }
}