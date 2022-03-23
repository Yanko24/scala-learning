package com.yankee.chapter05

/**
 * @Description 匿名函数
 * @Date 2022/3/23 15:16
 * @Author yankee
 */
object Test05_Lambda {
  def main(args: Array[String]): Unit = {
    val fun = (name: String) => {
      println(name)
    }
    fun("bob")
    println("===================================")

    // 定义一个函数，以函数作为参数输入
    def f0(func: String => Unit): Unit = {
      func("bob")
    }
    f0(fun)
    f0((name: String) => {println(s"${name}在这里")})
    println("===================================")

    // 匿名函数的简化原则
    //（1）参数的类型可以省略，会根据形参进行自动的推导
    f0((name) => {
      println(name)
    })
    println("===================================")

    //（2）类型省略之后，发现只有一个参数，则圆括号可以省略；其他没有参数和参数超过1的永远不能省略圆括号
    f0(name => {
      println(name)
    })
    println("===================================")

    //（3）如果匿名函数的函数体只有一行，花括号也可以省略
    f0(name => println(name))
    println("===================================")

    //（4）如果参数只出现一次，则参数省略且后面可以用_代替，实参和=>都可以省略
    f0(println(_))
    println("===================================")

    //（5）如果可以推导出当前传入的println是一个函数体，而不是调用语句，可以直接省略_
    f0(println)
    println("===================================")


    // 示例，定义一个二元运算函数，只操作1和2两个数，具体做什么运算通过参数传入
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }
    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b
    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))
    println(dualFunctionOneAndTwo((a, b) => a / b))
    println(dualFunctionOneAndTwo(_ + _))
    println(dualFunctionOneAndTwo(-_ + _))
    println("===================================")
  }
}
