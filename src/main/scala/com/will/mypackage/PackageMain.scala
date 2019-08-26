package com.will.mypackage

import com.horstmann.impatient.Employee
import com.horstmann.impatient.people.Person
import net.bigjava.Counter

object PackageMain {

  def main(args: Array[String]): Unit = {
    val employee = new Employee(18000)
    employee.giveRaise(20)
    println(employee.salary)

    val count = new Counter

    val person = new Person
    println(person.name)
  }

}
