package racingcar.v1

class CarName(
    val title: String
) {
    init {
        if (isNameMaxSize()) {
            throw IllegalArgumentException("이름은 5자를 초과 할 수 없습니다.")
        }
    }

    private fun isNameMaxSize(): Boolean = title.length > 5
}