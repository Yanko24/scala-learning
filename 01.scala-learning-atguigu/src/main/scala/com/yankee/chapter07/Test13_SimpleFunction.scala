package com.yankee.chapter07

/**
 * @Description 简单集合计算函数
 * @Date 2022/3/27 13:13
 * @Author yankee
 */
object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list1: List[Int] = List(1, 3, 5, 7, 9, 12, 43, 23)
    val list2: List[(String, Int)] = List(("a", 5), ("b", 6), ("c", 7), ("d", 2))

    //（1）求和
    println(list1.sum)
    println("===============================")

    //（2）求乘积
    println(list1.product)
    println("===============================")

    //（3）最大值、最小值
    println(list1.max)
    println(list1.min)
    println("===============================")

    //（4）排序
    println(list1.sorted)
    println("===============================")
    println(list1.sorted.reverse)
    // 传入一个隐式参数
    println(list1.sorted(Ordering[Int].reverse))
    println("===============================")
    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))
    println("===============================")
    println(list1.sortWith((a: Int, b: Int) => {a < b}))
    println(list1.sortWith(_ < _))
    println(list2.sortWith(_._2 < _._2))
    println("===============================")

    //（5）maxBy比较大小
    println(list2.maxBy((tuple: (String, Int)) => tuple._2))
    println(list2.maxBy(_._2))
    println(list2.minBy(_._2))
    println("===============================")
  }
}
