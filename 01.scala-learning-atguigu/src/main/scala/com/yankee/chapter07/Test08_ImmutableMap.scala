package com.yankee.chapter07

/**
 * @Description 不可变映射
 * @Date 2022/3/26 18:57
 * @Author yankee
 */
object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 1.创建不可变映射
    val map1: Map[String, Int] = Map("a" -> 12, "b" -> 13, "c" -> 14)
    println(map1)
    println("=====================================")

    // 2.遍历元素
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))
    println("=====================================")

    // 3.遍历映射中的key
    for (key <- map1.keys) {
      println(s"${key} ---> ${map1.get(key)}")
    }
    println("=====================================")

    // 4.访问某个key的value
    println(map1.get("a").get)
    println(map1("a"))
    // 不存在会抛出异常
    // println(map1("e"))
    println(map1.getOrElse("e", 0))
    println("=====================================")

    // 5.添加元素
    val map2: Map[String, Int] = map1 + ("d" -> 15)
    println(map1)
    println(map2)
    println("=====================================")

    // 6.删除元素
    val map3: Map[String, Int] = map1 - ("c")
    println(map1)
    println(map3)
    println("=====================================")
  }
}
