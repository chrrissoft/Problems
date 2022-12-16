package medium

class SubstringLargestWithoutCharactersRepeat {

    fun execute(string: String) : String {

        var largestStringRegister = ""
        var substringContainer = ""

        string.forEach {
            if (!substringContainer.contains(it))
                substringContainer = substringContainer.plus(it)
            else {
                val isMoreLarge = largestStringRegister.length < substringContainer.length
                if (isMoreLarge) largestStringRegister = substringContainer
                substringContainer = ""
            }
        }

        return largestStringRegister
    }

}