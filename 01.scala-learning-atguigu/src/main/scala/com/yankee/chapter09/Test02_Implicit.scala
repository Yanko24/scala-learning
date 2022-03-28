package com.yankee.chapter09

import scala.language.implicitConversions

/**
 * @Description 隐式转换
 * @Date 2022/3/28 16:16
 * @Author yankee
 */
object Test02_Implicit {
  def main(args: Array[String]): Unit = {
    // 需要自己new对象
    val new12: MyRichInt = new MyRichInt(12)
    println(new12.myMax(15))
    println("======================================")

    // 1.隐式转换函数
    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)

    println(12.myMax(15))
    println("======================================")

    // 2.隐式类
    /**
     * 自定义类
     *
     * @param self 类型Int
     */
    implicit class MyRichInt2(val self: Int) {
      /**
       * 求最大值
       *
       * @param n 比较对象
       * @return
       */
      def myMax2(n: Int): Int = if (n < self) self else n

      /**
       * 求最小值
       *
       * @param n 比较对象
       * @return
       */
      def myMin2(n: Int): Int = if (n < self) n else self
    }
    println(13.myMin2(14))
    println("======================================")

    // 3.隐式参数
    implicit val str: String = "alice"
    implicit val num: Int = 18

    def sayHello(implicit name: String): Unit = {
      println(s"hello, ${name}")
    }

    def sayHi()(implicit name: String = "bob"): Unit = {
      println(s"hello, ${name}")
    }

    sayHello
    sayHi()

    println("======================================")

    // 简便写法
    def hiAge(): Unit = {
      println(s"hi, ${implicitly[Int]}")
    }

    hiAge()
    println("======================================")
  }
}

/**
 * 自定义类
 *
 * @param self 类型Int
 */
class MyRichInt(val self: Int) {
  /**
   * 求最大值
   *
   * @param n 比较对象
   * @return
   */
  def myMax(n: Int): Int = if (n < self) self else n

  /**
   * 求最小值
   *
   * @param n 比较对象
   * @return
   */
  def myMin(n: Int): Int = if (n < self) n else self
}

