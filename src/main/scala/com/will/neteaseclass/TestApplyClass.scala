package com.will.neteaseclass

class TestApplyClass {
  def apply(param: String): String = {
    println("apply method called, parameter is: " + param)
    "Hello world!"
  }
}

object TestApplyClass {
  def main(args: Array[String]): Unit = {
    val myObject = new TestApplyClass
    println(myObject("param1"))


    val array = Array("Tom", "Jerry")
    array(0) = "Jack"
    println(array)
  }
}
