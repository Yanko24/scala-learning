package com.yankee.chapter07

import javafx.print.Printer

/**
 * @Description 衍生集合
 * @Date 2022/3/27 12:04
 * @Author yankee
 */
object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1: List[Int] = List(1, 3, 5, 7, 9, 89)
    val list2: List[Int] = List(3, 7, 9, 45, 4, 19)

    //（1）获取集合的头
    println(list1.head)
    println("==============================")

    //（2）获得集合的位
    println(list1.tail)
    println("==============================")

    //（3）集合最后一个元素
    println(list1.last)
    println("==============================")

    //（4）集合初始元素
    println(list1.init)
    println("==============================")

    //（5）反转
    println(list1)
    println(list1.reverse)
    println("==============================")

    //（6）取前（后）n个元素
    println(list1)
    println(list1.take(2))
    println(list1.takeRight(2))
    println("==============================")

    //（7）去除前（后）n个元素
    println(list1)
    println(list1.drop(2))
    println(list1.dropRight(2))
    println("==============================")

    //（8）并集、交集、差集
    println(list1)
    println(list2)
    println(list1.union(list2))
    println(list1.intersect(list2))
    println(list1.diff(list2))
    println("==============================")

    //（9）拉链
    println(list1)
    println(list2)
    println(list1.zip(list2))
    println("==============================")

    //（10）滑窗
    println(list1)
    println(list2)
    println(list1.sliding(2).toArray.mkString("Array(", ", ", ")"))
    println(list1.sliding(2, 2).toArray.mkString("Array(", ", ", ")"))
    println("==============================")
  }
}
