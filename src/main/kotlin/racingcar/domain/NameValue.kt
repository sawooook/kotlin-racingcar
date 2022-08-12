package racingcar.domain

data class NameValue(
    val name: String
) {

    init {
        if (isOverLength()) {
            throw IllegalArgumentException("이름은 5글자를 초과 할 수 없습니다.")
        }

        if (isUnderLength()) {
            throw IllegalArgumentException("이름은 공백일 수 없습니다.")
        }
    }

    private fun isUnderLength(): Boolean = name.isEmpty()

    private fun isOverLength(): Boolean = name.length > 5
}
