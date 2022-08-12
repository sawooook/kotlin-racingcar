package racingcar.controller

import racingcar.domain.RacingGame
import racingcar.domain.strategy.RandomMoveStrategy
import racingcar.view.StartRacingView
import java.util.*

fun main() {
    println("====== START ====== ")
    val scanner = Scanner(System.`in`)

    StartRacingView.getName()
    val racingCarList = scanner.nextLine()

    StartRacingView.getRacingCount()
    val racingCount = scanner.nextInt()

    val result = RacingGame(racingCarList, racingCount)
        .start(RandomMoveStrategy())

    result.forEach {
        println(it.locationValue.location)
        println(it.nameValue.name)
    }
}