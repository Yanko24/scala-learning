package com.yankee.chapter06

/**
 * @Description 抽象类
 * @Date 2022/3/24 15:08
 * @Author yankee
 */
object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student = new Student9()
    student.eat()
    student.sleep()
  }
}

abstract class Person9 {
  // 非抽象属性
  val name: String = "person"

  // 抽象属性
  var age: Int

  // 非抽象的方法
  def eat(): Unit = {
    println("person eat")
  }

  // 抽象方法
  def sleep(): Unit
}

class Student9 extends Person9 {
  // 非抽象属性
  override val name: String = "student"

  // 抽象属性
  var age: Int = 18

  // 非抽象方法
  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }

  // 抽象方法
  def sleep(): Unit = {
    println("student sleep")
  }
}
