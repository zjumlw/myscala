package com.horstmann.impatient

package object people {
  val defaultName = "John"
}

package people {
  class Person {
    var name = defaultName
  }
}
