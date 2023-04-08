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


