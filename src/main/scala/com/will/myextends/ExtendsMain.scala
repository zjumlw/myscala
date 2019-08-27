package com.will.myextends

object ExtendsMain {
  def main(args: Array[String]): Unit = {
    val person = new Person
    println(person)

    person.setName("Tom")
    println(person)

    val employee = new Employee
    println(employee)

    show(3)
    show(3, 4, 5)
    show()
  }

  def show(o: Any): Unit = {
    println(s"${o.getClass}: $o")
  }

}
