package com.will.neteaseclass

object MapTest {
  def main(args: Array[String]): Unit = {
    val books = List("Hadoop", "Hive", "HDFS")
    println(books.map(s => s.toLowerCase))
    println(books)

    println(books.flatMap(s => s.toList))
  }

}
