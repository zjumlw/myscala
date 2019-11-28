package com.will.mycollection

object ZipMain {
  def main(args: Array[String]): Unit = {
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(20, 2, 1)
    // zip交出一个对偶的列表
    val res = prices zip quantities
    println(res)

    println(res map {p => p._1 * p._2})

    val sumRes = (res map {p => p._1 * p._2}).sum
    println(sumRes)

    // 最大编码的值的对偶
    println("Scala".zipWithIndex.max)
  }

}
