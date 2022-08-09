package calculator.v1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import calculator.StringCalculator


/**
 * 요구사항 정리
 * 1. 쉼표 또는 콜론을 구분자로 가지는 문자열을 전달하는 경우 각 숫자의 합을 반환
 * 2. 기본구분자 외에 커스텀 구분자를 지정할 수 있음
 *    커스텀 구분자 등록 방법 ||;\ <- 커스텀 구분자 등록
 * 3. 문자열 계산기 숫자 이외의 값 또는 음수를 전달하는 경우 예외 리
 *
 * 어떻게 모듈을 나눌 것인가.
 * 1. 특정 문자열을 넣는 모듈
 *    문자열을 넣으면
 *    1단계 - 커스텀 구분 문자가 있는지 확인
 *    2단계 - 커스텀 구분자 + 기본 구분자 등록
 * 2. 등록된 구분자로 숫자를 자르는 기능 추가
 * 3. 더하는 기능추가
 *
 *
 * */
class StringCalculatorTest {

    @Test
    fun `문자열을 넣으면 저장된 등록된 구분자로 나누어 숫자를 저장한다`() {
        val result = StringCalculator("1,2:3").split()

        assertEquals(result.size, 3)
        assertEquals(result[0], "1")
        assertEquals(result[1], "2")
        assertEquals(result[2], "3")
    }


    @Test
    fun `문자열을 넣고, 등록한 커스텀 구분자가 있으면 등록한 후, true를 리턴한다`() {
        val result = StringCalculator("//;\n1;2;3")
            .addCustomSeparate()

        assertEquals(result, true)
    }

    @Test
    fun `문자열을 넣고, 등록한 커스텀 구분자가 없으면 false를 리턴한다`() {
        val result = StringCalculator("1;2;3")
            .addCustomSeparate()

        assertEquals(result, false)
    }

    @Test
    fun `문자열을 넣으면, 커스텀 구분자를 등록 하고 등록된 구분자들을 이용하여 숫자를 저장한다`() {
        val text = "//;\n1;2;3"
        val calculator = StringCalculator(text)
        calculator.addCustomSeparate()
        val result = calculator.split()
        println(result)

        assertEquals(result.size, 3)
        assertEquals(result[0], "1")
        assertEquals(result[1], "2")
        assertEquals(result[2], "3")
    }
}