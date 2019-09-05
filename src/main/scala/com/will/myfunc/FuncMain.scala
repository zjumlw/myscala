package com.will.myfunc

import scala.math._

object FuncMain {

  def main(args: Array[String]): Unit = {
    val num = 3.14
    val fun = ceil _
    println(fun(num))

    val triple: (Double) => Double = _ * 3
    val triple1 = (x: Double) => x * 3

    val array: Array[Double] = Array(3.14, 1.42, 2.0).map(triple)
    for (elem <- array) {println(elem)}


    val f = (_: String).charAt(_: Int)
    val f1: (String, Int) => Char = _.charAt(_)

    def valueAtOneQuarter(f: Double => Double) = f(0.25)

    val res1: Double = valueAtOneQuarter(ceil)
    println(s"res1: $res1")

    val res2: Double = valueAtOneQuarter(sqrt)
    println(s"res2: $res2")
  }

  def mulBy(factor: Double) = (x: Double) => factor * x


}
