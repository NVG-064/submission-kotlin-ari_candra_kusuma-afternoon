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

    var userInput = readlnOrNull() ?: "999"

    when (userInput) {
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
  println("(0)\tExit")
}

fun pageKotlinFundamental() {

}
