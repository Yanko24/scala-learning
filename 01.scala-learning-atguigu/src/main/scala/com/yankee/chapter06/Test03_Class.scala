package com.yankee.chapter06

import scala.beans.BeanProperty

/**
 * @Description scala中的类
 * @Date 2022/3/24 12:15
 * @Author yankee
 */
object Test03_Class {
  def main(args: Array[String]): Unit = {
    // 创建一个对象
    val student = new Student()
    // 不能访问private属性
    // student.name
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)
  }
}

/**
 * 学生类
 */
class Student {
  /**
   * 姓名
   */
  private var name: String = "alice"

  /**
   * 年龄，使用@BeanProperty注解可以让其显式的生成getXxx和setXxx方法，类似于Java中的lombok
   */
  @BeanProperty
  var age: Int = 12

  /**
   * 性别，初始值为_表示为空，如果初始值为空，则必须定义var
   */
  var sex: String = _
}