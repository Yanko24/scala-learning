package com.yankee.chapter03

/**
 * @Description 运算符
 * @Date 2022/3/22 12:45
 * @Author yankee
 */
object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    // 1.算数运算符
    val result1 = 10 / 3
    println(result1)

    val result2: Double = 10 / 3.0
    println(result2.formatted("%.2f"))

    val result3 = 10.3 % 3
    println(result3)

    // 2.关系运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2)
    println(s1.equals(s2))
    println(s1.eq(s2))

    // 3.逻辑运算符
  }
}
