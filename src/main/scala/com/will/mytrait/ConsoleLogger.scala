package com.will.mytrait

trait ConsoleLogger extends Logger with Cloneable with Serializable {
  def log(msg: String): Unit = {
    println(msg)
  }
}
