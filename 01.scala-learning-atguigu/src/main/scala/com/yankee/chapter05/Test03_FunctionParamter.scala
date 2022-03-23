package com.yankee.chapter05

/**
 * @Description 函数的参数
 * @Date 2022/3/23 10:21
 * @Author yankee
 */
object Test03_FunctionParamter {
  def main(args: Array[String]): Unit = {
    //（1）可变参数
    def f1(str: String*): Unit = {
      println(str)
    }
    f1("alice")
    f1("aaa", "bbb", "ccc")
    println("===================================")

    //（2）如果参数列表中存在多个参数，那么可变餐素一般放置在最后
    def f2(str1: String, str2: String*): Unit = {
      println("str1: " + str1 + " str2: " + str2)
    }
    f2("alice")
    f2("alice", "bob", "tom")
    println("===================================")

    //（3）参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(name: String = "alice"): Unit = {
      println(s"my name is ${name}")
    }
    f3("yankee")
    f3()
    println("===================================")

    //（4）带名参数
    def f4(name: String, age: Int): Unit = {
      println(s"${age}岁的${name}在学习Scala")
    }
    f4("alice", 24)
    f4(age = 22, name = "bob")
  }
}
