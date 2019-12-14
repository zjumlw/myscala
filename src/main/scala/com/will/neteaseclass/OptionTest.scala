package com.will.neteaseclass

object OptionTest {

  def main(args: Array[String]): Unit = {
    val books = Map("hadoop" -> 1, "hbase" -> 2, "hive" -> 3)
    val value1 = books.get("hadoop")
    println(value1)

    val value2 = books.getOrElse("hdfs", "no book")
    println(value2)

    books foreach {
      case (k,v) => println(k + ": " + v)
    }

    val hbase = books.filter(_._2 == 2)
    println(hbase)

  }

}
