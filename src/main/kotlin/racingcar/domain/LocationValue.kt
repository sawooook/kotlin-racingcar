package racingcar.domain

data class LocationValue(
    var location: Int
) {

    fun up() {
        location += 1
    }

    fun isMaxLocation(highLocation: Int): Boolean = (highLocation == location)
}