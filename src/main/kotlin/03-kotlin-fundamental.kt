fun changeableVariable(input: String) {
  var variable = input
  println("variable: $variable")

  variable = "NVG-064"
  println("Changed variable: $variable\n")
}

fun unchangeableVariable(input: String) {
  val variable = input
  println("Variable: $variable")

  /*
  This will trigger error:
  "Val cannot be reassigned"
   */
//  variable = "NVG-064"
  println("Due to using val, changed variable isn't showed up here\n")
}

fun charDataType(input: Char) {
  var charMe = input
  println("Character: $charMe")
  println("Increment char: ${charMe++} to $charMe")
  println("Increment char: ${++charMe} to $charMe")
  println("Decrement char: ${charMe--} to $charMe")
  println("Decrement char: ${--charMe} to $charMe\n")
}

fun stringDataType(input: String) {
  println("String: $input")
  println("String `input` on index 5: ${input[5]}")
  println("""Raw string: Simon Riley is my favorite character. Known as Ghost.
    Soap is Ghost best friend.
  """)
}

fun booleanDataType(input1: Int, input2: Int) {
  println("(input1 > input2) && ((input1 + input2) <= 20) = ${(input1 > input2).and((input1 + input2) <= 20)}\n")
}

fun numericDataType() {
  val numericFloat = 1234.23f
  val numericLong = 12345678910111213L
  println("Int max value: ${Int.MAX_VALUE}")
  println("Double max value: ${Double.MAX_VALUE}")
  println("Float value: $numericFloat")
  println("Long value: $numericLong")
  println("Short max value: ${Short.MAX_VALUE}")
  println("Byte max value: ${Byte.MAX_VALUE}\n")
}

fun arrayDataType() {
  val arrayTemp = arrayOf("Index 0", 1, 2.1, true, 'G', "Ari Candra Kusuma")

  println("Before modified: ")
  // Source:
  // https://stackoverflow.com/questions/48898102/how-to-get-the-current-index-in-for-each-kotlin
  arrayTemp.forEachIndexed { i, e -> println("[$i]: $e") }
  println("\nGet value at index 5: ${arrayTemp.get(5)}\n")

  arrayTemp[5] = "NVG-064"
  println("After modified: ")
  arrayTemp.forEachIndexed { i, e -> println("[$i]: $e") }
  println("\n")
}

fun functions() {
  val x = 12
  val y = 14

  println("Function of calculate(x, y): ${calculate(x, y)}\n")
}

fun calculate(x: Int, y: Int) = x * y

fun ifElseExpressions(name: String) {
  println("Your current name: $name\n")

  println("You're NVG-064? ${if (name.equals("NVG-064", ignoreCase = true)) "Yup. Hello, NVG-064!\n" else "Nope, you're not NVG-064. Go away!\n"}")
}

fun nullableVariable(name: String) {
  var nullableName: String? = name
  println("Your name before null: $nullableName, and the length: ${nullableName?.length}")

  nullableName = null
  println("Your name after null: $nullableName, and the length: ${nullableName?.length}\n")
}

fun avoidNullableWithIf() {
  val nullableName = null

  if (nullableName.equals(null)) {
    println("`nullableName` is null. You need to change to avoid null on output\n")
  }
}

fun safeCalls() {
  val nullableName: String? = null
  println("Length of `nullableName`: ${nullableName?.length}\n")
}

fun elvisOperators() {
  val nullableLong: Long? = null
  println("Before using elvis operator: $nullableLong")

  println("After using elvis operator: ${nullableLong ?: 1234567891000L}\n")
}

fun plusStringTemplate(name: String) {
  println("Hello, I'm " + name + ". Also known as NVG-64\n")
}

fun dollarStringTemplate(name: String) {
  println("Hello, I'm $name. Also known as NVG-064\n")
}
