package com.yankee.chapter05

import scala.annotation.tailrec

/**
 * @Description 递归函数
 * @Date 2022/3/23 22:14
 * @Author yankee
 */
object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    // 递归函数：一个函数/方法在方法体内部又调用了函数自身，称之为递归调用
    def fact(n: Int): Int = {
      if (n == 0) return 1
      fact(n - 1) * n
    }

    println(fact(5))

    // 尾递归调用
    def tailFact(n: Int): Int = {
      @tailrec
      def loop(n: Int, currResult: Int): Int = {
        if (n == 0) return currResult
        loop(n - 1, currResult * n)
      }
      loop(n, 1)
    }
    println(tailFact(5))
  }
}
