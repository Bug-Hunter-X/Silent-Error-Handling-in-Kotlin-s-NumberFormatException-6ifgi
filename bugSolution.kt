```kotlin
fun processData(data: String): Int {
    return try {
        data.toInt()
    } catch (e: NumberFormatException) {
        // Log error appropriately.  Simply returning 0 is often insufficient.
        println("Error converting to Int: "+ e.message)
        throw IllegalArgumentException("Invalid input: $data", e) //Re-throw a more informative exception
    }
}

fun main() {
    val input = "abc" 
    try {
        val result = processData(input)
        println("Result: $result") 
    } catch (e: IllegalArgumentException) {
        println("Exception caught: "+ e.message)
    }
}
```