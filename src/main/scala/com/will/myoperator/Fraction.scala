package com.will.myoperator

class Fraction(val n: Int, val d: Int) {
  val value: Double = 1.0 * n / d
}

object Fraction {
  def apply(n: Int, d: Int): Fraction = new Fraction(n, d)

  def unapply(arg: Fraction): Option[(Int, Int)] = {
    if (arg.d == 0) {
      None
    } else {
      Some(arg.n, arg.d)
    }
  }
}
