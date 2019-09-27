package com.will.mycollection

import scala.collection.mutable.ArrayBuffer

object CollectionMain {

  def main(args: Array[String]): Unit = {
    val coll = Seq(1, 2, 3, 4)
    val num = List(1, 2, 3).sum
    println(s"sum: $num")

    val digits = Set(1, 7, 2, 9)
    val primes = Set(2, 3, 5, 7)
    println("union: " + digits.union(primes))
    println("intersect: " + digits.intersect(primes))
    println("diff: " + digits.diff(primes))

    println(digits | primes)

    val numbers = ArrayBuffer(1, 2, 3)
    numbers += 5
    println(s"numbers: $numbers")

    numbers += (2, 3, 4, 5)
    println(s"numbers: $numbers")

    numbers ++= Array(10, 11)
    println(s"numbers: $numbers")

  }

}
