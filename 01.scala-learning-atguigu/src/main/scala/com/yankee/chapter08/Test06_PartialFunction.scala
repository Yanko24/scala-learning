package com.yankee.chapter08

/**
 * @Description 偏函数
 * @Date 2022/3/28 15:34
 * @Author yankee
 */
object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(("a", 12), ("b", 14), ("c", 27), ("d", 13))

    // 1.map实现key不变，value*2
    val newList: List[(String, Int)] = list.map(tuple => (tuple._1, tuple._2 * 2))
    println(newList)
    println("==================================")

    // 2.使用模式匹配对元组元素赋值，实现功能
    val newList2: List[(String, Int)] = list.map(
      tuple => {
        tuple match {
          case (word, count) => (word, count * 2)
        }
      }
    )
    println(newList2)
    println("==================================")

    // 3.用lambda表达式写法就是偏函数
    val newList3: List[(String, Int)] = list.map {
      case (word, count) => (word, count * 2)
    }
    println(newList3)
    println("==================================")

    // 4.偏函数的应用：绝对值
    // 对输入数据分为不同的情形，正、负、零
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)

    println(abs(4))
    println("==================================")
  }
}
