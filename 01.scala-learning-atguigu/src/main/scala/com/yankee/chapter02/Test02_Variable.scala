package com.yankee.chapter02

import com.yankee.chapter01.Student

/**
 * @Description 变量和常量的语法
 * @Date 2022/3/21 16:44
 * @Author yankee
 */
object Test02_Variable {
  def main(args: Array[String]): Unit = {
    // 声明一个变量通用语法
    var a: Int = 10
    //（1）声明变量时，类型可以省略，编译器自动推导，即类型推导
    var b = 11
    println(b.getClass)
    val b1 = 12

    //（2）类型确定后，就不能修改，说明Scala是强数据类型语言
    var c = 12
    println("c的类型是：" + c.getClass)
    // 以下内容会报错
    // c = "Hello"

    //（3）变量声明后，必须要有初始值
    // var d: Int

    //（4）在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修改的变量不可改
    var e = 23
    e = 25
    println("e的值是：" + e)

    // Student
    var alice = new Student("alice", 20)
    alice = new Student("Alice", 20)
    alice = null
    // 对象的属性定义为var可以进行修改，如果不定义val或var，就只会有构造方法存在
    val bob = new Student("bob", 30)
    bob.age = 23
    bob.printInfo()
  }
}
