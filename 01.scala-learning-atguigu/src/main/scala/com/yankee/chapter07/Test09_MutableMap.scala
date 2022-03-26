package com.yankee.chapter07

import scala.collection.mutable

/**
 * @Description 可变的映射
 * @Date 2022/3/26 21:36
 * @Author yankee
 */
object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    // 1.创建可变集合
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 12, "b" -> 13)
    println(map1)
    println("=========================================")

    // 2.遍历
    map1.foreach(println)
    println("=========================================")

    // 3.添加元素
    map1 += ("c" -> 14)
    map1 += (("e", 16))
    map1.put("d", 15)
    println(map1)
    println("=========================================")

    // 4.修改元素
    map1.update("e", 17)
    println(map1)
    println("=========================================")

    // 5.删除元素
    map1 -= ("d")
    map1.remove("c")
    println(map1)
    println("=========================================")

    // 6.映射之间的操作
    val map2: mutable.Map[String, Int] = mutable.Map("f" -> 17, "g" -> 19)
    println(map1)
    println(map2)
    // 合并两个映射
    map1 ++= map2
    println(map1)
    println("=========================================")
  }
}
