package com.yankee.chapter05

/**
 * @Description 集合操作
 * @Date 2022/3/23 16:36
 * @Author yankee
 */
object Test07_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(12, 45, 78, 98)

    // 对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      for (elem <- array) yield op(elem)
    }

    // 定义一个+1操作
    def addOne(elem: Int): Int = {
      elem + 1
    }

    // 调用函数
    val newArray = arrayOperation(arr, addOne)
    println(newArray.mkString(","))

    // 匿名函数传入
    val newArray2 = arrayOperation(arr, _ * 2)
    println(newArray2.mkString(","))
    val newArray3 = arrayOperation(arr, elem => elem * 2)
    println(newArray3.mkString(","))
  }
}
