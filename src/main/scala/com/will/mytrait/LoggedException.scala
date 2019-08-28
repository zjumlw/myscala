package com.will.mytrait

trait LoggedException extends Exception with ConsoleLogger {
  def log(): Unit = {
    log(getMessage)
  }

}
