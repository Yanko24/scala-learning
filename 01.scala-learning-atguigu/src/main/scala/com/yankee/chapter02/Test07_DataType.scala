package com.yankee.chapter02

import com.yankee.Student

/**
 * @Description 数据类型
 * @Date 2022/3/22 10:58
 * @Author yankee
 */
object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // 1.整数类型
    val a1: Byte = 127
    val a2: Byte = -128
    // 整数默认类型是Int
    val a3 = 12
    val a4 = 123213414143L

    val b1: Byte = 10
    // IDEA会报错，但是实际运行不报错
    // val b2: Byte = 10 + 20
    // println(b2)

    // 运行时才会知道b1的值和20做运算
    // val b3: Byte = b1 + 20
    val b3: Byte = (b1 + 20).toByte
    println(b3)

    // 2.浮点类型
    // 默认是Double
    val f1 = 1.23234
    val f2 = 23423.23423F

    // 3.字符类型
    val c1: Char = 'a'
    println(c1)

    val c2 = '9'
    println(c2)
    println(c2.getClass)

    val c3: Char = '\t'
    val c4: Char = '\n'
    println("abc" + c3 + "def")
    println("abc" + c4 + "def")

    // 转义字符
    val c5 = '\\'
    val c6 = '\"'
    println(c5)
    println(c6)

    // 字符变量底层保存的是ASCII码
    val i1: Int = c1
    println("i1: " + i1)
    val i2: Int = c2
    println("i2: " + i2)

    val c7: Char = (i1 + 1).toChar
    println(c7)
    val c8: Char = (i2 - 1).toChar
    println(c8)

    // 4.布尔类型
    val isTrue: Boolean = true
    println(isTrue)

    // 5.空类型
    // 5.1 空值Unit
    def m1(): Unit = {
      println("m1被调用执行")
    }

    val a: Unit = m1()
    println(a)

    // 5.2 空引用Null
    // val n: Int = null
    var student = new Student("alice", 20)
    student = null
    println(student)

    // 5.3 Nothing
    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException
      else
        return n
    }

    val b: Int = m2(0)
    println(b)
  }
}
