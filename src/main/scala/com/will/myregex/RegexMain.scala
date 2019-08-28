package com.will.myregex

object RegexMain {
  def main(args: Array[String]): Unit = {
    val numberPattern = "[0-9]+".r
    for (matchString <- numberPattern.findAllIn("99 bottles, 98 people")) {
      println(matchString)
    }
  }

}
