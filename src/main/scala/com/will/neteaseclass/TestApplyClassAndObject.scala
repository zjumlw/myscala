package com.will.neteaseclass

class TestApplyClassAndObject {
}

class ApplyTest {
  def apply() = println("apply method in class is called")
  def greetingOfClass: Unit = {
    println("Greeting method in class is called")
  }
}

object ApplyTest {
  def apply() = {
    println("apply method in object is called")
    new ApplyTest
  }
}

object TestApplyClassAndObject {
  def main(args: Array[String]): Unit = {
    val a = ApplyTest()
    a.greetingOfClass
    a()
  }
}