package com.yankee.chapter06

/**
 * @Description 构造器的参数
 * @Date 2022/3/24 13:23
 * @Author yankee
 */
object Test06_ConstructorParams {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val bob = new Student2("bob", 23)
    // 无法访问主构造器的参数
    println(bob)
  }
}

class Student2(name: String, age: Int) {
  println(s"Studnet2: ${name} ${age}")
}

class Student3(var name: String, var age: Int) {
  println(s"Studnet2: ${name} ${age}")
}

class Student4(val name: String, val age: Int) {
  println(s"Studnet2: ${name} ${age}")
}

class Student5(var name: String, var age: Int) {
  var school: String = _

  def this(name: String, age: Int, school: String) {
    this(name, age)
    this.school = school
  }

  def printInfo(): Unit = {
    println(s"Student5: ${name} ${age} ${school}")
  }
}