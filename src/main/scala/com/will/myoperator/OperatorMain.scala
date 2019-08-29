package com.will.myoperator

object OperatorMain {
  def main(args: Array[String]): Unit = {
    val fraction = Fraction(3, 4)
    val value = fraction.value

    println("value: " + value)
  }

}
