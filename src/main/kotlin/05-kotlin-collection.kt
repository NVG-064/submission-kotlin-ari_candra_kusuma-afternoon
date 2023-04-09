fun immutableList(data: Array<Any>) {
  val dataList = data.toList()
  println("Data (array output): $dataList\n")
}

fun mutableList(data: Array<Any>) {
  val dataMutableList = data.toMutableList()
  println("Data before altered (array output): $dataMutableList")

  dataMutableList.remove("Task Force")
  dataMutableList.set(3, "Sandman")
  dataMutableList.add(4, "Makarov")
  println("Data after altered (array output): $dataMutableList\n")
}

fun immutableSet(data1: Array<Any>, data2: Array<Any>) {
  val dataSet1 = data1.toSet()
  val dataSet2 = data2.toSet()
  println("data1 (array output): $dataSet1")
  println("data2 (array output): $dataSet2")
  println("data1 == data2 ? ${dataSet1 == dataSet2}")
  println("Soap MacTavish exist? ${"Soap MacTavish" in dataSet1}")
  println("data1 intersect (array output): ${dataSet1 intersect dataSet2}")
  println("data1 union data2 (array output): ${dataSet1 union dataSet2}\n")
}

fun mutableSet(data: Array<Any>) {
  val dataMutableSet = data.toMutableSet()
  println("Data before altered (array output): $dataMutableSet")

  // This is unconfirmed, need to validate. Feel free to correct me:
  // Set is like a stack
  // You can remove anything inside without index,
  // but you can't add inside with index
  dataMutableSet.remove(141)
  dataMutableSet.add("Sandman")
  println("Data after altered (array output): $dataMutableSet\n")
}

fun immutableMap(data: Map<Any, Any>) {
  println("Data (object output): $data")
  println("First and last name: ${data["firstName"]} ${data["lastName"]}")
  println("Call-sign: ${data.getValue("callsign")}")
  println("Data keys (array output): ${data.keys}")
  println("Data values (array output): ${data.values}\n")
}

fun mutableMap(data: Map<Any, Any>) {
  val dataMutable = data.toMutableMap()
  println("Data before altered (object output): $dataMutable")

  dataMutable.put("accessories", "skullMask")
  dataMutable["masterCharacter"] = true
  println("Data after altered (object output): $dataMutable\n")
}

fun filterCollection(data: Array<Int>) {
  val dataList = data.toList()
  println("Data: $dataList")

  println("Odd filter: ${data.filter { it % 2 == 1 }}")
  println("Even filter: ${data.filterNot { it % 2 == 1 }}\n")
}

fun mapCollection(data: Array<Int>) {
  val dataList = data.toList()
  println("Data: $dataList")

  println("Map data to multiply 9: ${dataList.map { it * 9 }}\n")
}

fun countCollection(data: Array<Int>) {
  val dataList = data.toList()
  println("Data: $dataList")

  println("Total data: ${dataList.count()}\n")
}

fun findCollection(data: Array<Int>) {
  val dataList = data.toList()
  println("Data: $dataList")

  println("Even data (default are from first position): ${dataList.find { it % 2 == 0 }}")
  println("Odd data from first position? ${dataList.firstOrNull { it % 2 == 1 }}")
  println("Odd data from last position? ${dataList.lastOrNull { it % 2 == 1 }}\n")
}

fun positionCollection(data: Array<Int>) {
  val dataList = data.toList()
  println("Data: $dataList")

  println("First data: ${dataList.first()}")
  println("Last data: ${dataList.last()}\n")
}

fun statisticCollection(data: Array<Int>) {
  val dataList = data.toList()
  println("Data: $dataList")

  println("Sum data: ${dataList.sum()}\n")
}

fun sortCollection(data: Array<Int>) {
  val dataList = data.toList()
  println("Data: $dataList")

  println("Order by ascending: ${dataList.sorted()}")
  println("Order by descending: ${dataList.sortedDescending()}\n")
}
