package com.will.myobject

class Account private (val id: Int, initialBalance : Double) {
  private var balance = initialBalance
}

object Account { // 伴生对象
  private var lastNumber = 0
  private def newUniqueNumber() = {lastNumber += 1; lastNumber}
  def apply(initialBalance: Double): Account = new Account(newUniqueNumber(), initialBalance)

  def main(args: Array[String]): Unit = {
    val acct = Account(1000.0)
    println(s"balance: ${acct.balance}, number: ${acct.id}")

    val acct1 = Account(900.5)
    println(s"balance: ${acct1.balance}, number: ${acct1.id}")
  }

}
