package com.yankee.chapter02

import java.io.{File, PrintWriter}
import scala.io.{BufferedSource, Source}

/**
 * @Description 文件的输入输出
 * @Date 2022/3/22 10:25
 * @Author yankee
 */
object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    // 1.从文件中读取数据
    val source: BufferedSource = Source.fromFile("01.scala-learning-atguigu/src/main/resources/test.txt")
    source.foreach(print)
    source.close()

    // 2.将数据写入文件
    val writer = new PrintWriter(new File("01.scala-learning-atguigu/src/main/resources/output.txt"))
    writer.write("hello,world from java writer")
    writer.close()
  }
}
