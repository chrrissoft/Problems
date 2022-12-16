package medium

class NextPermutation {

    fun execute(list: List<Int>) : List<Int> {

        val lastIndex = list.size - 1
        var indexToSort = lastIndex

        list.forEachIndexed { i, e ->
            if (i in 1 until lastIndex) {
                if (e > list[i + 1] && e > list[i - 1]) indexToSort = i
            }
        }

        return sort(indexToSort, list.toMutableList())
    }

    private fun sort(index: Int, list: MutableList<Int>) : List<Int> {
        println(index)
        val beforeElement = list[index - 1]
        list.removeAt(index - 1)
        list.add(index, beforeElement)
        return list
    }


}