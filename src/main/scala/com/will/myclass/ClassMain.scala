package com.will.myclass

object ClassMain {

  def main(args: Array[String]): Unit = {
    val myCounter = new Counter
    myCounter.increment()
    println(myCounter.current)

    val message = new Message
    println(message.timestamp)

    val person = new Person("Mao")
    println(person.description)

    val chatter = new Network
    val myFace = new Network

    val fred = chatter.join("Fred")
    val wilma = chatter.join("Wilma")
    fred.contacts += wilma
    fred.contacts += fred

    fred.contacts.foreach(member => println(member.name))

    val barney = myFace.join("Barney")
  }

}
