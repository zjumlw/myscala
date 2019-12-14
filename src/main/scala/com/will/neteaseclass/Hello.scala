package com.will.neteaseclass

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val counter = (num: Int) => num * 2
    println(counter(1))

    // 闭包 --> 开放到封闭的过程
    var more = 1
    val addMore = (x: Int) => x + more
    println(addMore(2))

    more = 9
    println(addMore(10))

    val numList = List(1, 2, 3, 4, 5)
    numList.foreach(println(_))
  }
}
