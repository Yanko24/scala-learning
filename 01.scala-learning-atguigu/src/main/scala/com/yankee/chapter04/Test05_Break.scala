package com.yankee.chapter04

import scala.util.control.Breaks

/**
 * @Description 循环中断
 * @Date 2022/3/22 19:09
 * @Author yankee
 */
object Test05_Break {
  def main(args: Array[String]): Unit = {
    // 1.采用异常捕获的方法，退出循环
    try {
      for (i <- 0 until 5) {
        if (i == 3) {
          throw new RuntimeException
        }
        println(i)
      }
    } catch {
      // 什么都不做，只是退出循环
      case e: Exception =>
    }
    println("这是循环外的代码")

    // 2.使用Breaks.break方法，可以实现异常的抛出和捕获
    Breaks.breakable(
      for (i <- 0 until 5) {
        if (i == 3) Breaks.break()
        println(i)
      }
    )
  }
}
