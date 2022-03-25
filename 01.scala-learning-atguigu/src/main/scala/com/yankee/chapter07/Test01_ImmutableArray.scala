package com.yankee.chapter07

/**
 * @Description 数组
 * @Date 2022/3/25 16:18
 * @Author yankee
 */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1.创建数组
    val newArray: Array[Int] = new Array[Int](5)
    // 另一种创建方式
    val arr2 = Array(12, 37, 43, 23, 39)
    println(newArray.length)
    println(arr2.length)

    // 2.访问元素
    println(newArray(0))
    newArray(0) = 1
    println(newArray(0))
    println("=================================")

    // 3.遍历元素
    // 普通for循环
    for (i <- 0 until newArray.length) {
      print(newArray(i) + " ")
    }
    println()
    for (i <- newArray.indices) {
      print(newArray(i) + " ")
    }
    println()
    // 增强for循环
    for (elem <- newArray) {
      print(elem + " ")
    }
    println()
    // 使用iterator遍历
    val iter = newArray.iterator
    while (iter.hasNext) {
      print(iter.next() + " ")
    }
    println()
    // 使用foreach方法
    newArray.foreach(print)
    println()
    // mkString
    println(newArray.mkString(" "))
    println("=================================")

    // 4.添加元素
    val arr3 = newArray.:+(99)
    println(arr3.mkString(" "))
    val arr4 = arr3.+:(10)
    println(arr4.mkString(" "))
    // 特殊语法
    val arr5 = arr4 :+ 17
    println(arr5.mkString(" "))
    val arr6 = 88 +: arr5 :+ 77
    println(arr6.mkString(" "))
    println("=================================")
  }
}
