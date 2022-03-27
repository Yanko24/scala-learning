package com.yankee.chapter07

import scala.collection.mutable

/**
 * @Description map练习
 * @Date 2022/3/27 19:58
 * @Author yankee
 */
object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1: Map[String, Int] = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2: mutable.Map[String, Int] = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)

    println(map1 ++ map2)
    println("==========================")

    val map3: mutable.Map[String, Int] = map1.foldLeft(map2)((megredMap, kv) => {
      val key: String = kv._1
      val value: Int = kv._2
      megredMap(key) = megredMap.getOrElse(key, 0) + value
      megredMap
    })
    println(map3)
    println("==========================")
  }
}
