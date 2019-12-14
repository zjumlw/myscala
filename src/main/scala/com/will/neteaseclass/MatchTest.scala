package com.will.neteaseclass

object MatchTest {
  def main(args: Array[String]): Unit = {
    val colorNum = 4
    val colorStr = colorNum match {
      case 1 => "red"
      case 2 => "yellow"
      case 3 => "green"
      case unexpected => unexpected + " is not allowed"
    }

    println(colorStr)

    List(9, 12.3, "Spark", "Hadoop", "Hello", true).foreach(elem => {
      val str = elem match {
        case i: Int => i + " is an int value"
        case d: Double => d + " is a double value"
        case "Spark" => "Spark is found"
        case s: String => s + " is a string value"
        case _ => "This is an unexpected value."
      }
      println(str)
    })

    List(1, 2, 3, 4).foreach {
      case elem if (elem % 2 == 0) => println(elem + " is even")
      case elem => println(elem + " is odd")
    }



  }
}
