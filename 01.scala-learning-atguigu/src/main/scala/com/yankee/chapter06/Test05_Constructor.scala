package com.yankee.chapter06

/**
 * @Description 构造器
 * @Date 2022/3/24 12:58
 * @Author yankee
 */
object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    // 创建学生对象
    val student = new Student1()
    student.Student1()
    println(student)
    println("===========================")

    val bobo = new Student1("bobo")
    bobo.Student1()
    println(bobo)
    println("===========================")

    val alice = new Student1("alice", 23)
    alice.Student1()
    println(alice)
    println("===========================")
  }
}

/**
 * 定义一个类，不写()表示主构造器没有参数
 */
class Student1 {
  // 定义属性
  var name: String = _
  var age: Int = _

  println("1. 主构造方法被调用")

  // 声明辅助构造方法
  def this(name: String) {
    // 调用构造器必须在第一行
    this()
    println("2. 辅助构造器被调用")
    this.name = name
    println(s"name: ${name}  age: ${age}")
  }

  // 辅助构造方法
  def this(name: String, age: Int) {
    this(name)
    println("3. 辅助构造器被调用")
    this.age = age
    println(s"name: ${name}  age: ${age}")
  }

  def Student1(): Unit = {
    println("普通方法被调用")
  }
}
