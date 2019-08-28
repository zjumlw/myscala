package com.will.mytrait

trait TimestampLogger extends Logger {
  abstract override def log(msg: String): Unit = {
    super.log(s"${java.time.Instant.now()} $msg")
  }
}
