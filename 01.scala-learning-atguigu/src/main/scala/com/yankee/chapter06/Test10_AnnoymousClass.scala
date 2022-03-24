package com.yankee.chapter06

/**
 * @Description 匿名子类
 * @Date 2022/3/24 16:40
 * @Author yankee
 */
object Test10_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    // 使用匿名子类
    val person = new Person10 {
      var name: String = "person"

      def eat(): Unit = {
        println("person eat")
      }
    }
    println(person.name)
    person.eat()
  }
}

abstract class Person10 {
  var name: String

  def eat(): Unit
}