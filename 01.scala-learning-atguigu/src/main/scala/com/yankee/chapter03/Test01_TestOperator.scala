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
    println("======================")

    // 2.关系运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2)
    println(s1.equals(s2))
    println(s1.eq(s2))
    println("======================")

    // 3.逻辑运算符
    def m(n: Int): Int = {
      println("m被调用")
      n
    }

    val n = 1
    println((4 > 5) && m(n) > 0)

    // 判断一个字符串是否为空
    def isNotEmpty(str: String): Boolean = {
      str != null && !"".equals(str.trim)
    }

    println(isNotEmpty(null))
    println("======================")

    // 4.赋值运算符
    var b: Byte = 10
    // 会报错，类型转换为Int
    // b += 1
    // println(b)
    var i: Int = 12
    i += 1
    println(i)
    println("======================")

    // 5.位运算符
    // 00111100
    val a: Byte = 60
    // 00001101
    val a1: Byte = 13
    // 00001100
    println(a & a1)
    // 00111101
    println(a | a1)
    // 00110001
    println(a ^ a1)
    // 11000011
    println(~a)
    // a * 2^3
    println(a << 3)
    // a / 2^2
    println(a >> 2)

    val s: Short = -13
    // 左移后右边补0
    println(s << 2)
    // 右移后高位根据符号为补齐，负数补1，正数补0
    println(s >> 2)
    println(s >>> 2)
    println("======================")

    // 6.Scala中运算符的本质
    val n1: Int = 12
    val n2: Int = 37
    println(n1 + n2)
    println(n1.+(n2))

    println(1.34.*(25))
    println((7.5 toInt) toString)
  }
}
