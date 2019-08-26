package com.will.myobject

object Accounts {
  private var lastNumber = 0
  def newUniqueNumber(): Int = {
    lastNumber += 1
    lastNumber
  }

}
