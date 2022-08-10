package racingcar.v1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RacingTest {


    @Test
    fun `3이하의 숫자가 들어오면 앞으로 전진하지 않는다`() {

        val resultCar = Racing(
            listOf(
                Car(CarName("carA"), CarMove(0)),
                Car(CarName("carB"), CarMove(0))
            ), mutableListOf(1, 2)
        ).start()


        assertEquals(resultCar.size, 2)
        assertEquals(resultCar[0].name.title, "carA")
        assertEquals(resultCar[0].move.count, 0)
        assertEquals(resultCar[1].name.title, "carB")
        assertEquals(resultCar[1].move.count, 0)
    }


    @Test
    fun `4이상의 숫자가 들어오면 앞으로 전진한다`() {
        val resultCar = Racing(
            listOf(
                Car(CarName("carA"), CarMove(0)),
                Car(CarName("carB"), CarMove(0))
            ), mutableListOf(4, 5)
        ).start()


        assertEquals(resultCar.size, 2)
        assertEquals(resultCar[0].name.title, "carA")
        assertEquals(resultCar[0].move.count, 1)
        assertEquals(resultCar[1].name.title, "carB")
        assertEquals(resultCar[1].move.count, 1)

    }
}