package com.will

object MapMain {

  def main(args: Array[String]): Unit = {
    val scores  = Map("Alice" -> 10, "Bob" -> 3, "Tom" -> 8)
    val tomScore = if (scores.contains("Tom")) scores("Tom") else 0

    println(s"tomScore: $tomScore")
  }

}
