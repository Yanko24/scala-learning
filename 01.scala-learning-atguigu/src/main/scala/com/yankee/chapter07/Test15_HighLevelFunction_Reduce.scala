package com.yankee.chapter07

/**
 * @Description 高级计算函数——Reduce
 * @Date 2022/3/27 18:02
 * @Author yankee
 */
object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4)

    //（1）规约
    println(list.reduce(_ + _))
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))
    println("======================================")

    val list2: List[Int] = List(3, 4, 5, 8, 10)
    println(list2.reduce(_ - _))
    println(list2.reduceLeft(_ - _))
    // (3 - (4 - (5 - (8 - 10))))
    println(list2.reduceRight(_ - _))
    println("======================================")

    //（2）fold
    println(list.fold(10)(_ + _))
    println(list.foldRight(10)(_ + _))
    println("======================================")
    println(list2.fold(10)(_ - _))
    println(list2.foldLeft(10)(_ - _))
    // (3 - (4 - (5 - (8 - (10 - 11)))))
    println(list2.foldRight(11)(_ - _))
    println("======================================")
  }
}
