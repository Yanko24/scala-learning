package com.yankee.chapter07

/**
 * @Description 高级计算函数——Map
 * @Date 2022/3/27 15:34
 * @Author yankee
 */
object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //（1）过滤
    // 偶数
    println(list.filter(_ % 2 == 0))
    println("==============================")

    //（2）map操作
    println(list.map(_ * 2))
    println("==============================")

    //（3）flatten
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))
    println(nestedList.head ::: nestedList(1) ::: nestedList(2))
    println(nestedList.flatten)
    println("==============================")

    //（4）flatMap
    // 将一组字符串进行分词，并保存成单词的列表
    val strings: List[String] = List("hello world", "hello scala", "hello flink")
    println(strings.flatMap(_.split(" ")))
    println("==============================")

    //（5）group
    val groupList: Map[Int, List[Int]] = list.groupBy(_ % 2)
    println(groupList)
    val groupList2: Map[String, List[Int]] = list.groupBy(data => {
      if (data % 2 == 0) "偶数" else "奇数"
    })
    println(groupList2)
    println("==============================")
    // 给定一组词汇，根据单词首字母分组
    val wordList: List[String] = List("china", "america", "alice", "canada", "cary", "bob", "japen")
    println(wordList.groupBy(_.charAt(0)))
    println("==============================")
  }
}
