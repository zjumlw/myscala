package com.will.map

object MapMain {

  def main(args: Array[String]): Unit = {
    var scores  = Map("Alice" -> 10, "Bob" -> 3, "Tom" -> 8)
    val tomScore = if (scores.contains("Tom")) scores("Tom") else 0

    println(s"tomScore: $tomScore")

    val bobScore = scores.getOrElse("Bob", 0)
    println(s"bobScore: $bobScore")

    scores += ("Jack" -> 12)
    scores -= "Alice"

    val aliceScore = scores.getOrElse("Alice", 0)
    println(s"aliceScore: $aliceScore")

    for ((k, v) <- scores) {
      println(s"k: $k, v: $v")
    }

    println(scores)
    println(scala.collection.mutable.SortedMap("Bob" -> 3, "Alice" -> 10, "Tom" -> 8))
  }

}
