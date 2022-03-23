package com.yankee.chapter05

/**
 * @Description 方法的定义
 * @Date 2022/3/22 21:49
 * @Author yankee
 */
object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    //（1）函数1：无参，无返回值
    def f1(): Unit = {
      println("1. 无参，无返回值")
    }
    f1()
    println(f1())
    println("==============================")

    //（2）函数2：无参，有返回值
    def f2(): Int = {
      println("2. 无参，有返回值")
      return 12
    }
    f2()
    println(f2())
    println("==============================")

    //（3）函数3：有参，无返回值
    def f3(name: String): Unit = {
      println("3. 有参，无返回值")
      println(s"${name}")
    }
    f3("bob")
    println(f3("bob"))
    println("==============================")

    //（4）函数4：有参，有返回值
    def f4(name: String): String = {
      println("4. 有参，有返回值")
      println(s"${name}")
      name
    }
    f4("bob")
    println(f4("bob"))
    println("==============================")

    //（5）函数5：多参，无返回值
    def f5(name: String, age: Int): Unit = {
      println("5. 多参，无返回值")
      println(s"${name}, ${age}")
    }
    f5("bob", 23)
    println(f5("bob", 23))
    println("==============================")

    //（6）多参，有返回值
    def f6(name: String, age: Int): String = {
      println("6. 多参，有返回值")
      println(s"${name}, ${age}")
      name
    }
    f6("bob", 24)
    println(f6("bob", 24))
    println("==============================")
  }
}
