package com.yankee.chapter05

/**
 * @Description 高阶函数连接
 * @Date 2022/3/23 20:35
 * @Author yankee
 */
object Test08_Practice {
  def main(args: Array[String]): Unit = {
    // 1.练习一
    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false
      else true
    }

    println(fun)
    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println("==================================")

    // 2.练习二
    def func(i: Int): String => Char => Boolean = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          !(i == 0 && s == "" && c == '0')
        }
        f2
      }
      f1
    }

    println(func(0)("")('0'))
    println("==================================")

    // 匿名函数简化
    def func1(i: Int): String => Char => Boolean = {
      s => c => !(i == 0 && s == "" && c == '0')
    }

    println(func1(0)("")('0'))
    println("==================================")

    // 函数柯里化
    def func2(i: Int)(s: String)(c: Char): Boolean = {
      !(i == 0 && s == "" && c == '0')
    }

    println(func2(0)("")('0'))
    println("==================================")
  }
}
