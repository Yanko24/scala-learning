package com.yankee.chapter08

/**
 * @Description 匹配对象
 * @Date 2022/3/28 15:10
 * @Author yankee
 */
object Test04_MatchObject {
  def main(args: Array[String]): Unit = {
    val student: Student = new Student("alice", 18)
    //针对对象内容进行匹配
    val result: String = student match {
      case Student("alice", 18) => "Alice, 18"
      case _ => "else"
    }
    println(result)
  }
}

/**
 * 定义类
 *
 * @param name 姓名
 * @param age  年龄
 */
class Student(val name: String, val age: Int)

object Student {
  def apply(name: String, age: Int): Student = new Student(name, age)

  // 必须实现unapply方法，用来对对象属性进行拆解
  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null) {
      None
    } else {
      Some((student.name, student.age))
    }
  }
}