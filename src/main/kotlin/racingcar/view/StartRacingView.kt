package racingcar.view

class StartRacingView {
    companion object {
        fun getName() {
            println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        }

        fun getRacingCount() {
            println("시도할 횟수는 몇회 인가요?")
        }
    }
}