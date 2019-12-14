package com.will.neteaseclass

class Counter(name: String, mode: Int) {
  private var privateValue = 0

  def this(name: String) {
    this(name, 0)
  }

  def this() {
    this("", 0)
  }

  def value: Int = privateValue

  def value_=(newValue: Int) {
    if(newValue > 0) privateValue = newValue
  }

  def increment(step: Int): Unit = {
    value += step
  }

  def current(): Int = value

  def info(): Unit = {printf("Name:%s and mode:%d\n", name, mode)}
}


object MyCounter {
  def main(args: Array[String]): Unit = {
    val myCounter1 = new Counter
    val myCounter2 = new Counter("runner")
    val myCounter3 = new Counter("Timer", 2)

    myCounter1.info()
    myCounter1.increment(1)
    println(myCounter1.current())

    myCounter2.info()
    myCounter2.increment(2)
    println(myCounter2.current())

    myCounter3.info()
    myCounter3.increment(3)
    println(myCounter3.current())


  }
}
