package com.will.neteaseclass

object TestApplySingleObject {
  def apply(param1: String, param2: String): String = {
    println("apply method called")
    param1 + " and " + param2
  }

  def main(args: Array[String]): Unit = {
    val group = TestApplySingleObject("liubei", "zhangfei")
    println(group)
  }

}
