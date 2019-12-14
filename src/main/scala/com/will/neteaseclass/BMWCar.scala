package com.will.neteaseclass

class BMWCar extends Car {
  override val carBrand: String = "BMW"

  override def info(): Unit = {
    println("This is a %s car", carBrand)
  }

  override def greeting() {
    println("Welcome to my BMW car")
  }
}
