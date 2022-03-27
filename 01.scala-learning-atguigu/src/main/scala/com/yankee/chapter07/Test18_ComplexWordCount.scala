package com.yankee.chapter07

/**
 * @Description 复杂版本的wordcount
 * @Date 2022/3/27 20:14
 * @Author yankee
 */
object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(
      ("hello world hbase kafka", 2),
      ("hello scala spark kafka", 3),
      ("hello world", 2),
      ("hello flink", 4)
    )

    // 思路一：直接压平，后续操作和普通版本一致
    val newStringList: List[String] = list.map(kv => {
      (kv._1 + " ") * kv._2
    })
    val resultList: List[(String, Int)] = newStringList
      .flatMap(_.split(" "))
      .groupBy(word => word)
      .map(kv => (kv._1, kv._2.length))
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(resultList)

    // 思路二：直接基于预统计的结果进行转换
    val preCountList: List[(String, Int)] = list.flatMap(data => {
      val strings: Array[String] = data._1.split(" ")
      strings.map(word => (word, data._2))
    })
    val result: List[(String, Int)] = preCountList
      .groupBy(_._1)
      .mapValues(data => data.map(_._2).sum)
      .toList
      .sortWith(_._2 > _._2)
      .take(3)
    println(result)
  }
}
