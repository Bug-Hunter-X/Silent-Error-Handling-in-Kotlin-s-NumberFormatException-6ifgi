# Silent Error Handling in Kotlin's NumberFormatException

This example demonstrates a common issue in Kotlin where exception handling can silently mask errors. The `processData` function attempts to convert a string to an integer. If the conversion fails (NumberFormatException), it currently returns 0 without providing informative feedback.  This behavior can be problematic, as the calling function may not be aware of the error. 

The solution shows improved error handling that provides more context.