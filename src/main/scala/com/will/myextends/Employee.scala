package com.will.myextends

class Employee extends Person {
  var salary: Double = 0
  override def toString: String = s"${super.toString}[salary=$salary]"
}
