package com.will.myextends

import scala.beans.BeanProperty

class Person(@BeanProperty var name: String = "Mao") {
  override def toString: String = s"${getClass.getName}[name=$name]"
}
