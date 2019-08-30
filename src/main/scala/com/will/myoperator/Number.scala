package com.will.myoperator

class Number {

}

object Number {
  def unapply(input: String): Option[Int] = {
    try{
      Some(input.trim.toInt)
    } catch {
      case ex: NumberFormatException => None
    }
  }

  def main(args: Array[String]): Unit = {
    val Number(n) = "11s0"
    println(s"number: $n")

  }
}
