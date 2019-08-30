package com.will.myoperator

object OperatorMain {
  def main(args: Array[String]): Unit = {
    val fraction = Fraction(3, 4)
    val value = fraction.value

    println("value: " + value)

    val option: Option[(Int, Int)] = Fraction.unapply(fraction)
    val res: (Int, Int) = option.get
    println(res)

    val Fraction(a, b) = fraction
    println(a + ", " + b)

  }

}
