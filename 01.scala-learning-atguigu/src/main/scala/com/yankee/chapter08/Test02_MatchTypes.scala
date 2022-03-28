package com.yankee.chapter08

/**
 * @Description 模式匹配类型
 * @Date 2022/3/28 11:39
 * @Author yankee
 */
object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    // 1.匹配常量
    def describeConst(x: Any): String = x match {
      case 1 => "Num one"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => ""
    }

    println(describeConst("hello"))
    println("=========================================")

    // 2.匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int " + i
      case s: String => "String " + s
      case list: List[String] => "List " + list
      case array: Array[Int] => "Array " + array.mkString(",")
      case a => "Something else: " + a
    }

    println(describeType(35))
    println(describeType("hello"))
    println(describeType(List("hi", "hello")))
    println(describeType(List(1, 3, 4)))
    println(describeType(Array(1, 3, 4)))
    println(describeType(Array("hi", "hello")))
    println("=========================================")

    // 3.匹配数组
    for (arr <- List(Array(0), Array(0, 1), Array(0, 1, 0), Array(1, 1, 0), Array(2, 3, 7, 15), Array("Hello", 20,
      30))) {
      val result: String = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1, 0)"
        // 匹配两元素数组
        case Array(x, y) => s"Array(${x}, ${y})"
        case Array(0, _*) => "以0开头的数组"
        case Array(x, 1, z) => "中间为1的三元素数组"
        case _ => "Something else"
      }
      println(result)
    }
    println("=========================================")

    // 4.匹配列表
    for (list <- List(List(0), List(1, 0), List(0, 0, 0), List(1, 1, 0), List(88), List("hello"))) {
      val result: String = list match {
        case List(0) => "0"
        case List(x, y) => s"List: ${list}"
        case List(0, _*) => "以0开头的list"
        case List(a) => "只有一个元素的List：" + list
        case _ => "Something else"
      }

      println(result)
    }
    println("=========================================")

    // 4.匹配列表（运算符::）
    val list: List[Int] = List(1, 2, 5, 7, 24)
    list match {
      case first :: second :: rest => println(s"first: ${first}, second: ${second}, rest: ${rest}")
      case _ => println("Something else")
    }
    println("=========================================")

    // 5.匹配元组
    for (tuple <- List((0, 1), (0, 0), (0, 1, 0), (0, 1, 1), (1, 23, 25), ("hello", true, 0.5))) {
      val result: String = tuple match {
        case (a, b) => "" + a + ", " + b
        case (0, _) => "第一个元素是0的二元组"
        case (a, 1, _) => "中间元素是0的元素，且关心第一位元素的输出，a: " + a
        case (_, _, z: Double) => "匹配三元组，最后一位是double"
        case _ => "Something else"
      }

      println(result)
    }
    println("=========================================")
  }
}
