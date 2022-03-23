package com.yankee.chapter05

/**
 * @Description 函数至简原则
 * @Date 2022/3/23 11:07
 * @Author yankee
 */
object Test04_Simplify {
  def main(args: Array[String]): Unit = {
    def f0(name: String, age: Int): String = {
      return s"${age}岁的${name}在学习Scala"
    }
    println(f0("bob", 23))
    println("0 =============================================")

    //（1）return可以省略，Scala会使用函数体的最后一行代码作为返回值
    def f1(name: String, age: Int): String = {
      s"${age}岁的${name}在学习Scala"
    }
    println(f1(age = 22, name = "alice"))
    println("1 =============================================")

    //（2）如果函数体只有一行代码，可以省略花括号
    def f2(name: String, age: Int): String = s"${age}岁的${name}在学习Scala"
    println(f2("bob", 24))
    println("2 =============================================")

    //（3）返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起省略）
    def f3(name: String, age: Int) = s"${age}岁的${name}在学习Scala"
    println(f3(age = 26, name = "alice"))
    println("3 =============================================")

    //（4）如果有return，则不能省略返回值类型，必须指定
    // 返回值String必须指定
    def f4(name: String, age: Int): String = {
      return s"${age}岁的${name}在学习Scala"
    }
    println(f4(age = 24, name = "tom"))
    println("4 =============================================")

    //（5）如果函数明确声明Unit，那么即使函数体中使用return关键字也不起作用
    def f5(name: String, age: Int): Unit = {
      return s"${age}岁的${name}在学习Scala"
    }
    println(f5(age = 27, name = "bob"))
    println("5 =============================================")

    //（6）Scala如果期望时无返回值类型，可以省略等号
    def f6(name: String, age: Int) {
      s"${name}岁的${name}在学习Scala"
    }
    println(f6("tom", 22))
    println("6 =============================================")

    //（7）如果函数无参，但是声明了参数列表，那么调用时，小括号可加可不加
    def f7() = println("Hello, World!")
    println(f7)
    println(f7())
    println("7 =============================================")

    //（8）如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8() = println("Hello, World!")
    println(f8)
    println("8 =============================================")

    //（9）如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
    // 匿名函数，或者lambda表达式
    (name: String, age: Int) => println(s"${age}岁的${name}在学习Scala")
    println("9 =============================================")
  }
}
