fun main() {
    println("Choose an option: ")
    println("1. Convert to Fahrenheit")
    println("2. Convert to Degree Celsius")
    print("Option: ")
    val optionSelected = readln().toInt()
    print("Enter the temperature: ")
    val temp = readln().toDouble()
    println(temperatureConverter(optionSelected,temp))
}

fun temperatureConverter(option: Int,temp: Double): Comparable<*> {
    val convertedTemperature = when(option) {
        1 -> (temp * (9.0/5) + 32)
        2 -> (temp - 32) * (5.0/9)
        else -> "Wrong Input"
    }
    return convertedTemperature
}
