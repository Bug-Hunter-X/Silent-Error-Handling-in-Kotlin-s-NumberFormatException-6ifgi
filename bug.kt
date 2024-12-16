```kotlin
fun processData(data: String): Int {
    try {
        return data.toInt()
    } catch (e: NumberFormatException) {
        // Log error appropriately.  Simply returning 0 is often insufficient.
        println("Error converting to Int: "+ e.message)
        return 0 // Or throw a custom exception
    }
}

fun main() {
    val input = "abc" 
    val result = processData(input)
    println("Result: $result") //This prints 0 which may not always be expected
}
```