package com.yankee.chapter02

import scala.io.StdIn

/**
 * @Description 标准输入
 * @Date 2022/3/22 10:23
 * @Author yankee
 */
object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    // 输入数据
    println("请输入您的大名：")
    val name = StdIn.readLine()
    println("请输入您的芳龄：")
    val age = StdIn.readInt()

    println(s"${name}的小伙今年${age}岁")
  }
}
