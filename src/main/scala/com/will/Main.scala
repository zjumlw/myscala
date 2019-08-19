package com.will

object Main {

  def main(args: Array[String]): Unit = {
    println("Hello")
    println(fac(5))
    println("Hello")

    println(decorate("World"))

    println("sum: " + sum(1, 4, 6))
    println("sum: " + sum(1 to 10: _*))


  }

  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n)
      r = r * i
    r
  }

  def decorate(str: String, left: String = "[", right: String = "]") = {
    left + str + right
  }

  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) {
      result += arg
    }
    result
  }
}
