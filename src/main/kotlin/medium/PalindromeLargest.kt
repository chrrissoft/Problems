package medium

class PalindromeLargest {

    fun execute(string: String): String {

        var largestStringRegister = ""
        var substringContainer = ""

        string.forEach {
            if (it.toString() != " ") {
                substringContainer = substringContainer.plus(it)
                return@forEach
            }

            if (substringContainer.reversed() == substringContainer) {
                val isMoreLarge = substringContainer.length > largestStringRegister.length
                if (isMoreLarge) largestStringRegister = substringContainer
            }

            substringContainer = ""
        }

        return largestStringRegister
    }

}