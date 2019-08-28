package com.will.mytrait

import com.will.myobject.Account

class SavingAccount(id: Int, balance: Double) extends Account(id, balance) with ConsoleLogger with ShortLogger {
  override def log(msg: String): Unit = ???

  def withDraw(amount: Double): Unit = {
    if (amount > balance) severe("Insufficient funds")
  }

  override val maxLength: Int = 20
}
