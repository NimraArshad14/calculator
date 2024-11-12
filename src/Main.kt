


fun main() {
    while (true) {
        println("Simple Calculator")
        println("1. Addition")
        println("2. Subtraction")
        println("3. Multiplication")
        println("4. Division")
        println("5. Exit")

        print("Enter your choice: ")
        val choice = readLine()!!

        if (choice == "5") {
            break
        }

        print("Enter first number: ")
        val num1 = readLine()!!.toDouble()

        print("Enter second number: ")
        val num2 = readLine()!!.toDouble()

        when (choice) {
            "1" -> println("$num1 + $num2 = ${num1 + num2}")
            "2" -> println("$num1 - $num2 = ${num1 - num2}")
            "3" -> println("$num1 * $num2 = ${num1 * num2}")
            "4" -> {
                if (num2 != 0.0) {
                    println("$num1 / $num2 = ${num1 / num2}")
                } else {
                    println("Error: Division by zero!")
                }
            }
            else -> println("Invalid choice!")
        }
    }
}


