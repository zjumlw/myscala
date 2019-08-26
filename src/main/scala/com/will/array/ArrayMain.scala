package com.will.array

import scala.collection.mutable.ArrayBuffer

object ArrayMain {

  def main(args: Array[String]): Unit = {
    val nums = new Array[Int](10)

    val s = Array("Hello", "World")
    for (elem <- s) {
      println(elem)
    }

    val b = ArrayBuffer[Int]()
    b += 1
    b += (1, 2, 3, 4)
    b ++= Array(5, 6, 7)

    val bb = b.toArray
    print("bb: ")
    bb.foreach(each => print(each + " "))
    println()

    val bbb = for (elem <- bb if elem % 2 == 0) yield 2 * elem

    for (i <- bbb.indices)
      println(s"$i: ${bbb(i)}")


  }



}
