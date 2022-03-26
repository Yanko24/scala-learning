package com.yankee.chapter07

import scala.collection.mutable.ListBuffer

/**
 * @Description 可变列表
 * @Date 2022/3/26 14:32
 * @Author yankee
 */
object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 1.创建可变列表
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2: ListBuffer[Int] = ListBuffer(12, 23, 45)
    println(list1)
    println(list2)
    println("==============================")

    // 2.添加元素
    list1.append(10)
    list2.append(13)
    list2.prepend(15)
    list2.insert(1, 39, 55)
    list1 += 12
    println(list1)
    println(list2)
    println("==============================")

    // 3.合并list
    list1 ++= list2
    println(list1)
    println(list2)
    println("==============================")

    // 4.修改元素
    list2(3) = 30
    println(list2)
    println("==============================")

    // 5.删除元素
    list2.remove(0, 1)
    println(list2)
  }
}
