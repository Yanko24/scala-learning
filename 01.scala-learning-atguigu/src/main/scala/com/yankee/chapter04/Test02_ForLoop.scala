package com.yankee.chapter04

import scala.collection.immutable

/**
 * @Description for循环
 * @Date 2022/3/22 16:32
 * @Author yankee
 */
object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    // java for语法：for(int i = 0; i < 10; i++) {System.out.println(i + ". Hello,World");}
    // 1.范围遍历
    for (i <- 1 to 10) {
      println(i + ". Hello, World!")
    }
    println("================")
    for (i <- 1 until 10) {
      println(i + ". Hello, World!")
    }
    println("================")
    for (i <- 1 to 10 by 2) {
      println(i + ". Hello, World!")
    }
    println("================")
    for (i <- Range(1, 10)) {
      println(i + ". Hello, World!")
    }
    println("================")
    // 集合遍历
    for (i <- Array(12, 34, 22, 43)) {
      println(i)
    }
    println("================")
    for (i <- 1 to 10 reverse) {
      println(i)
    }
    println("================")
    for (i <- 1.0 to 10.0 by 0.5) {
      println(i)
    }
    println("================")

    // 5.嵌套迭代器
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$j * $i = ${i * j} \t")
      if (j == i) println()
    }
    println("================")

    // 6.迭代器哨卫
    for (i <- 1 to 10 if i % 3 == 0) {
      println(i)
    }
    println("================")

    for (i <- 1 to 10) {
      if (i % 3 == 0) {
        println(i)
      }
    }
    println("================")

    // 7.值绑定
    for (i <- 1 to 10; pow = 1 << i) {
      println("i = " + i + ", pow = " + pow)
    }
    println("================")

    // yield
    val seq: immutable.IndexedSeq[Int] = for (i <- 1 to 10; pow = 1 << i) yield pow
    println(seq)
  }
}
