package com.will.neteaseclass

class Person {
  private val id = Person.newPersonId() // 调用伴生对象的方法
  private var name = ""
  def this(name: String) {
    this()
    this.name = name
  }
  def info(): Unit = {printf("id: %d, name:%s\n", id, name)}
}

object Person {
  private var lastId = 0
  private def newPersonId(): Int = {
    lastId += 1
    lastId
  }

  def main(args: Array[String]): Unit = {
    val person1 = new Person("mao")
    val person2 = new Person("li")
    person1.info()
    person2.info()
  }
}
