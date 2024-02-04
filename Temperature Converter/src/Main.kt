fun main() {
    println("Choose an option: ")
    println("1. Convert to Fahrenheit")
    println("2. Convert to Degree Celsius")
    println("3. Convert from Degree Celsius to Kelvin")
    println("4. Convert from Fahrenheit to Kelvin")
    println("5. Convert from Kelvin to Degree Celsius")
    println("6. Convert from Kelvin to Fahrenheit")
    print("Option: ")
    val optionSelected = readln().toInt()
    print("Enter the temperature: ")
    val temp = readln().toDouble()
    println(temperatureConverter(optionSelected, temp))
}

fun temperatureConverter(option: Int, temp: Double): Comparable<*> {
    val convertedTemperature = when (option) {
        1 -> (temp * (9.0 / 5) + 32)
        2 -> (temp - 32) * (5.0 / 9)
        3 -> temp + 273.15
        4 -> (temp - 32) * (5.0 / 9) + 273.15
        5 -> temp - 273.15
        6 -> ((temp - 273.15) * (9.0 / 5) + 32)
        else -> "Wrong Input"
    }
    return convertedTemperature
}
