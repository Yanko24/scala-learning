package com.yankee.chapter02

/**
 * @Description 类型转换的面试题
 * @Date 2022/3/22 12:32
 * @Author yankee
 */
object Test09_Problem_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    /*
    130对应的补码
    00000000 00000000 00000000 10000010

    转换成Byte截取最后一个字节：
    补码：10000010   原码：11111110
    -126
     */
    val n: Int = 130
    val b: Byte = n.toByte
    println(b)
  }
}
