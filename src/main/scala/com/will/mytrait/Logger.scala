package com.will.mytrait

trait Logger {
  def log(msg: String) // 一个抽象方法
  def info(msg: String): Unit = {
    log(s"INFO: $msg")
  }
  def warn(msg: String): Unit = {
    log(s"WARN: $msg")
  }
  def severe(msg: String): Unit = {
    log(s"SEVERE: $msg")
  }
}
