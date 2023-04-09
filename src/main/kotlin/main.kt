import kotlin.system.exitProcess

fun main(args: Array<String>) {
  // Initialize some data for example
  val variable03 = "Ari Candra Kusuma"
  val char03 = 'G'
  val numberX03 = 16
  val numberY03 = 4
  val name03 = "nVg-064"
  val nullableName04: String? = "NVG-064"
  val time04 = 23
  val dataCollection05: Array<Int> = arrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
  val dataX05: Array<Any> = arrayOf("Simon \"Ghost\" Riley", "Soap MacTavish", "Price", "Task Force", 141, "Gaz", "Roach", "Shepherd") // no Any keyword will throw error
  val dataY05: Array<Any> = arrayOf("Simon \"Ghost\" Riley", "Soap MacTavish", "Price", "Gaz", "Phillip Graves")
  val ghostIdentity: Map<Any, Any> = mapOf(
    "firstName" to "Simon",
    "lastName" to "Riley",
    "callsign" to "Ghost",
    "assignedOn" to "MwReboot"
  )

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
            "2" -> {
              clearScreen()
              println("\t\t(3.2) Data Types")
              println("==================================")
              println("(a)\tCharacter\n")
              charDataType(char03)
              println("(b)\tString\n")
              stringDataType(variable03)
              println("(c)\tBoolean\n")
              booleanDataType(numberX03, numberY03)
              println("(d)\tNumeric\n")
              numericDataType()
              println("(e)\tArray\n")
              arrayDataType()
              getchImitation()
            }
            "3" -> {
              clearScreen()
              println("\t\t(3.3) Functions")
              println("==================================")
              println("(a)\tReturnable Function\n")
              functions()
              getchImitation()
            }
            "4" -> {
              clearScreen()
              println("\t\t(3.4) If Expressions")
              println("==================================")
              println("(a)\tIf Else (with ignore case)\n")
              ifElseExpressions(name03)
              getchImitation()
            }
            "5" -> {
              clearScreen()
              println("\t\t(3.5) Nullable Types")
              println("==================================")
              println("(a)\tNullable variable\n")
              nullableVariable(variable03)
              println("(b)\tAvoid Nullable Variable With If\n")
              avoidNullableWithIf()
              getchImitation()
            }
            "6" -> {
              clearScreen()
              println("\t\t(3.6) Safe Calls")
              println("==================================")
              println("(a)\tUsing safe calls with ?. sign\n")
              safeCalls()
              getchImitation()
            }
            "7" -> {
              clearScreen()
              println("\t\t(3.7) Elvis Operators")
              println("==================================")
              println("(a)\tUsing elvis operator to avoid null output\n")
              elvisOperators()
              getchImitation()
            }
            "8" -> {
              clearScreen()
              println("\t\t(3.8) String Templates")
              println("==================================")
              println("(a)\tString templates using plus (+) sign\n")
              plusStringTemplate(variable03)
              println("(b)\tString templates using dollar ($) sign\n")
              dollarStringTemplate(variable03)
              getchImitation()
            }
          }
        }
      }

      "4" -> {
        while (true) {
          clearScreen()
          pageKotlinControlFlow()

          when (readlnOrNull() ?: "999") {
            "0" -> break
            "1" -> {
              clearScreen()
              println("\t\t(4.1) Expressions & Statements")
              println("==================================")
              println("(a)\tIf Else expression\n")
              ifElseExpression(nullableName04)
              getchImitation()
            }
            "2" -> {
              clearScreen()
              println("\t\t(4.2) When Expressions")
              println("==================================")
              println("(a)\tWhen expression with single and multiple condition\n")
              whenExpression(time04)
              getchImitation()
            }
            "3" -> {
              clearScreen()
              println("\t\t(4.3) Range")
              println("==================================")
              println("(a)\tRange using double dot (..)\n")
              rangeUsingDoubleDot()
              println("(b)\tRange using rangeTo()\n")
              rangeUsingRangeTo()
              println("(c)\tRange using downTo() with step\n")
              rangeUsingDownTo()
              getchImitation()
            }
            "4" -> {
              clearScreen()
              println("\t\t(4.4) For Loop")
              println("==================================")
              println("(a)\tFor In with index\n")
              forInWithIndex()
              println("(b)\tFor Each with index\n")
              forEachWithIndex()
              getchImitation()
            }
            "5" -> {
              clearScreen()
              println("\t\t(4.5) While Loop")
              println("==================================")
              println("(a)\tWhile loop\n")
              whileLoop()
              println("(b)\tDo While loop\n")
              doWhileLoop()
              getchImitation()
            }
            "6" -> {
              clearScreen()
              println("\t\t(4.6) Break")
              println("==================================")
              println("(a)\tBreak keyword in loop\n")
              breakInLoop()
              getchImitation()
            }
            "7" -> {
              clearScreen()
              println("\t\t(4.7) Continue")
              println("==================================")
              println("(a)\tContinue keyword in loop\n")
              continueInLoop()
              getchImitation()
            }
          }
        }
      }

      "5" -> {
        while (true) {
          clearScreen()
          pageKotlinCollection()

          when (readlnOrNull() ?: "999") {
            "0" -> break
            "1" -> {
              clearScreen()
              println("\t\t(5.1) List")
              println("==================================")
              println("(a)\tImmutable List\n")
              immutableList(dataX05)
              println("(b)\tMutable List\n")
              mutableList(dataX05)
              getchImitation()
            }
            "2" -> {
              clearScreen()
              println("\t\t(5.2) Set")
              println("==================================")
              println("(a)\tImmutable Set\n")
              immutableSet(dataX05, dataY05)
              println("(b)\tMutable Set\n")
              mutableSet(dataX05)
              getchImitation()
            }
            "3" -> {
              clearScreen()
              println("\t\t(5.3) Map")
              println("==================================")
              println("(a)\tImmutable Map\n")
              immutableMap(ghostIdentity)
              println("(b)\tMutable Map\n")
              mutableMap(ghostIdentity)
              getchImitation()
            }
            "4" -> {
              clearScreen()
              println("\t\t(5.4) Collection Functions")
              println("==================================")
              println("(a)\tFilter collection\n")
              filterCollection(dataCollection05)
              println("(b)\tMap collection\n")
              mapCollection(dataCollection05)
              println("(c)\tCount collection\n")
              countCollection(dataCollection05)
              println("(d)\tFind collection\n")
              findCollection(dataCollection05)
              println("(e)\tPosition collection\n")
              positionCollection(dataCollection05)
              println("(f)\tStatistic collection\n")
              statisticCollection(dataCollection05)
              println("(g)\tSort collection\n")
              sortCollection(dataCollection05)
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
  println("\t\t(3) Kotlin Fundamental")
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

fun pageKotlinControlFlow() {
  println("\t\t(4) Kotlin Control Flow")
  println("==================================")
  println("(1)\tExpressions & Statements")
  println("(2)\tWhen Expressions")
  println("(3)\tRange")
  println("(4)\tFor Loop")
  println("(5)\tWhile Loop")
  println("(6)\tBreak")
  println("(7)\tContinue\n")
  println("(0)\tReturn to Homepage\n")
  print("Select: ")
}

fun pageKotlinCollection() {
  println("\t\t(5) Kotlin Collection")
  println("==================================")
  println("(1)\tList")
  println("(2)\tSet")
  println("(3)\tMap")
  println("(4)\tCollection Functions\n")
  println("(0)\tReturn to Homepage\n")
  print("Select: ")
}
