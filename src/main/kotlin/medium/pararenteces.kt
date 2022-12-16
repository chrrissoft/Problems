package medium

import java.lang.IllegalArgumentException

fun main() {
//    val instance = Validation()
//    "() (()) (()) (()()) (()())".replace(" ", "").forEach {
//        instance.run(it.toString(), it.toString())
//    }
//    instance.validate()
}

/*
class Validation {

    private var wasUnderflow: Boolean = false
    private val p1 = coule<String>(null)

    fun run(string: String, n: String) {
        when (string) {
            "(" -> p1.enter(n)
            ")" -> p1.downOrUnderflow {
                wasUnderflow = true
            }
            else -> throw IllegalArgumentException()
        }
    }

    fun validate() {
        println(p1.isEmpty() && !wasUnderflow)
    }

}
*/
