package com.yankee.chapter07

/**
 * @Description 不可变集合
 * @Date 2022/3/26 17:41
 * @Author yankee
 */
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 1.创建集合
    val set1: Set[Int] = Set(12, 34, 45, 45, 67)
    println(set1)
    println("=================================")

    // 2.添加元素
    val set2: Set[Int] = set1.+(20)
    val set3: Set[Int] = set1 + 20
    println(set1)
    println(set2)
    println(set3)
    println("=================================")

    // 3.合并两个集合
    val set4: Set[Int] = set2 ++ set3
    println(set2)
    println(set3)
    println(set4)
    println("=================================")

    // 4.删除元素
    val set5: Set[Int] = set3 - 20
    println(set3)
    println(set5)
    println("=================================")
  }
}
