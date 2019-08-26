package com.will.myclass

import scala.collection.mutable.ArrayBuffer

class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def  join(name: String): Member = {
    val m = new Member(name)
    members += m
    m
  }

}
