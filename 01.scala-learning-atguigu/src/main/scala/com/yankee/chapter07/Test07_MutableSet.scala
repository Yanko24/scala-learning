package com.yankee.chapter07

import scala.collection.mutable

/**
 * @Description 可变集合
 * @Date 2022/3/26 18:31
 * @Author yankee
 */
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 1.创建可变集合
    val set1: mutable.Set[Int] = mutable.Set(12, 34, 56, 67, 12, 45, 34)
    println(set1)
    println("=====================================")

    // 2.添加元素
    set1.add(13)
    println(set1)
    set1 += 14
    println(set1)
    println("=====================================")

    // 3.删除元素
    set1.remove(13)
    println(set1)
    // 删除不存在元素，不会报错
    set1.remove(100)
    println(set1)
    println("=====================================")

    // 4.合并集合
    val set3: mutable.Set[Int] = mutable.Set(13, 12, 13, 27, 98, 29)
    println(set1)
    println(set3)
    set1 ++= set3
    println(set1)
    println("=====================================")
  }
}
