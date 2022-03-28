package com.yankee.chapter08

/**
 * @Description 匹配元组扩展
 * @Date 2022/3/28 14:30
 * @Author yankee
 */
object Test03_MatchTubleExtend {
  def main(args: Array[String]): Unit = {
    // 1.在变量声明是匹配
    val (x, y) = (10, "hello")
    println(s"x: ${x}, y: ${y}")
    println("==============================")

    val List(first, second, _*) = List(23, 15, 9, 78)
    println(s"first: ${first}, second: ${second}")
    println("==============================")

    val fir :: sec :: rest = List(23, 15, 9, 34)
    println(s"first: ${fir}, second: ${sec}, rest: ${rest}")
    println("==============================")

    // 2.for推导式中进行模式匹配
    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 45))
    // 原本的遍历
    for (elem <- list) {
      println(elem._1 + " " + elem._2)
    }
    // 将list元素直接定义为元组，对变量赋值
    for ((word, count) <- list) {
      println(word + " " + count)
    }
    // 不考虑某个位置的变量，只遍历key或者value
    for ((word, _) <- list) {
      println(word)
    }
    // 指定某个位置的值必须是多少
    for (("a", count) <- list) {
      println(count)
    }
    println("==============================")
  }
}
