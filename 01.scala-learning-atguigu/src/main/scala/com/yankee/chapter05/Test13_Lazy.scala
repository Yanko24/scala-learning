package com.yankee.chapter05

/**
 * @Description 惰性加载
 * @Date 2022/3/23 23:14
 * @Author yankee
 */
object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(12, 18)

    println("1.函数被调用")
    println("2.result = " + result)
    println("3.result = " + result)

    def sum(a: Int, b: Int): Int = {
      println("4.sum被调用")
      a + b
    }
  }
}
