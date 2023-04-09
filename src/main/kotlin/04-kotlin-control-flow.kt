fun ifElseExpression(name: String?) {
  println("Your name: ${if (name?.length == null) "no name" else "$name"}\n")
}

fun whenExpression(time: Int) {
  println("Your time: $time (in 24 hrs format)")
  println("Your time: ${
    when (time) {
      0 -> "${time + 12} A.M."
      1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 -> "$time A.M."
      12 -> "$time P.M."
      13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 -> "${time - 12} P.M."
      else -> "invalid time"
  } } (in 12 hrs format)\n")
}

fun rangeUsingDoubleDot() {
  val gradeRange = 'a'..'e'
  print("Grade: ")
  gradeRange.forEach {
      e -> print("$e ")
    if (e == gradeRange.last) println("\n")
  }
}

fun rangeUsingRangeTo() {
  val gradeRange = 'a'.rangeTo('e')
  print("Grade: ")
  gradeRange.forEach {
      e -> print("$e ")
    if (e == gradeRange.last) println("\n")
  }
}

fun rangeUsingDownTo() {
  val gradeRange = 'e'.downTo('a') step 2
  print("Grade: ")
  gradeRange.forEach {
      e -> print("$e ")
    if (e == gradeRange.last) println("\nStep: ${gradeRange.step}\n")
  }
}

fun forInWithIndex() {
  val taskForce141 = arrayOf("Simon \"Ghost\" Riley", "Soap MacTavish", "Price")

  println("Task 141")
  for ((i, e) in taskForce141.withIndex()) {
    println("${i + 1}: $e")
    if (i == taskForce141.lastIndex) {
      print("\n")
    }
  }
}

fun forEachWithIndex() {
  val taskForce141 = arrayOf("Simon \"Ghost\" Riley", "Soap MacTavish", "Price")

  println("Task 141")
  taskForce141.forEachIndexed {
      i, e -> println("${i + 1}: $e")
    if (i == taskForce141.lastIndex) print("\n")
  }
}

fun whileLoop() {
  var member = 0

  while (member > 0) {
    println("Current index member: $member")
    member--
  }
  println("Nothing, right? Because it's always false\n")
}

fun doWhileLoop() {
  var member = 0

  do {
    println("Current index member: $member")
    member--
  } while (member > 0)
  print("\n")
}

fun breakInLoop() {
  val primeNumber = arrayOf(2, 3, null, 5, null, 7, null, null, 11, null, 13, null, null)

  print("Prime number: ")
  for (e in primeNumber) {
    if (e == null) break
    print("$e ")
  }
  println("\n")
}

fun continueInLoop() {
  val primeNumber = arrayOf(2, 3, null, 5, null, 7, null, null, 11, null, 13, null, null)

  print("Prime number: ")
  for (e in primeNumber) {
    if (e == null) continue
    print("$e ")
  }
  println("\n")
}
