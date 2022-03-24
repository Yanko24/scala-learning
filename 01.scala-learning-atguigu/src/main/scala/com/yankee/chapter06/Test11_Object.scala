package com.yankee.chapter06

/**
 * @Description 伴生类和伴生对象
 * @Date 2022/3/24 17:15
 * @Author yankee
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {
    // 主构造器私有化
    // val student = new Student11("alice", 23)
    // student.printInfo()

    // 伴生对象
    val student = Student11.newStudent("alice", 22)
    student.printInfo()

    val student2 = Student11.apply("bob", 23)
    student2.printInfo()

    val student3 = Student11("tom", 12)
    student3.printInfo()
  }
}

class Student11 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"Student: name = ${name}, age = ${age}, school = ${Student11.school}")
  }
}

object Student11 {
  val school: String = "清华"

  // 定义一个类的对象实例的创建方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}
