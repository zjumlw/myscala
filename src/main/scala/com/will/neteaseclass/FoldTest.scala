package com.will.neteaseclass

object FoldTest {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(list.fold(10)(_ + _))
  }
}
