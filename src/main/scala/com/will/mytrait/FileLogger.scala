package com.will.mytrait

import java.io.PrintWriter

trait FileLogger extends Logger {
  val fileName: String
  val out = new PrintWriter(fileName)
  out.println(s"# ${java.time.Instant.now()}")

  override def log(msg: String): Unit = {
    out.println(msg)
    out.flush()
  }

}
