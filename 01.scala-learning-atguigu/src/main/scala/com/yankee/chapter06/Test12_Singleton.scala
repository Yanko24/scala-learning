package com.yankee.chapter06

/**
 * @Description 单例设计模式
 * @Date 2022/3/24 17:30
 * @Author yankee
 */
object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    // 单例设计模式
    val student1 = Student12.getInstance()
    println(student1)
    student1.printInfo()

    val student2 = Student12.getInstance()
    println(student2)
    student2.printInfo()
  }
}

class Student12 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: name = ${name}, age = ${age}, school = ${Student12.school}")
  }
}

// 恶汉式
// object Student12 {
//   val school: String = "清华"
//
//   private val student: Student12 = new Student12("alice" ,22)
//
//   def getInstance(): Student12 = student
//
//   def apply(name: String, age: Int) = new Student12(name, age)
// }

// 懒汉式
object Student12 {
  val school: String = "清华"

  private var student: Student12 = _

  def getInstance(): Student12 = {
    if (student == null) {
      student = new Student12("alice", 22)
    }
    student
  }
}