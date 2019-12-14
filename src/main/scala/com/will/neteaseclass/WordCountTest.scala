package com.will.neteaseclass

import java.io.File

import scala.collection.immutable.ListMap
import scala.io.Source

object WordCountTest {
  def main(args: Array[String]): Unit = {
    val dirPath = "/home/will/tmp/wordcount"
    val filePath = new File(dirPath)
    val files = filePath.listFiles
    for (file <- files) println(file)
    val listFiles = files.toList
    val wordsMap = scala.collection.mutable.Map[String, Int]()

    listFiles.foreach(file => Source.fromFile(file).getLines()
      .foreach(line => line.split("")
        .foreach(word =>
          if (wordsMap.contains(word)) {
            wordsMap(word) += 1
          } else {
            wordsMap += (word -> 1)
          })))

    println(wordsMap)
    wordsMap.foreach(kv => println(kv._1 + ": " + kv._2))

    val map = ListMap(wordsMap.toSeq.sortWith(_._2 > _._2):_*)
    println(map)





  }

}
