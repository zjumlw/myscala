package com.will

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello")
    println(fac(5))
    println("Hello")

    println(decorate("World"))

    println("sum: " + sum(1, 4, 6))
    println("sum: " + sum(1 to 10: _*))

    println("recursiveSum: " + recursiveSum(5 to 10: _*))

    box("HelloWorld")

  }

  def fac(n: Int): Int = {
    var r = 1
    for (i <- 1 to n)
      r = r * i
    r
  }

  def decorate(str: String, left: String = "[", right: String = "]"): String = {
    left + str + right
  }

  def sum(args: Int*): Int = {
    var result = 0
    for (arg <- args) {
      result += arg
    }
    result
  }

  def recursiveSum(args: Int*) : Int = {
    if(args.isEmpty) 0
    else args.head + recursiveSum(args.tail: _*)
  }

  def box(s: String): Unit = {
    val border = "-" * (s.length + 2)
    print(f"$border%n|$s|%n$border%n")
  }
}
