package com.will.mytrait

import com.will.myobject.Account

object TraitMain {
  def main(args: Array[String]): Unit = {
    val savingAccount = new {
      val fileName = "my.log"
    } with SavingAccount(1, 200) with FileLogger

    savingAccount.withDraw(400)
  }


}
