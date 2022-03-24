package com.yankee.chapter06

/**
 * @Description 权限访问测试
 * @Date 2022/3/24 12:40
 * @Author yankee
 */
object Test04_ClassForAccess {

}

/**
 * 父类
 */
class Person {
  private var idCard: String = "2324234"
  protected var name: String = "bob"
  var sex: String = "female"
  private[chapter06] var age: Int = 12

  def printInfo(): Unit = {
    println(s"Person: ${idCard} ${name} $age $sex")
  }
}