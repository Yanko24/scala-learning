package com.yankee.chapter05

/**
 * @Description 函数的闭包和柯里化
 * @Date 2022/3/23 21:11
 * @Author yankee
 */
object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    // 闭包
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    // 当固定加数作为另一个参数传入，但是是作为"第一层参数传入"
    def addByFour1(): Int => Int = {
      val a = 4
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    def addbyA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    // lambda表达式简写
    def addByA(a: Int): Int => Int = a + _

    println(addbyA(23)(12))
    println(addByA(23)(12))

    // 柯里化
    def addCurrying(a: Int)(b: Int): Int = a + b

    println(addCurrying(12)(12))
  }
}
