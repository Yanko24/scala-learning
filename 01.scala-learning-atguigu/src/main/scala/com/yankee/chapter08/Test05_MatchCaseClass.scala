package com.yankee.chapter08

/**
 * @Description 匹配样例类
 * @Date 2022/3/28 15:20
 * @Author yankee
 */
object Test05_MatchCaseClass {
  def main(args: Array[String]): Unit = {
    val student: Student1 = Student1("alice", 18)

    // 针对对象内容进行匹配
    val result: String = student match {
      case Student1("alice", 18) => "Alice, 18"
      case _ => "else"
    }

    println(result)
  }
}

/**
 * 声明样例类
 *
 * @param name 姓名
 * @param age  年龄
 */
case class Student1(name: String, age: Int)