package com.will.myobject

object ObjectMain {

  def main(args: Array[String]): Unit = {
    // Array[Nothing] 包含了100个null元素
    val array = new Array[Int](100)
    println(array.length)

    val  array1 = Array(100)
    println(array1(0))
  }

}
