package com.yankee.chapter08

/**
 * @Description match模式匹配的基本语法
 * @Date 2022/3/28 11:16
 * @Author yankee
 */
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    // 1.基本定义语法
    val x: Int = 2
    val y: String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)
    println("====================================")

    // 2.示例：用模式匹配实现简单的二元运算
    val a: Int = 25
    val b: Int = 13
    def matchDualOp(op: Char): Int = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case _ => -1
    }
    println(matchDualOp('+'))
    println(matchDualOp('/'))
    println("====================================")

    // 3.模式守卫（模式哨卫）
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }
    println(abs(12))
    println(abs(-2))
    println("====================================")
  }
}
