package calculator

import java.util.regex.Pattern

class StringCalculator(
    private val text: String
) {
    companion object {
        private const val START_SEPARATE = "//"
        private const val END_SEPARATE = "\n"
    }

    private val separatorSet = mutableSetOf(",", ":")


    fun split(): List<String> {
        val separator = separatorSet.map { it }.toString()
        return text.split(separator.toRegex())
    }

    fun addCustomSeparate(): Boolean {
        val matcher = Pattern.compile("//(.)\n(.*)").matcher(text)
        if (!matcher.find()) {
            return false
        }

        separatorSet.add(matcher.group(0))

        return true
    }
}