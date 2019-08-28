package com.will.mytrait

class UnhappyException extends LoggedException {
  override def getMessage: String = "arggh."
}
