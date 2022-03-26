package com.yankee.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @Description 可变数组
 * @Date 2022/3/26 10:29
 * @Author yankee
 */
object Test02_Mutable {
  def main(args: Array[String]): Unit = {
    // 1.创建可变数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    // 第二种创建方式
    val arr2: ArrayBuffer[Int] = ArrayBuffer(12, 23, 45, 67, 90)
    println(arr1)
    println(arr2)
    println("======================================")

    // 2.访问数组中的元素
    // 数组下标越界
    // println(arr1(0))
    arr2(0) = 12
    println(arr2(0))
    println("======================================")

    // 3.添加元素，可变数组使用+=添加元素后，无论是否赋值给新的数组对象，其实只是引用发生了更改
    arr1.append(12, 13)
    println(arr1)
    arr1 += 14
    println(arr1)
    16 +=: arr1
    println(arr1)
    arr1.prepend(89)
    println(arr1)
    arr1.insert(1, 44)
    println(arr1)
    println("======================================")

    // 4.删除元素
    println(arr1)
    arr1.remove(0)
    println(arr1)
    arr1.remove(0, 2)
    println(arr1)
    // 按照元素值删除
    arr1 -= 12
    println(arr1)
    println("======================================")

    // 5.可变和不可变集合的转换
    val arr: Array[Int] = arr1.toArray
    println(arr)
    println(arr.mkString("Array(", ", ", ")"))
    val buffer: mutable.Buffer[Int] = arr.toBuffer
    println(buffer)
    println("======================================")
  }
}
