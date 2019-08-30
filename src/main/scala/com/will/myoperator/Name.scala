package com.will.myoperator

class Name(val name: String) {
}

object Name {
//  def unapply(input: String): Option[(String, String)] = {
//    val pos = input.indexOf(" ")
//    if (pos == -1) {
//      None
//    } else {
//      Some(input.substring(0, pos), input.substring(pos + 1))
//    }
//  }

  def unapplySeq(input: String): Option[Seq[String]] = {
    if (input.trim == "") None
    else Some(input.trim.split("\\s+"))
  }

  def main(args: Array[String]): Unit = {
    val author = "Cay John Horstman"
//    val Name(first, last) = author
//    println(s"first: $first, last: $last")

    author match {
      case Name(first, last) => println(s"first: $first, last: $last")
      case Name(first, middle, last) => println(s"first: $first, middle: $middle, last: $last")
    }
  }

}
