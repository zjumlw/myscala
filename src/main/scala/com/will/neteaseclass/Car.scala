package com.will.neteaseclass

abstract class Car {
  val carBrand: String // 没有初始化，抽象字段
  def info() // 抽象方法
  def greeting(): Unit = {
    println("Welcome to my car")
  }

}
