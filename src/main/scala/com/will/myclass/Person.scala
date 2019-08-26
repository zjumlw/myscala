package com.will.myclass

import scala.beans.BeanProperty

class Person(val name: String = "", val age: Int = 0) {
  def description = name + " is " + age + " years old"
}
