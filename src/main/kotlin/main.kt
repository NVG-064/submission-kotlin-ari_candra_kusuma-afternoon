import kotlin.system.exitProcess

fun main(args: Array<String>) {
  // Initialize some data for example
  var variable03 = "Ari Candra Kusuma"

  // Simulate clear screen by print lines
  // Because there's no way to interact clear lines on IntelliJ IDEA
  // Source: https://stackoverflow.com/questions/2979383/how-to-clear-the-console

  // Infinite loop reference:
  // https://stackoverflow.com/questions/65266730/infinite-loop-in-kotlin-using-for-loop
  while (true) {
    clearScreen()
    homepage()

    when (readlnOrNull() ?: "999") {
      "0" -> exitProcess(0) // Reference: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.system/exit-process.html
      "3" -> {
        while (true) {
          clearScreen()
          pageKotlinFundamental()

          when (readlnOrNull() ?: "999") {
            "0" -> break
            "1" -> {
              clearScreen()
              println("\t\t(3.1) Variables")
              println("==================================")
              println("(a)\tChangeable variable\n")
              changeableVariable(variable03)
              println("(b)\tUnchangeable variable\n")
              unchangeableVariable(variable03)
              getchImitation()
            }
          }
        }
      }
    }
  }
}

fun clearScreen() {
  for (i in 1..50) print("\r\n")
}

fun getchImitation() {
  print("Press ENTER key to continue...")
  readlnOrNull()
}

fun homepage() {
  println("\t\tHomepage")
  println("==================================")
  println("(3)\tKotlin Fundamental")
  println("(4)\tKotlin Control Flow")
  println("(5)\tKotlin Collection\n")
  println("(0)\tExit\n")
  print("Select: ")
}

fun pageKotlinFundamental() {
  println("\t\tKotlin Fundamental")
  println("==================================")
  println("(1)\tVariables")
  println("(2)\tData Types")
  println("(3)\tFunctions")
  println("(4)\tIf Expressions")
  println("(5)\tNullable Types")
  println("(6)\tSafe Calls")
  println("(7)\tElvis Operators")
  println("(8)\tString Templates\n")
  println("(0)\tReturn to Homepage\n")
  print("Select: ")
}
