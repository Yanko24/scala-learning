package com.yankee.chapter05

/**
 * @Description 函数的高阶用法
 * @Date 2022/3/23 15:51
 * @Author yankee
 */
object Test06_HighOrderFuncton {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f函数被调用")
      n + 1
    }

    val result = f(123)
    println(result)
    println("==========================")

    // 1.函数可以作为值进行传递
    val f1 = f _
    val f2: Int => Int = f
    println(f1)
    println(f1(100))
    println(f2)
    println(f2(100))
    println("==========================")

    // 2.函数可以作为参数进行传递
    // 定义一个二元运算函数
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = a + b

    def minus(a: Int, b: Int) = a - b

    println(dualEval(add, 1, 2))
    println(dualEval(minus, 1, 2))
    println(dualEval(_ + _, 1, 2))
    println("==========================")

    // 3.函数可以作为函数的返回值返回
    def f5(): (Int => Unit) = {
      def f6(a: Int): Unit = {
        println("f6调用 " + a)
      }
      // 函数直接返回，如果没有声明外层函数的返回值类型，那么返回时要写：f6 _
      // f6 _
      f6
    }

    // 此时返回函数的引用地址
    println(f5())
    // 此时返回内部函数的调用结果
    println(f5()(23))
    println("==========================")
  }
}
