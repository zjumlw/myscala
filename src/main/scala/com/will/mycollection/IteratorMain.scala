package com.will.mycollection

object IteratorMain {
  def main(args: Array[String]): Unit = {
    val xs = List(1, 2, 3, 4, 5)
    val git = xs grouped 3
    println(git.next())
    println(git.next())

  }

}
