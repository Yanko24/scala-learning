package com.yankee.chapter07

/**
 * @Description wordcount
 * @Date 2022/3/27 20:07
 * @Author yankee
 */
object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {
    val list: List[String] = List("hello world hbase kafka", "hello scala spark kafka", "hello world", "hello flink")

    // 对字符串进行切分压平
    val words: List[String] = list.flatMap(_.split(" "))

    // 分组统计
    val groupList: Map[String, List[String]] = words.groupBy(word => word)

    // 统计个数
    val countMap: Map[String, Int] = groupList.map(kv => (kv._1, kv._2.length))

    // 根据count进行排序
    val sortedList: List[(String, Int)] = countMap.toList

    // 取前三
    val result: List[(String, Int)] = sortedList.sortWith(_._2 > _._2).take(3)

    println(result)
  }
}
