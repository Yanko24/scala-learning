package com.yankee.chapter05

import java.util.concurrent.locks.Condition
import scala.annotation.tailrec

/**
 * @Description 用传名参数实现while循环
 * @Date 2022/3/23 22:50
 * @Author yankee
 */
object Test12_Practice_MyWhile {
  def main(args: Array[String]): Unit = {
    var n = 10

    // 1.常规的while循环
    while (n >= 1) {
      print(s"${n}\t")
      n -= 1
    }
    println("\n========================================")

    // 2.用闭包实现一个函数，将代码块作为参数传入
    def myWhile(condition: => Boolean): (=> Unit) => Unit = {
      // 内层函数需要递归调用，参数就是循环体
      def doLoop(op: => Unit): Unit = {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }

      doLoop
    }

    n = 10
    myWhile(n >= 1) {
      print(s"${n}\t")
      n -= 1
    }
    println("\n========================================")

    // 3.用匿名函数实现
    def myWhile2(condition: => Boolean): (=> Unit) => Unit = {
      op =>
        if (condition) {
          op
          myWhile2(condition)(op)
        }
    }

    n = 10
    myWhile2(n >= 1) {
      print(s"${n}\t")
      n -= 1
    }
    println("\n========================================")


    @tailrec
    def myWhile3(condition: => Boolean)(op: => Unit): Unit = {
      if (condition) {
        op
        myWhile3(condition)(op)
      }
    }

    n = 10
    myWhile3(n >= 1) {
      print(s"${n}\t")
      n -= 1
    }
    println("\n========================================")
  }
}
