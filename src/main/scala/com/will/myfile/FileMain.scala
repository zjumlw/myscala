package com.will.myfile

import java.io.PrintWriter
import java.net.URL

import scala.io.{BufferedSource, Source}

object FileMain {

  def main(args: Array[String]): Unit = {
    val source: BufferedSource = Source.fromResource("myfile.txt")

//    val lineIterator: Iterator[String] = source.getLines()
//    for(l <- lineIterator) {
//      println(l)
//    }

//    val lines: Array[String] = source.getLines().toArray
//    var lineNum = 1
//    lines.foreach(line => {
//      println(s"line$lineNum: $line")
//      lineNum = lineNum + 1
//    })

    val contents: String = source.mkString
    source.close()

    val tokens = contents.split("\\s+")

    val res: Array[Int] = for (w <- tokens)
      yield w.toInt

    for (elem <- res) {
      println(elem)
    }

    val numbers: Array[Int] = tokens.map(_.toInt)
    for (elem <- numbers) {
      println(elem)
    }

    val resourcesPath = "/Users/work/workspace/scala/src/main/resources"
    println(s"resourcePath: $resourcesPath")

    val out = new PrintWriter(resourcesPath + "/numbers.txt")
    for (i <- 1 to 100) out.println(i)
    out.close()
  }

}
