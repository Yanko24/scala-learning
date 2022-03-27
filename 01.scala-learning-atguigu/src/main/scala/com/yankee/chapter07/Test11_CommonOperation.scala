package com.yankee.chapter07

/**
 * @Description 集合的常用操作
 * @Date 2022/3/26 23:44
 * @Author yankee
 */
object Test11_CommonOperation {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 3, 4, 5, 6, 7)
    val set: Set[Int] = Set(23, 34, 23, 44, 5)

    //（1）获取集合长度
    println(list.length)
    println("===================")

    //（2）获取集合大小
    println(set.size)
    println("===================")

    //（3）循环遍历
    for (elem <- list) {
      println(elem)
    }
    println("===================")
    set.foreach(println)
    println("===================")

    //（4）迭代器
    for (elem <- list.iterator) {
      println(elem)
    }
    println("===================")

    //（5）生成字符串
    println(list)
    println("===================")
    println(set.mkString(","))
    println("===================")

    //（6）是否包含
    println(list.contains(23))
    println("===================")
  }
}
