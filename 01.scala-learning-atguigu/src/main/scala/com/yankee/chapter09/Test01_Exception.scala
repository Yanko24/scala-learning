package com.yankee.chapter09

/**
 * @Description 异常处理
 * @Date 2022/3/28 15:53
 * @Author yankee
 */
object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val n: Int = 10 / 0
    } catch {
      case e: ArithmeticException => {
        println("发生算数异常")
      }
      case e: Exception => {
        println("发生一般异常")
      }
    } finally {
      println("处理结束")
    }
  }
}
