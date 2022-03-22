package com.yankee.chapter04

/**
 * @Description while和do...while循环
 * @Date 2022/3/22 19:04
 * @Author yankee
 */
object Test04_While {
  def main(args: Array[String]): Unit = {
    // 1.while循环
    var a: Int = 10
    while (a >= 1) {
      println("this is a while loop：" + a)
      a -= 1
    }
    println("=============")

    // 2.do...while循环
    var b: Int = 0
    do {
      println("this is a while loop：" + a)
    } while (a > 0)
  }
}
