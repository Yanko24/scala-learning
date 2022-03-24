package com.yankee.chapter06

/**
 * @Description 权限访问测试
 * @Date 2022/3/24 12:40
 * @Author yankee
 */
object Test04_Access {
  def main(args: Array[String]): Unit = {
    // 创建Person对象
    val person = new Person()
    // 私有属性无法访问
    // person.idCard
    // protected受保护权限只能在同类或者子类中访问
    // println(person.name)
    println(person.age)
    println(person.sex)

    person.printInfo()

    // 创建一个Worker对象
    val worker = new Workers()
    worker.printInfo()
  }
}

/**
 * 子类
 */
class Workers extends Person {
  override def printInfo(): Unit = {
    name = "bobo"
    age = 23
    sex = "male"
    println(s"Worker: ${name} ${age} ${sex}")
  }
}