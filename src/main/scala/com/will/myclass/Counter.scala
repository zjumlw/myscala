package com.will.myclass

class Counter {
  private var value = 0

  def increment(): Unit = {
    value += 1
  }

  def current: Int = value

}
