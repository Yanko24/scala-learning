package com.yankee.chapter01

/**
 * @Description HelloWorld
 * @Date 2022/3/21 15:14
 * @Author yankee
 *
 * object：关键字，声明一个单例对象（伴生对象）
 */
object HelloWorld {
  /**
   * main方法：从外部可以直接调用执行的方法
   * def 方法名称(参数名称: 参数类型): 返回值类型 = { 方法体 }
   * @param args 参数
   */
  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }
}
