package racingcar.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class NameTest {

    @Test
    fun `자동차의 이름은 5자를 넘을 수 없다`() {
        assertThrows(IllegalArgumentException::class.java) {
            NameValue("다섯글자불가")
        }
    }

    @Test
    fun `자동차의 이름은 빈값일 수 없다`() {
        assertThrows(IllegalArgumentException::class.java) {
            NameValue("")
        }
    }

    @ParameterizedTest
    @ValueSource(strings = ["테", "스트입니"])
    fun `자동차의 이름이 1글자에서 4글자 이면 생성이 자동차 객체 생성이 가능하다`(value: String) {
        val result = NameValue(value)

        assertEquals(result.name, value)
    }

}