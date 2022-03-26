package com.yankee.chapter07

/**
 * @Description 多维数组
 * @Date 2022/3/26 10:54
 * @Author yankee
 */
object Test03_MulArray {
  def main(args: Array[String]): Unit = {
    // 创建二维数组
    val array: Array[Array[Int]] = Array.ofDim[Int](2, 3)

    // 2.访问二维数组的元素
    array(0)(1) = 1
    println(array(0)(1))
    println(array.mkString(","))
    for {i <- array.indices
         j <- 0 until array(i).length} {
      print(array(i)(j) + ",")
    }
    println()
    for (i <- array.indices; j <- array(i).indices) {
      print(array(i)(j) + ",")
      if (j == array(i).length - 1) println()
    }
    array.foreach(line => line.foreach(println))
    array.foreach(_.foreach(println))
  }
}
