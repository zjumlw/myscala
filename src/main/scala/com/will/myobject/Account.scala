package com.will.myobject

class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double): Unit = {
    balance += amount
  }
}

object Account {
  private var lastNumber = 0
  private def newUniqueNumber() = {
    lastNumber += 1
    lastNumber
  }

}
