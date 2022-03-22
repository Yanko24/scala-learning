package com.yankee.chapter04

/**
 * @Description 打印输出三角形
 * @Date 2022/3/22 17:57
 * @Author yankee
 */
object Test03_Practice_Pyramid {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      val starts = 2 * i - 1
      val spaces = 9 - i
      println(" " * spaces + "*" * starts)
    }
    println("===========================================")

    for (i <- 1 to 9; starts = 2 * i - 1; spaces = 9 - i) {
      println(" " * spaces + "*" * starts)
    }
    println("===========================================")

    for (starts <- 1 to 17 by 2; spaces = (17 - starts) / 2) {
      println(" " * spaces + "*" * starts)
    }
  }
}
