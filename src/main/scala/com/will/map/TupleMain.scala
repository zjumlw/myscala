package com.will.map

object TupleMain {

  def main(args: Array[String]): Unit = {
    val t = (1, 3.14, "Fred")
    println(t)

    val (first, second, third) = t
    println((first, second, third)._2)

    println("New York".partition(_.isUpper))

    val symbols = Array("<", "-", ">")
    val counts = Array(2, 10, 2)
    val pairs = symbols.zip(counts)
    for ((s, n) <- pairs) print(s * n)
    println()

    val pairMap = pairs.toMap
    println(pairMap)
  }

}
