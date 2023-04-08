import kotlin.system.exitProcess

fun main(args: Array<String>) {
  // Simulate clear screen by print lines
  // Because there's no way to interact clear lines on IntelliJ IDEA
  // Source: https://stackoverflow.com/questions/2979383/how-to-clear-the-console

  // Infinite loop reference:
  // https://stackoverflow.com/questions/65266730/infinite-loop-in-kotlin-using-for-loop
  while (true) {
    for (i in 1..50) print("\r\n")
    homepage()
    print("Select: ")

    when (readlnOrNull() ?: "999") {
      "0" -> exitProcess(0) // Reference: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.system/exit-process.html
    }
  }
}

fun homepage() {
  println("\t\tHomepage")
  println("============================")
  println("(1)\tKotlin Fundamental")
  println("(2)\tKotlin Control Flow")
  println("(3)\tKotlin Collection\n")
  println("(0)\tExit\n")
}

fun pageKotlinFundamental() {
  println("\t\tKotlin Fundamental")
  println("============================")
  println("(1)\tVariables")
  println("(2)\tData Types")
  println("(3)\tFunctions")
  println("(4)\tIf Expressions")
  println("(5)\tNullable Types")
  println("(6)\tSafe Calls")
  println("(7)\tElvis Operators")
  println("(8)\tString Templates\n")
  println("(0)\tExit\n")
}
