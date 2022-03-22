package com.yankee.chapter01

/**
 * @Description 学生类对象
 * @Date 2022/3/21 15:42
 * @Author yankee
 */
class Student(val name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + "  " + age + "  " + Student.school)
  }
}

/**
 * 引入伴生对象
 */
object Student {
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 30)
    alice.printInfo()
    bob.printInfo()
  }
}