package com.yankee.chapter07

/**
 * @Description 元组
 * @Date 2022/3/26 21:50
 * @Author yankee
 */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    // 1.元组的创建
    val tuple: (String, Int, Char, Boolean) = ("hello", 100, 'a', true)
    println(tuple)
    println("=======================================")

    // 2.访问数据
    println(tuple._1)
    println(tuple.productElement(0))
    println("=======================================")

    // 3.遍历元组数据
    for (elem <- tuple.productIterator) {
      println(elem)
    }
    println("=======================================")

    // 4.元组的嵌套
    val mulTuple: (Int, Double, String, (Int, String), Int) = (12, 0.3, "hello", (13, "scala"), 39)
    println(mulTuple._4._2)
    println("=======================================")
  }
}
