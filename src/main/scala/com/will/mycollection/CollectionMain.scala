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

    val names = List("Peter", "Paul", "Array")
    val namesUpperCase = names.map(_.toUpperCase())
    println(s"names: $names")
    println(s"namesUpperCase: $namesUpperCase")

    println("reduceLeft: " + digits.reduceLeft(_ - _))
    println("reduceRight: " + digits.reduceRight(_ - _))

    println(Vector(1, 2, 3) :+ 5)
    println(1 +: Vector(1, 2, 3) :+ 5)

  }

  def ulcase(s: String) = Vector(s.toUpperCase(), s.toLowerCase())

}
