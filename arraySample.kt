import kotlin.math.pow

fun main(args: Array<String>) {
   displayBytes()
}

fun displayBytes() {
  // array of 7 elements
  // can't go bigger due to limitations of the data type
  // it is the index
  val array = Array(7) { 1024.0.pow(it) }

  val sizes = arrayOf("byte    ", "kilobyte", "megabyte", "gigabyte",
            "terabyte", "petabyte", "exabyte ")

   println("multiples of the byte unit")
   for ((i, value) in array.withIndex()) {
      println("1 ${sizes[i]} = ${value.toLong()} bytes")
  }
}
