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

  }

}
