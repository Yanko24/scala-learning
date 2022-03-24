package com.yankee.chapter06

/**
 * @Description 继承
 * @Date 2022/3/24 13:53
 * @Author yankee
 */
object Test07_InHerit {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val bob = new Student7("bob", 12, "123456")
    bob.printInfo()
  }
}

class Person7() {
  var name: String = _
  var age: Int = _

  println("1. 父类的主构造器调用")

  def this(name: String, age: Int) {
    this()
    println("2. 父类的辅助构造器被调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: ${name} ${age}")
  }
}

class Student7(name: String, age: Int) extends Person7() {
  var studnetNo: String = _

  println("3. 子类的主构造器被调用")

  def this(name: String, age: Int, studentNo: String) {
    this(name, age)
    println("4. 子类的辅助构造器调用")
    this.studnetNo = studentNo
  }

  override def printInfo(): Unit = {
    println(s"Student: ${name} ${age} ${studnetNo}")
  }
}